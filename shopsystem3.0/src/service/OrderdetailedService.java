package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dao.imp.GoodsDaoIMP;
import dao.imp.OrderDetailsIMP;
import dao.imp.OrdersDaoIMP;
import mtomentity.OrderDetails;
import onetomanyentity.Goods;
import onetomanyentity.Orders;

public class OrderdetailedService {
	private GoodsDaoIMP gdimp = new GoodsDaoIMP();
	private OrdersDaoIMP odimp = new OrdersDaoIMP();
	private OrderDetailsIMP pdsimp = new OrderDetailsIMP();

	public static void main(String[] args) throws SQLException {
		List<OrderDetails> orderDetailsData = new OrderdetailedService().getOrderDetailsAllData();
		for (OrderDetails orderDetails : orderDetailsData) {
			System.out.println(orderDetails);
		}
	}

	public List<OrderDetails> getOrderDetailsAllData() throws SQLException {
		List<OrderDetails> ods = new ArrayList<>();
		Set<OrderDetails> select = pdsimp.select(null);
		for (OrderDetails orderDetails : select) {
			Goods selectById = gdimp.selectById(orderDetails.getGoods_gid().getGid());
			Orders order_oid = odimp.selectById(orderDetails.getOrder_oid().getOid());
			orderDetails.setGoods_gid(selectById);
			orderDetails.setOrder_oid(order_oid);
			ods.add(orderDetails);
		}
		return ods;
	}

	public List<OrderDetails> getOrderDetailsGoodsData() throws SQLException {
		List<OrderDetails> ods = new ArrayList<>();
		Set<OrderDetails> select = pdsimp.select(null);
		for (OrderDetails orderDetails : select) {
			Goods selectById = gdimp.selectById(orderDetails.getGoods_gid().getGid());
			orderDetails.setGoods_gid(selectById);
			ods.add(orderDetails);
		}
		return ods;
	}

	public List<OrderDetails> getOrderDetailsOrdersData() throws SQLException {
		List<OrderDetails> ods = new ArrayList<>();
		Set<OrderDetails> select = pdsimp.select(null);
		for (OrderDetails orderDetails : select) {
			Orders order_oid = odimp.selectById(orderDetails.getOrder_oid().getOid());
			orderDetails.setOrder_oid(order_oid);
			ods.add(orderDetails);

		}
		return ods;
	}
}
