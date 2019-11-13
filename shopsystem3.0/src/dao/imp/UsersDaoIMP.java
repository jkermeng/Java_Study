package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import jdbcutil.MysqlConnet;
import onetooneentity.Users;

public class UsersDaoIMP {
	private Connection conn;
	private PreparedStatement ps;

	public Set<Users> selectAllUsers() throws SQLException {
		Set<Users> setusers = new HashSet<>();
		conn = MysqlConnet.Connect();
		ps = conn.prepareStatement("select * from users");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int uid = rs.getInt("uid");
			String uname = rs.getString("uname");
			String uphone = rs.getString("uphone");
			String ugender = rs.getString("ugender");
			Users u = new Users(uid, uname, uphone, ugender);
			setusers.add(u);

		}
		return setusers;
	}

	public Users selectUsersById(int useid) throws SQLException {
		Users u = new Users();
		Set<Users> AllUsers = selectAllUsers();
		for (Users users : AllUsers) {
			if (users.getUid() == useid) {
				u = users;
			}
		}
		return u;
	}
	
}
