package jdbcutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import util.IPreparedStatement;
import util.IResultSet;

public class MysqlConnet {
	private static String url = null;
	private static String username = null;
	private static String driver = null;
	private static String password = null;

	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	private static Properties pts = null;

	static {
		InputStream is = null;
		try {
			is = MysqlConnet.class.getResourceAsStream("jdbc.properties");
			pts = new Properties();
			pts.load(is);
			driver = pts.getProperty("jdbc.driver");
			url = pts.getProperty("jdbc.url");
			username = pts.getProperty("jdbc.name");
			password = pts.getProperty("jdbc.password");
			Class.forName(driver);
			System.out.println("Êý¾Ý¿âÆô¶¯!");
			conn = DriverManager.getConnection(url, username, password);

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection Connect() {
		return conn;
	}

	public static void partClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void allClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
