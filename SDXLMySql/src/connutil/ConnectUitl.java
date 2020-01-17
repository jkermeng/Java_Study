package connutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectUitl {

	private ConnectUitl() {

	}

	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	private static Properties pro = null;
	private static String driver = null;
	private static String url = null;
	private static String name = null;
	private static String pwd = null;

	static {
		InputStream fis = null;
		try {
			fis = ConnectUitl.class.getResourceAsStream("jdbc.properties");
			// fis = new FileInputStream("jdbc.properties");
			pro = new Properties();
			pro.load(fis);
			driver = pro.getProperty("jdbc.driver");
			url = pro.getProperty("jdbc.url");
			name = pro.getProperty("jdbc.name");
			pwd = pro.getProperty("jdbc.password");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static Connection getConn() {
		if (connection == null) {
			try {
				// 加载驱动
				Class.forName(driver);
				// 建立连接
				connection = DriverManager.getConnection(url, name, pwd);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return connection;
	}

	public static void closeAll() {
		try {
			if (connection != null) {
				connection.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void setAutoCommit(Boolean boo){
		try {
			connection.setAutoCommit(boo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void toCommit(){
		try {
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
