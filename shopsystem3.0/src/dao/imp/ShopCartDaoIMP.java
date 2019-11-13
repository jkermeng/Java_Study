package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import jdbcutil.MysqlConnet;
import onetomanyentity.Goods;
import onetomanyentity.ShopCart;
import onetomanyentity._Classification;
import onetooneentity.Users;

public class ShopCartDaoIMP {
	private Connection conn;
	private PreparedStatement ps;

	public static void main(String[] args) throws SQLException {
		Set<Goods> selectGoodsByCartId = new ShopCartDaoIMP().selectGoodsByCartId(1);
		for (Goods goods : selectGoodsByCartId) {

			System.out.println(goods);
		}
	}

	public Set<Goods> selectGoodsByUsersId(int usersid) throws SQLException {
		conn = MysqlConnet.Connect();
		Set<Goods> setgoods = new HashSet<>();
		String sql = "SELECT g.* FROM goods g LEFT JOIN relation_4 r4 ON g.gid = r4.gid LEFT JOIN shopcart st ON st.cid = r4.cid WHERE st.user_uid = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, usersid);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String gname = rs.getString("gname");
			double gprice = rs.getDouble("gprice");
			int gid = rs.getInt("gid");
			int gstock = rs.getInt("gstock");
			int cid = rs.getInt("classification_cid");
			Goods g = new Goods(gid, gname, gprice, gstock);
			g.setSetClassfy(new _Classification(cid));
			setgoods.add(g);
		}
		return setgoods;
	}

	public Set<Goods> selectGoodsByCartId(int cartid) throws SQLException {
		conn = MysqlConnet.Connect();
		Set<Goods> setgoods = new HashSet<>();
		String sql = "SELECT g.* FROM goods g LEFT JOIN relation_4 r4 ON g.gid = r4.gid LEFT JOIN shopcart st ON st.cid = r4.cid WHERE st.cid = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, cartid);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String gname = rs.getString("gname");
			double gprice = rs.getDouble("gprice");
			int gid = rs.getInt("gid");
			int gstock = rs.getInt("gstock");
			int cid = rs.getInt("classification_cid");
			Goods g = new Goods(gid, gname, gprice, gstock);
			g.setSetClassfy(new _Classification(cid));
			setgoods.add(g);
		}
		return setgoods;
	}

	public Set<ShopCart> selectAllShopCart() throws SQLException {
		Set<ShopCart> setshopsart = new HashSet<>();
		conn = MysqlConnet.Connect();
		ps = conn.prepareStatement("select * from shopcart");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int cid = rs.getInt("cid");
			int user_uid = rs.getInt("user_uid");
			ShopCart sc = new ShopCart(cid);
			sc.setUse(new Users(user_uid));
			setshopsart.add(sc);
		}
		return setshopsart;
	}
}
