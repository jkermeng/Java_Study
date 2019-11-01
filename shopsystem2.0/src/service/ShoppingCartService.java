package service;

import java.util.List;

import dao.imp.GoodsDaoIpm;
import dao.imp.ShoppingCartDaoImp;
import enmus.RespondRuslt;
import enmus.Status;
import entity.Goods;
import entity.ShoppingCart;
import idao.Daos;

public class ShoppingCartService {
	private Daos<ShoppingCart> shopDao;
	private Daos<Goods> goodsDao;

	public ShoppingCartService() {
		shopDao = new ShoppingCartDaoImp();
		goodsDao = new GoodsDaoIpm();// ����������Ļ���_���static{}
	}

	/**
	 * ��ӻ���
	 * 
	 * @param id
	 *            ����id
	 * @param num
	 *            ��������
	 * @param inTime
	 *            ��������ʱ��
	 * @return ���ؽ��
	 */
	public RespondRuslt addCart(int id, int num, String inTime) {
		Goods goods = null;
		if (goodsDao.isExist(id)) {
			List<Goods> goodslist = goodsDao.selectById(id);
			for (Goods goods2 : goodslist) {
				goods = goods2;
				ShoppingCart shoppingCart = new ShoppingCart(goods, num, inTime);
				shoppingCart.setAllTotle(goods.getPrice() * num);// �ܼ�
				shopDao.insert(shoppingCart);// ��װ�빺�ﳵ
				// goods.setNum(goods.getNum() - num);// ���ٻ������Ŀ//bug
				// û�н���ʱ��ɾ���ֿ����
				// goodsDao.update(goods);// ���»�����Ŀ
				return new RespondRuslt(Status.SUSSECE);
			}
		}
		return new RespondRuslt(Status.NULL);

	}

	/**
	 * ��ѯ���ﳵ����
	 * 
	 * @return ����״̬��
	 */
	public RespondRuslt selectCart() {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		if (shopDao.selectAll().size() != 0) {
			rs.setObj(shopDao.selectAll());

		} else {
			return new RespondRuslt(Status.NULL);
		}
		return rs;
	}

	/**
	 * �������л���
	 * 
	 * @return ����״̬��
	 */
	public RespondRuslt countAll() {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		RespondRuslt endCart = selectCart();
		Double sum = 0.0;
		List<ShoppingCart> sCart = (List<ShoppingCart>) endCart.getObj();
		List<Goods> selectAll = goodsDao.selectAll();
		if (sCart != null) {
			for (ShoppingCart shoppingCart : sCart) {
				for (Goods goods : selectAll) {
					if (goods.getId() == shoppingCart.getG().getId()) {
						goods.setNum(goods.getNum() - shoppingCart.getNum());
						goodsDao.update(goods);
						shopDao.clear();
						return rs;
					}
				}

			}
		}
		return new RespondRuslt(Status.NULL);

	}
/**
 *  �޸Ĺ��ﳵ����
 * @param g
 * @return
 */
	public RespondRuslt updateCart(Goods g) {
		List<ShoppingCart> selectAll = shopDao.selectAll();
		for (ShoppingCart shoppingCart : selectAll) {
			if (shoppingCart.getG().getId() == g.getId()) {
				shoppingCart.setNum(g.getNum());
				shopDao.update(shoppingCart);
				return new RespondRuslt(Status.SUSSECE);

			}
		}
		return new RespondRuslt(Status.FAIL);
	}
/**
 * ɾ�����ﳵ����
 * @param s
 * @return
 */
	public RespondRuslt deleteCart(Goods s) {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		List<ShoppingCart> selectAll = shopDao.selectAll();
		if (s == null) {
			shopDao.clear();
			return rs;

		} else {
			for (ShoppingCart shoppingCart : selectAll) {
				if (shoppingCart.getG().getId() == s.getId()) {
					shopDao.deleteById(shoppingCart);
					return rs;
				} else {
					return new RespondRuslt(Status.NULL);
				}
			}
		}

		return new RespondRuslt(Status.FAIL);
	}
}
