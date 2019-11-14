package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dao.imp.GoodsDaoIMP;
import dao.imp.OrderDetailsIMP;
import dao.imp.OrdersDaoIMP;
import dao.imp.ShopCartDaoIMP;
import dao.imp.UsersDaoIMP;
import enums.Enums;
import enums.Responese;
import mtomentity.OrderDetails;
import onetomanyentity.Goods;
import onetomanyentity.Orders;
import onetomanyentity.ShopCart;
import onetooneentity.Users;

public class ShopCartService {
	private UsersDaoIMP udimp = new UsersDaoIMP();
	private ShopCartDaoIMP scdimp = new ShopCartDaoIMP();
	private OrderDetailsIMP odsimp = new OrderDetailsIMP();
	private GoodsDaoIMP gdimp = new GoodsDaoIMP();
	private OrdersDaoIMP odimp = new OrdersDaoIMP();

	public Responese getUserShopCartGoodsData(Users uid) throws SQLException {
		ShopCart cart = new ShopCart();
		Responese rs = new Responese(Enums.SUCCESS);
		Users selectUsersById = udimp.selectUsersById(uid.getUid());
		Set<ShopCart> selectGoodsByUsersId = scdimp.selectGoodsByUsersId(selectUsersById.getUid());
		rs.setObj(selectGoodsByUsersId);
		return rs;
	}

	public void addShopCartGoods(int id, int num, Users u) throws SQLException {
		Goods selectById = gdimp.selectById(id);
		OrderDetails orderDetails = new OrderDetails(selectById.getGname(), num, selectById.getGprice(),
				num * selectById.getGprice());
		// 用户的id
		Orders selectByUserId = odimp.selectByUserId(u.getUid());
		orderDetails.setOrder_oid(selectByUserId);
		odsimp.insert(orderDetails);

	}

	public Responese updateShopCartGoods(int id, int num, Users u) throws SQLException {
		OrderDetails ods = new OrderDetails();
		Orders selectByUserId = odimp.selectByUserId(u.getUid());
		OrderDetails selectByGid = odsimp.selectByGid(id);
		selectByGid.setOrder_oid(selectByUserId);
		selectByGid.setDetailednumber(num);
		odsimp.update(selectByGid);
		return new Responese(Enums.SUCCESS);

	}

	public Responese deleteShopCartGoods(int id, Users u) throws SQLException {
		OrderDetails selectByGid = odsimp.selectByGid(id);
		Orders selectByUserId = odimp.selectByUserId(u.getUid());
		selectByGid.setOrder_oid(selectByUserId);
		odsimp.delete(selectByGid);
		return new Responese(Enums.SUCCESS);

	}

	public Responese countMyShopCart(Users u) throws SQLException {
		Orders selectByUserId = odimp.selectByUserId(u.getUid());
		selectByUserId.setOstatus("已结算");
		odimp.update(selectByUserId);
		return new Responese(Enums.SUCCESS);

	}

}
