package dao.imp;

import java.util.ArrayList;
import java.util.List;

import cache.Goods_Store;
import entity.Goods;
import entity.ShoppingCart;
import entity.User;
import idao.TDaos;

public class TDaoIpm<T> implements TDaos<T> {
	private static List<Goods> GBox;
	private static List<ShoppingCart> SBox;
	private static List<User> UBox;
	private static List<?> TBox;

	static {
		TBox = new ArrayList();
		GBox = (List<Goods>) Goods_Store.GBox;
		SBox = (List<ShoppingCart>) Goods_Store.SBox;
		GBox.add(new Goods(1, "xxx", 124, 21, "xxsws"));
	}

	@Override
	public void insert(T tI) {
		GBox.add((Goods) tI);

	}

	@Override
	public List<?> selectAll() {
		return TBox;
	}

}
