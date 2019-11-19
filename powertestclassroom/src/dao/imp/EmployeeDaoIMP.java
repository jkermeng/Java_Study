package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import entity.Department;
import entity.Employee;
import entity.GetPower;
import idao.IDao;
import jdbcUtil.IPreparedStatement;
import jdbcUtil.IResultSet;
import jdbcUtil.MySqlConnection;
import jdbcUtil.MySqlUtil;

public class EmployeeDaoIMP implements IDao<Employee> {
	private Connection conn = MySqlConnection.getConnect();
	private MySqlUtil mysqlutil;

	@Override
	public void Insert(Employee x) {
		mysqlutil = new MySqlUtil(conn);
		String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?)";
		try {
			mysqlutil.UpdateOrInsert(sql, new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, x.getEid());
					ps.setString(2, x.getEname());
					ps.setString(3, x.getEnumber());
					ps.setString(4, x.getEpassword());
					ps.setString(5, x.getEgender());
					ps.setString(6, x.getEphone());
					ps.setString(7, x.getEemail());
					ps.setString(8, x.getEstattus());
					ps.setInt(9, x.getDid().getDid());

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
	public void Delete(Employee t) {
		mysqlutil = new MySqlUtil(conn);
		String sql = "DELETE FROM employee WHERE eid = ? AND department_did = ?";
		try {
			mysqlutil.UpdateOrInsert(sql, new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getEid());
					ps.setInt(2, t.getDid().getDid());

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
	public void Update(Employee x, int pid, int fkid) {
		mysqlutil = new MySqlUtil(conn);
		String sql = "UPDATE employee SET eid = ?,ename = ?,enumber = ?,epassword = ?,egender = ?,ephone = ?, eemail = ?,estatus = ?,department_did = ? where eid=? and department_did=? ";
		try {
			mysqlutil.UpdateOrInsert(sql, new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, x.getEid());
					ps.setString(2, x.getEname());
					ps.setString(3, x.getEnumber());
					ps.setString(4, x.getEpassword());
					ps.setString(5, x.getEgender());
					ps.setString(6, x.getEphone());
					ps.setString(7, x.getEemail());
					ps.setString(8, x.getEstattus());
					ps.setInt(9, x.getDid().getDid());
					ps.setInt(10, pid);
					ps.setInt(11, fkid);

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
	public Set<Employee> Selete() {
		mysqlutil = new MySqlUtil(conn);
		String sql = "select * from employee";
		Set<Employee> setEmployee = new HashSet<>();
		try {
			mysqlutil.QueryNoParam(sql, new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int eid = rs.getInt("eid");
						String ename = rs.getString("ename");
						String enumber = rs.getString("enumber");
						String epassword = rs.getString("epassword");
						String egender = rs.getString("egender");
						String ephone = rs.getString("ephone");
						String eemail = rs.getString("eemail");
						String estattus = rs.getString("estatus");
						int department_did = rs.getInt("department_did");
						Employee e = new Employee(eid, ename, enumber, epassword, egender, ephone, eemail, estattus);
						e.setDid(new Department(department_did));
						setEmployee.add(e);
					}

				}
			});
		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			MySqlConnection.closePart();
		}
		return setEmployee;
	}

	@Override
	public Set<Employee> SeleteByFK(int fkid, int pid) {
		// Set<Employee> sete = new HashSet<>();
		// Selete(t)
		return null;

	}

	@Override
	public Set<GetPower> SeleteByUserenumber(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee login(String number, String pwd) {

		mysqlutil = new MySqlUtil(conn);
		Employee ey = new Employee();

		try {
			mysqlutil.QueryWithParam("select * from employee where enumber = ? and epassword = ?",
					new IPreparedStatement() {

						@Override
						public void setPreparedStatement(PreparedStatement ps) throws SQLException {
							ps.setString(1, number);
							ps.setString(2, pwd);
						}
					}, new IResultSet() {

						@Override
						public void setIResultSet(ResultSet rs) throws SQLException {
							while (rs.next()) {
								ey.setEid(rs.getInt("eid"));
								ey.setEname(rs.getString("ename"));
								ey.setEnumber(number);
								ey.setEpassword(pwd);
								ey.setDid(new Department(rs.getInt("department_did")));
							}

						}
					});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
		return ey;
	}

	public static void main(String[] args) {
		Employee login = new EmployeeDaoIMP().login("11", "123");
		System.out.println(login);
	}

	@Override
	public void Update(Employee t, int pid) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee SeleteById(int id) {
		mysqlutil = new MySqlUtil(conn);
		Employee ey = new Employee();
		try {
			mysqlutil.QueryWithParam("select * from employee where eid = ?", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, id);
				}
			}, new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int eid = rs.getInt("eid");
						String ename = rs.getString("ename");
						String enumber = rs.getString("enumber");
						String epassword = rs.getString("epassword");
						String egender = rs.getString("egender");
						String ephone = rs.getString("ephone");
						String eemail = rs.getString("eemail");
						String estattus = rs.getString("estatus");
						int department_did = rs.getInt("department_did");
						ey.setEid(eid);
						ey.setEname(ename);
						ey.setEnumber(enumber);
						ey.setEpassword(epassword);
						ey.setEgender(egender);
						ey.setEphone(ephone);
						ey.setEemail(eemail);
						ey.setEstattus(estattus);
						ey.setDid(new Department(department_did));
					}
				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ey;
	}
}
