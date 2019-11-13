package jdbcutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.IPreparedStatement;
import util.IResultSet;

public class MySqlUtil {
	private static Connection conn;
	private static PreparedStatement ps;
	private static ResultSet rs;

	public MySqlUtil(Connection conn) {
		this.conn = conn;
	}

	public static void UpdateOrInsert(String sql, IPreparedStatement ips) throws SQLException {
		ps = conn.prepareStatement(sql);
		ips.setPreparedStatement(ps);
		ps.execute();
	}

	public static void QueryWithParam(String sql, IPreparedStatement ips, IResultSet irs) throws SQLException {
		ps = conn.prepareStatement(sql);
		ips.setPreparedStatement(ps);
		rs = ps.executeQuery();
		irs.setResultSet(rs);

	}

	public static void QueryWithNoParam(String sql, IResultSet irs) throws SQLException {
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		irs.setResultSet(rs);

	}
}
