package template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public JdbcTemplate(Connection conn) {
		this.conn = conn;
	}

	public void queryWithParam(String sql, IPrepareStatementOpration ips, IResultSetOpration irs) throws SQLException {
		ps = conn.prepareStatement(sql);
		ips.setParam(ps);
		rs = ps.executeQuery();
		irs.getResult(rs);
	}

	public void updateAndInsert(String updateSql, IPrepareStatementOpration ips) throws SQLException {
		ps = conn.prepareStatement(updateSql);
		ips.setParam(ps);
		ps.execute();
	}

	public void queryNoParam(String sql, IResultSetOpration irs) throws SQLException {
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		irs.getResult(rs);
	}

}
