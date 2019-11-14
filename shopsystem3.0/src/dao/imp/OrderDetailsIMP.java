package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import idao.IDao;
import jdbcutil.MySqlUtil;
import jdbcutil.MysqlConnet;
import mtomentity.OrderDetails;
import onetomanyentity.Goods;
import onetomanyentity.Orders;
import util.IPreparedStatement;

public class OrderDetailsIMP implements IDao<OrderDetails> {
	private Connection conn = MysqlConnet.Connect();;
	private PreparedStatement ps;

	public OrderDetailsIMP() {
		super();
	}

	public static void main(String[] args) throws SQLException {
		OrderDetails selectByGid = new OrderDetailsIMP().selectByGid(2);
		System.out.println(selectByGid);
		MysqlConnet.allClose();
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
	public void update(OrderDetails ods) throws SQLException {
		MySqlUtil mySqlUtil = new MySqlUtil(conn);
		mySqlUtil.UpdateOrInsert(
				"UPDATE orderdetailed SET detailednumber = ?,detailedtotal = ? WHERE order_oid = ? AND goods_gid = ?",
				new IPreparedStatement() {

					@Override
					public void setPreparedStatement(PreparedStatement ps) throws SQLException {
						ps.setInt(1, ods.getDetailednumber());
						ps.setDouble(2, ods.getDetailednumber() * ods.getGoodsprice());
						ps.setInt(3, ods.getOrder_oid().getOid());
						ps.setInt(4, ods.getGoods_gid().getGid());
					}
				});
	}

	@Override
	public void delete(OrderDetails ods) throws SQLException {
		MySqlUtil mySqlUtil = new MySqlUtil(conn);
		mySqlUtil.UpdateOrInsert("DELETE FROM orderdetailed WHERE goods_gid = ? AND order_oid = ?",
				new IPreparedStatement() {

					@Override
					public void setPreparedStatement(PreparedStatement ps) throws SQLException {
						ps.setInt(1, ods.getGoods_gid().getGid());
						ps.setInt(2, ods.getOrder_oid().getOid());
					}
				});

	}

	@Override
	public void isExist() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(OrderDetails t) throws SQLException {
		MySqlUtil mySqlUtil = new MySqlUtil(conn);
		mySqlUtil.UpdateOrInsert(
				"INSERT INTO orderdetailed (detailedname,detailednumber,goodsprice,detailedtotal,goods_gid,order_oid) VALUES(?,?,?,?,?,?);",
				new IPreparedStatement() {
					@Override
					public void setPreparedStatement(PreparedStatement ps) throws SQLException {
						ps.setString(1, t.getDetailedname());
						ps.setInt(2, t.getDetailednumber());
						ps.setDouble(3, t.getGoodsprice());
						ps.setDouble(4, t.getDetailedtotal());
						ps.setInt(5, t.getGoods_gid().getGid());
						ps.setInt(6, t.getOrder_oid().getOid());
					}

				});
	}

}
