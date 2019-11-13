package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dao.imp.ShopCartDaoIMP;
import dao.imp.UsersDaoIMP;
import onetomanyentity.Goods;
import onetomanyentity.ShopCart;
import onetooneentity.Users;

public class ShopCartService {
	private UsersDaoIMP udimp = new UsersDaoIMP();
	private ShopCartDaoIMP scdimp = new ShopCartDaoIMP();

	public ShopCart getAllShopCartGoodsData(Users uid) throws SQLException {
		ShopCart cart = new ShopCart();
		Set<ShopCart> selectAllShopCart = scdimp.selectAllShopCart();
		Users selectUsersById = udimp.selectUsersById(uid.getUid());
		for (ShopCart shopCart : selectAllShopCart) {
			Set<Goods> selectGoodsByUsersId = scdimp.selectGoodsByUsersId(selectUsersById.getUid());
			shopCart.setSetgoods(selectGoodsByUsersId);
			cart = shopCart;
		}
		return cart;

	}
}
