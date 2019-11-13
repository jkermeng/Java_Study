package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.imp.OrderDetailsIMP;
import dao.imp.OrdersDaoIMP;
import dao.imp.UsersDaoIMP;
import mtomentity.OrderDetails;
import onetomanyentity.Orders;
import onetooneentity.Users;

public class OrderService {
	private UsersDaoIMP udimp = new UsersDaoIMP();
	private OrderDetailsIMP odsimp = new OrderDetailsIMP();
	private OrdersDaoIMP odimp = new OrdersDaoIMP();

	public List<Orders> selectAllData() throws SQLException {
		List<Orders> olist = new ArrayList<>();
		Set<Orders> select = odimp.select(null);
		for (Orders orders : select) {
			Users selectUsersById = udimp.selectUsersById(orders.getUse().getUid());
			orders.setUse(selectUsersById);
			Set<OrderDetails> selectByOrderid = odsimp.selectByOrderid(orders.getOid());
			orders.setSetOrder(selectByOrderid);
			olist.add(orders);
		}

		return olist;
	}

	public Orders selectOrdersDataByUserId(Users u) throws SQLException {
		return odimp.selectByUserId(u.getUid());
	}

	public Set<Orders> selectOrdersDataByOrderId(Users u) throws SQLException {
		Set<Orders> sod = new HashSet<>();
		Set<Orders> select = odimp.select(null);
		for (Orders orders : select) {
			if (orders.getUse().getUid() == u.getUid()) {
				Set<OrderDetails> selectByOrderid = odsimp.selectByOrderid(orders.getOid());
				orders.setSetOrder(selectByOrderid);
				sod.add(orders);
			}
		}
		return sod;

	}

}
