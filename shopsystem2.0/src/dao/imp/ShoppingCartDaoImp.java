package dao.imp;

import java.util.ArrayList;
import java.util.List;

import cache.Goods_Store;
import entity.Goods;
import entity.ShoppingCart;
import entity.User;
import idao.Daos;

public class ShoppingCartDaoImp implements Daos<ShoppingCart> {
	private List<ShoppingCart> cartBox;

	public ShoppingCartDaoImp() {
		cartBox = Goods_Store.CartBox;
	}

	/**
	 * ��ѯ���ﳵ����
	 */
	@Override
	public List<ShoppingCart> selectAll() {
		return cartBox;
	}

	/**
	 * id ��ѯ����
	 */
	@Override
	public List<ShoppingCart> selectById(int id) {
		List<ShoppingCart> simpleBox = new ArrayList<>();
		for (ShoppingCart shoppingCart : cartBox) {
			if (shoppingCart.getId() == id) {
				simpleBox.add(shoppingCart);
				return simpleBox;
			}
		}
		return null;

	}

	/**
	 * ��ӹ��ﳵ
	 */
	@Override
	public void insert(ShoppingCart tI) {
		cartBox.add(tI);
	}

	/**
	 * �޸Ĺ��ﳵ
	 */
	@Override
	public void update(ShoppingCart tU) {
		List<ShoppingCart> selectById = selectById(tU.getId());
		ShoppingCart shoppingCart = selectById.get(0);
		shoppingCart.setNum(tU.getNum());

	}

	/**
	 * ͨ��idɾ�����ﳵ
	 */
	@Override
	public void deleteById(ShoppingCart s) {
		int index = 0;
		for (int i = 0; i < cartBox.size(); i++) {
			if (cartBox.get(i).getId() == s.getId()) {
				cartBox.remove(i);
			}
		}
		// for (ShoppingCart user : cartBox) {
		// if (user.getId() == s.getId()) {
		//
		// }
		// index++;
		// }
	}

	/**
	 * �Ƿ���ڹ��ﳵ
	 */
	@Override
	public boolean isExist(int id) {
		if (selectById(id) != null) {
			return true;
		}
		return false;
	}

	/**
	 * ��չ��ﳵ
	 */
	@Override
	public void clear() {
		cartBox.clear();
	}

}
