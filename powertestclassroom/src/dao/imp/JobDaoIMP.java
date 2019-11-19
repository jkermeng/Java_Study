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
import entity.Job;
import entity.Role;
import idao.IDao;
import jdbcUtil.IPreparedStatement;
import jdbcUtil.IResultSet;
import jdbcUtil.MySqlConnection;
import jdbcUtil.MySqlUtil;

public class JobDaoIMP implements IDao<Job> {
	private static Connection conn = MySqlConnection.getConnect();
	private static MySqlUtil mySqlUtil;

	@Override
	public void Insert(Job t) {
		mySqlUtil = new MySqlUtil(conn);
		try {
			mySqlUtil.UpdateOrInsert("insert into job values(?,?,?,?,?)", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getJid());
					ps.setString(2, t.getJname());
					ps.setString(3, t.getJnumber());
					ps.setString(4, t.getJexplain());
					ps.setInt(5, t.getDid().getDid());
				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
	}

	@Override
	public void Delete(Job t) {
		mySqlUtil = new MySqlUtil(conn);
		try {
			mySqlUtil.UpdateOrInsert("delete from job where jid = ? and department_did = ?", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getJid());
					ps.setInt(2, t.getDid().getDid());
				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
	}

	@Override
	public void Update(Job t, int pid, int fkid) {
		mySqlUtil = new MySqlUtil(conn);
		try {
			mySqlUtil.UpdateOrInsert(
					"UPDATE ROLE SET jid = ? ,jname = ?,jnumber = ?,jexplain = ? ,department_did = ? WHERE jid = ? AND department_did =?",
					new IPreparedStatement() {

						@Override
						public void setPreparedStatement(PreparedStatement ps) throws SQLException {
							ps.setInt(1, t.getJid());
							ps.setString(2, t.getJname());
							ps.setString(3, t.getJnumber());
							ps.setString(4, t.getJexplain());
							ps.setInt(5, t.getDid().getDid());
							ps.setInt(6, pid);
							ps.setInt(7, fkid);

						}
					});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}

	}

	@Override
	public Set<Job> Selete() {
		mySqlUtil = new MySqlUtil(conn);
		Set<Job> setrole = new HashSet<>();
		try {
			mySqlUtil.QueryNoParam("select * from job", new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int jid = rs.getInt("jid");
						String jname = rs.getString("jname");
						String jexplain = rs.getString("jexplain");
						String jnumber = rs.getString("jnumber");
						int department_did = rs.getInt("department_did");
						Job j = new Job(jid, jname, jnumber, jexplain);
						j.setDid(new Department(department_did));
						setrole.add(j);
					}

				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
		return setrole;
	}

	@Override
	public Job SeleteById(int id) {
		mySqlUtil = new MySqlUtil(conn);
		Job j = new Job();

		Set<Job> setrole = new HashSet<>();
		try {
			mySqlUtil.QueryWithParam("select * from job where jid = ?", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, id);

				}
			}, new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int jid = rs.getInt("jid");
						String jname = rs.getString("jname");
						String jexplain = rs.getString("jexplain");
						String jnumber = rs.getString("jnumber");
						int department_did = rs.getInt("department_did");
						j.setJid(jid);
						j.setJname(jname);
						j.setJexplain(jexplain);
						j.setJnumber(jnumber);
						j.setDid(new Department(department_did));
					}
				}
			});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
		return j;

	}

	@Override
	public Set<Job> SeleteByFK(int fkid, int pid) {
		Set<Job> setrole = new HashSet<>();
		try {
			mySqlUtil.QueryWithParam("select * from job where jid = ? and department_did = ?",
					new IPreparedStatement() {

						@Override
						public void setPreparedStatement(PreparedStatement ps) throws SQLException {
							ps.setInt(1, fkid);
							ps.setInt(2, pid);

						}
					}, new IResultSet() {

						@Override
						public void setIResultSet(ResultSet rs) throws SQLException {
							while (rs.next()) {
								int jid = rs.getInt("jid");
								String jname = rs.getString("jname");
								String jexplain = rs.getString("jexplain");
								String jnumber = rs.getString("jnumber");
								int department_did = rs.getInt("department_did");
								Job j = new Job(jid, jname, jnumber, jexplain);
								j.setDid(new Department(department_did));
								setrole.add(j);
							}
						}
					});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
		return setrole;

	}

	@Override
	public Set<GetPower> SeleteByUserenumber(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job login(String number, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(Job t, int pid) {
		mySqlUtil = new MySqlUtil(conn);
		try {
			mySqlUtil.UpdateOrInsert(
					"UPDATE ROLE SET jid = ? ,jname = ?,jnumber = ?,jexplain = ? ,department_did = ? WHERE jid = ?",
					new IPreparedStatement() {

						@Override
						public void setPreparedStatement(PreparedStatement ps) throws SQLException {
							ps.setInt(1, t.getJid());
							ps.setString(2, t.getJname());
							ps.setString(3, t.getJnumber());
							ps.setString(4, t.getJexplain());
							ps.setInt(5, t.getDid().getDid());
							ps.setInt(6, pid);

						}
					});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}

	}

}
