package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import entity.Department;
import entity.Employee;
import idao.IDao;
import jdbcUtil.IPreparedStatement;
import jdbcUtil.IResultSet;
import jdbcUtil.MySqlConnection;
import jdbcUtil.MySqlUtil;

public class DepartmentDaoIMP implements IDao<Department> {
	private Connection conn = MySqlConnection.getConnect();
	private MySqlUtil mysqlutil;

	@Override
	public void Insert(Department t) {
		mysqlutil = new MySqlUtil(conn);
		String sql = "INSERT INTO department VALUES(?,?,?,?,?,?)";
		try {
			mysqlutil.UpdateOrInsert(sql, new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getDid());
					ps.setString(2, t.getDname());
					ps.setInt(3, t.getDnumber());
					ps.setString(4, t.getDcreatdatetime());
					ps.setString(5, t.getDbrief());
					ps.setString(6, t.getDremarks());

				}
			});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
	}

	@Override
	public void Delete(Department t) {

		mysqlutil = new MySqlUtil(conn);
		String sql = "DELETE FROM department WHERE did = ?";
		try {
			mysqlutil.UpdateOrInsert(sql, new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getDid());

				}
			});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
	}

	public void Update(Department t, int pid) {

		mysqlutil = new MySqlUtil(conn);
		String sql = "UPDATE employee SET did = ?,dname = ?,dnumber=?,dcreatdatetime=?,dbrief=?,dremarks=?where did =?";
		try {
			mysqlutil.UpdateOrInsert(sql, new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getDid());
					ps.setString(2, t.getDname());
					ps.setInt(3, t.getDnumber());
					ps.setString(4, t.getDcreatdatetime());
					ps.setString(5, t.getDbrief());
					ps.setString(6, t.getDremarks());
					ps.setInt(7, pid);
				}
			});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
	}

	@Override
	public Set<Department> Selete() {
		mysqlutil = new MySqlUtil(conn);
		String sql = "select * from department";
		Set<Department> setEmployee = new HashSet<>();
		try {
			mysqlutil.QueryNoParam(sql, new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int did = rs.getInt("did");
						String dname = rs.getString("dname");
						int dnumber = rs.getInt("dnumber");
						String dcreatdatetime = rs.getString("dcreatdatetime");
						String dbrief = rs.getString("dbrief");
						String dremarks = rs.getString("dremarks");
						Department d = new Department(did, dname, dnumber, dcreatdatetime, dbrief, dremarks);
						setEmployee.add(d);
					}

				}
			});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			MySqlConnection.closePart();
		}
		return setEmployee;
	}

	@Override
	public Set<Department> SeleteByFK(int fkid, int pid) {
		return null;
	}

	@Override
	public void Update(Department t, int pid, int fkid) {
		// TODO Auto-generated method stub

	}

}
