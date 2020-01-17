package SDXLMySql.MySql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月11日
 * @Version 1.0.0
 */
public class MySqlConnet {
	private static Connection mConnect = null;
	private static ResultSet rSet = null;
	private static PreparedStatement ps = null;

	private static String Url = null;
	private static String User = null;
	private static String PassWord = null;
	private static String Name = null;
	private static Properties pt = null;

	static {
		InputStream ips = null;
		try {
			ips = MySqlConnet.class.getResourceAsStream("jdbc.properties");
			pt = new Properties();
			pt.load(ips);
			Name = DESUtile.getDecryptString(pt.getProperty("jdbc.driver"));
			Url = DESUtile.getDecryptString(pt.getProperty("jdbc.url"));
			User = DESUtile.getDecryptString(pt.getProperty("jdbc.name"));
			PassWord = DESUtile.getDecryptString(pt.getProperty("jdbc.password"));
			Class.forName(Name);
			System.out.println("连接数据库...");
			mConnect = DriverManager.getConnection(Url, User, PassWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ips != null) {
					ips.close();

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static Connection Connect() {
		return mConnect;
	}

	public static void partClose() {
		try {
			if (rSet != null) {
				rSet.close();
			}
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closes() {
		try {
			if (rSet != null) {
				rSet.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (mConnect != null) {
				mConnect.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
