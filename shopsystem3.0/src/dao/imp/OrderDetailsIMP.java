package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import idao.IDao;
import jdbcutil.MysqlConnet;
import mtomentity.OrderDetails;
import onetomanyentity.Goods;
import onetomanyentity.Orders;

public class OrderDetailsIMP implements IDao<OrderDetails> {
	private Connection conn;
	private PreparedStatement ps;

	public OrderDetailsIMP() {
		super();
	}

	@Override
	public Set<OrderDetails> select(OrderDetails t) throws SQLException {
		conn = MysqlConnet.Connect();
		Set<OrderDetails> setOrderDetails = new HashSet<>();
		if (t == null) {
			String sql = "select * from orderdetailed";
			ResultSet rs = null;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int detailedid = rs.getInt("detailedid");
				int detailednumber = rs.getInt("detailednumber");
				int goods_gid = rs.getInt("goods_gid");//
				int order_oid = rs.getInt("order_oid");//
				double goodsprice = rs.getDouble("goodsprice");
				double detailedtotal = rs.getDouble("detailedtotal");
				String detailedname = rs.getString("detailedname");
				OrderDetails od = new OrderDetails(detailedid, detailedname, detailednumber, goodsprice, detailedtotal);
				od.setGoods_gid(new Goods(goods_gid));
				od.setOrder_oid(new Orders(order_oid));
				setOrderDetails.add(od);
			}
		}

		return setOrderDetails;
	}

	@Override
	public OrderDetails selectById(int id) throws SQLException {
		Set<OrderDetails> select = select(null);
		OrderDetails od = new OrderDetails();
		for (OrderDetails orderDetails : select) {
			if (orderDetails.getDetailedid() == id) {
				od = orderDetails;
			}
		}
		return od;
	}

	public OrderDetails selectByGid(int Gid) throws SQLException {
		Set<OrderDetails> select = select(null);
		OrderDetails od = new OrderDetails();
		for (OrderDetails orderDetails : select) {
			if (orderDetails.getGoods_gid().getGid() == Gid) {
				od = orderDetails;
			}
		}
		return od;

	}

	public Set<OrderDetails> selectByOrderid(int Orderid) throws SQLException {
		Set<OrderDetails> select = select(null);
		Set<OrderDetails> sod = new HashSet();
		for (OrderDetails orderDetails : select) {
			if (orderDetails.getOrder_oid().getOid() == Orderid) {
				sod.add(orderDetails);
			}
		}
		return sod;

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void isExist() {
		// TODO Auto-generated method stub

	}

}
