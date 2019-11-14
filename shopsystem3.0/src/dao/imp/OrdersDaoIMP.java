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
import onetomanyentity.Goods;
import onetomanyentity.Orders;
import onetomanyentity._Classification;
import onetooneentity.Users;
import util.IPreparedStatement;

public class OrdersDaoIMP implements IDao<Orders> {
	private Connection conn;
	private PreparedStatement ps;

	@Override
	public Set<Orders> select(Orders t) throws SQLException {
		conn = MysqlConnet.Connect();
		Set<Orders> setOrders = new HashSet<>();
		if (t == null) {
			String sql = "select * from orders";
			ResultSet rs = null;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String ostatus = rs.getString("ostatus");
				String ostart_time = rs.getString("ostart_time");
				int oid = rs.getInt("oid");
				int user_uid = rs.getInt("user_uid");
				double ototal = rs.getDouble("ototal");
				Orders os = new Orders(oid, ostart_time, ostatus, ototal);
				os.setUse(new Users(user_uid));
				setOrders.add(os);
			}
		}
		MysqlConnet.partClose();
		return setOrders;
	}

	@Override
	public Orders selectById(int id) throws SQLException {
		Set<Orders> select = select(null);
		Orders o = new Orders();
		for (Orders orders : select) {
			if (orders.getOid() == id) {
				o = orders;
			}
		}
		return o;
	}

	public Orders selectByUserId(int userid) throws SQLException {
		Set<Orders> select = select(null);
		Orders o = new Orders();
		for (Orders orders : select) {
			if (orders.getUse().getUid() == userid) {
				o = orders;
			}
		}
		return o;

	}

	@Override
	public void isExist() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(Orders t) throws SQLException {

	}

	@Override
	public void update(Orders t) throws SQLException {
		MySqlUtil mySqlUtil = new MySqlUtil(conn);
		mySqlUtil.UpdateOrInsert("UPDATE orders SET ostatus = ? WHERE user_uid = ?", new IPreparedStatement() {
			@Override
			public void setPreparedStatement(PreparedStatement ps) throws SQLException {
				ps.setString(1, t.getOstatus());
				ps.setInt(2, t.getUse().getUid());

			}
		});

	}

	@Override
	public void delete(Orders t) throws SQLException {
		// TODO Auto-generated method stub

	}

}
