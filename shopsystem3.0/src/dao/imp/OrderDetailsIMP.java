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
				int goods_gid = rs.getInt("goods_gid");
				int order_oid = rs.getInt("order_oid");
				double goodsprice = rs.getDouble("goodsprice");
				double detailedtotal = rs.getDouble("detailedtotal");
				String detailedname = rs.getString("detailedname");
				OrderDetails od = new OrderDetails(detailedid, detailedname, detailednumber, goodsprice, detailedtotal,
						goods_gid, order_oid);
				setOrderDetails.add(od);
			}
		}

		return setOrderDetails;
	}

	@Override
	public OrderDetails selectById(int id) {
		// TODO Auto-generated method stub
		return null;
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
