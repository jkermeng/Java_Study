package service;

import java.util.List;

import dao.imp.GoodsDaoIpm;
import enmus.RespondRuslt;
import enmus.Status;
import entity.Goods;
import idao.Daos;

public class GoodsService {
	private Daos<Goods> goodsDao;

	public GoodsService() {
		// ���ݲ�goodsDao
		goodsDao = new GoodsDaoIpm();
	}

	/**
	 * �����Ʒ
	 * 
	 * @param g
	 *            һ����Ʒ����
	 * @return �ж��Ƿ�ɹ�RespondRuslt
	 */
	public RespondRuslt addGoods(Goods g) {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		// ȱ����Ʒ�Ƿ��ظ����ж�
		if (goodsDao.isExist(g.getId())) {
			RespondRuslt respondRuslt = new RespondRuslt(Status.FAIL);
			respondRuslt.setMsg("ID��ͻ");
			return respondRuslt;
		} else {
			goodsDao.insert(g);
			return rs;
		}

	}

	/**
	 * �鿴������Ʒ
	 * 
	 * @return ������Ʒ�б�List<Goods>
	 */

	public RespondRuslt selectGoods(Goods g) {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		if (g == null) {
			rs.setObj(goodsDao.selectAll());
			return rs;
		} else if (goodsDao.isExist(g.getId())) {
			rs.setObj(goodsDao.selectById(g.getId()));
			return rs;
		} else {
			return new RespondRuslt(Status.NULL);
		}
	}

	/**
	 * �����Ʒ��������Ʒ
	 * 
	 * @param g
	 *            ����
	 * @return ���ֵ
	 */
	public RespondRuslt addOrUpdateGoods(Goods g) {
		if (goodsDao.isExist(g.getId())) {
			goodsDao.update(g);
			return new RespondRuslt(Status.SUSSECE);
		} else {
			// goodsDao.insert(g);
			return new RespondRuslt(Status.FAIL);
		}
		// return new RespondRuslt(Status.FAIL);

	}
/**
 * ɾ������ͨ��id
 * @param g
 * @return
 */
	public RespondRuslt deleteGoods(Goods g) {
		if (goodsDao.isExist(g.getId())) {
			goodsDao.deleteById(g);
			return new RespondRuslt(Status.SUSSECE);
		} else {
			return new RespondRuslt(Status.FAIL);
		}

	}

}
