package dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import jdbcutil.MysqlConnet;
import onetomanyentity.Goods;
import onetomanyentity.ShopCart;
import onetomanyentity._Classification;
import onetooneentity.Users;
import util.DateUtil;

public class ShopCartDaoIMP {
	private Connection conn;
	private PreparedStatement ps;

	public Set<ShopCart> selectGoodsByUsersId(int usersid) throws SQLException {
		conn = MysqlConnet.Connect();
		Set<ShopCart> setgoods = new HashSet<>();
		Set<Goods> setg = new HashSet<>();
		String sql = "SELECT g.gid, g.gname,g.gprice,g.classification_cid ,r4.gtime , r4.gnumber FROM goods g LEFT JOIN relation_4 r4 ON g.gid = r4.gid LEFT JOIN shopcart st ON st.cid = r4.cid WHERE st.user_uid = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, usersid);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int gnumber = rs.getInt("gnumber");
			Date date = rs.getDate("gtime");
			String gtime = DateUtil.dateToStr(date, "YYYY-MM-dd");
			String gname = rs.getString("gname");
			double gprice = rs.getDouble("gprice");
			int gid = rs.getInt("gid");
			Goods g = new Goods(gid, gname, gprice);
			ShopCart sc = new ShopCart(gtime, gnumber);
			sc.setG(g);
			setgoods.add(sc);
		}
		return setgoods;
	}

	public Set<ShopCart> selectGoodsByCartId(int cartid) throws SQLException {
		conn = MysqlConnet.Connect();
		Set<ShopCart> setgoods = new HashSet<>();
		Set<Goods> setg = new HashSet<>();
		String sql = "SELECT g.gid, g.gname,g.gprice,r4.gtime , r4.gnumber FROM goods g LEFT JOIN relation_4 r4 ON g.gid = r4.gid LEFT JOIN shopcart st ON st.cid = r4.cid WHERE r4.cid = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, cartid);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int gnumber = rs.getInt("gnumber");
			Date date = rs.getDate("gtime");
			String gtime = DateUtil.dateToStr(date, "YYYY-MM-dd");
			String gname = rs.getString("gname");
			double gprice = rs.getDouble("gprice");
			int gid = rs.getInt("gid");
			Goods g = new Goods(gid, gname, gprice);
			setg.add(g);
			ShopCart sc = new ShopCart(gtime, gnumber);
			sc.setSetgoods(setg);
			setgoods.add(sc);
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
