package dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import entity.Employee;
import entity.FirstPower;
import entity.GetPower;
import entity.Job;
import entity.Role;
import entity.SecondPower;
import idao.IDao;
import jdbcUtil.IPreparedStatement;
import jdbcUtil.IResultSet;
import jdbcUtil.MySqlConnection;
import jdbcUtil.MySqlUtil;

public class RoleDaoIMP implements IDao<Role> {
	private static Connection conn = MySqlConnection.getConnect();
	private static MySqlUtil mySqlUtil;

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEnumber("123");
		employee.setEpassword("123");
		Set<GetPower> seleteByUserenumber = new RoleDaoIMP().SeleteByUserenumber(employee);
		for (GetPower getPower : seleteByUserenumber) {
			System.out.println(getPower);
		}
	}

	@Override
	public void Insert(Role t) {
		mySqlUtil = new MySqlUtil(conn);
		try {
			mySqlUtil.UpdateOrInsert("insert into role values(?,?,?,?)", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getRid());
					ps.setString(2, t.getRname());
					ps.setString(3, t.getRexplain());
					ps.setInt(4, t.getJid().getJid());
				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
	}

	@Override
	public void Delete(Role t) {
		mySqlUtil = new MySqlUtil(conn);
		try {
			mySqlUtil.UpdateOrInsert("delete from role where rid = ? and job_jid = ?", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, t.getRid());
					ps.setInt(2, t.getJid().getJid());
				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
	}

	@Override
	public void Update(Role t, int pid, int fkid) {
		mySqlUtil = new MySqlUtil(conn);
		try {
			mySqlUtil.UpdateOrInsert(
					"UPDATE ROLE SET rid = ? ,rname = ?,rexplain = ? ,job_jid = ? WHERE rid = ? AND job_jid =?",
					new IPreparedStatement() {

						@Override
						public void setPreparedStatement(PreparedStatement ps) throws SQLException {
							ps.setInt(1, t.getRid());
							ps.setString(2, t.getRname());
							ps.setString(3, t.getRexplain());
							ps.setInt(4, t.getJid().getJid());
							ps.setInt(5, pid);
							ps.setInt(6, fkid);

						}
					});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}

	}

	@Override
	public Set<Role> Selete() {
		mySqlUtil = new MySqlUtil(conn);
		Set<Role> setrole = new HashSet<>();
		try {
			mySqlUtil.QueryNoParam("select * from role", new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int rid = rs.getInt("rid");
						String rname = rs.getString("rname");
						String rexplain = rs.getString("rexplain");
						int job_jid = rs.getInt("job_jid");
						Role role = new Role(rid, rname, rexplain, new Job(job_jid));
						setrole.add(role);
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
	public Set<Role> SeleteByFK(int fkid, int pid) {
		mySqlUtil = new MySqlUtil(conn);
		Set<Role> setrole = new HashSet<>();
		try {
			mySqlUtil.QueryWithParam("select * from role where rid = ? and job_jid = ?", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, fkid);
					ps.setInt(2, pid);

				}
			}, new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int rid = rs.getInt("rid");
						String rname = rs.getString("rname");
						String rexplain = rs.getString("rexplain");
						int job_jid = rs.getInt("job_jid");
						Role role = new Role(rid, rname, rexplain, new Job(job_jid));
						setrole.add(role);
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
	public Set<GetPower> SeleteByUserenumber(Employee e) {
		mySqlUtil = new MySqlUtil(conn);
		Set<GetPower> setrole = new HashSet<>();

		try {
			mySqlUtil.QueryWithParam(
					"SELECT  ey.eid,ey.ename,ey.enumber,fp.fpid,fp.fpname,sp.functionurl  FROM employee ey LEFT JOIN ownerjob ownj ON ey.eid = ownj.employee_eid LEFT JOIN role r ON r.rid = ownj.job_jid  LEFT JOIN owner oner ON oner.role_rid = r.rid LEFT JOIN firstpower fp ON fp.fpid = oner.firstpower_fpid LEFT JOIN secondpower sp ON sp.firstpower_fpid = oner.firstpower_fpid WHERE enumber = ? AND epassword = ?",
					new IPreparedStatement() {

						@Override
						public void setPreparedStatement(PreparedStatement ps) throws SQLException {
							ps.setString(1, e.getEnumber());
							ps.setString(2, e.getEpassword());
						}
					}, new IResultSet() {

						@Override
						public void setIResultSet(ResultSet rs) throws SQLException {
							while (rs.next()) {
								int eid = rs.getInt("eid");
								String ename = rs.getString("ename");
								String enumber = rs.getString("enumber");
								int fpid = rs.getInt("fpid");
								String fpname = rs.getString("fpname");
								String functionurl = rs.getString("functionurl");
								GetPower getPower = new GetPower(eid, ename, enumber, fpid, fpname, functionurl);
								setrole.add(getPower);
							}

						}
					});
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
		return setrole;
	}

	@Override
	public Role SeleteById(int id) {
		mySqlUtil = new MySqlUtil(conn);
		Role role = new Role();

		try {
			mySqlUtil.QueryWithParam("select * from role where rid = ?", new IPreparedStatement() {

				@Override
				public void setPreparedStatement(PreparedStatement ps) throws SQLException {
					ps.setInt(1, id);

				}
			}, new IResultSet() {

				@Override
				public void setIResultSet(ResultSet rs) throws SQLException {
					while (rs.next()) {
						int rid = rs.getInt("rid");
						String rname = rs.getString("rname");
						String rexplain = rs.getString("rexplain");
						int job_jid = rs.getInt("job_jid");
						role.setRid(rid);
						role.setRname(rname);
						role.setRexplain(rexplain);
						role.setJid(new Job(job_jid));
					}
				}
			});
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnection.closePart();
		}
		return role;
	}

	@Override
	public Role login(String number, String pwd) {
		return null;
	}

	@Override
	public void Update(Role t, int pid) {

	}

	public Set<Role> SelectPower() {
		mySqlUtil = new MySqlUtil(conn);
		Set<Role> sr = new HashSet<>();
		try {
			mySqlUtil.QueryNoParam(
					"SELECT * FROM role r LEFT JOIN owner o ON r.rid = o.role_rid LEFT JOIN firstpower fp ON fp.fpid = o.firstpower_fpid LEFT JOIN secondpower sp ON sp.firstpower_fpid = fp.fpid",
					new IResultSet() {

						@Override
						public void setIResultSet(ResultSet rs) throws SQLException {
							while (rs.next()) {

								int rid = rs.getInt("rid");
								String rname = rs.getString("rname");
								String rexplain = rs.getString("rexplain");
								int jid = rs.getInt("job_jid");
								int fpid = rs.getInt("fpid");
								String fpname = rs.getString("fpname");
								int spid = rs.getInt("spid");
								String spname = rs.getString("spname");
								String spURL = rs.getString("functionurl");
								// int firstpower_fpid =
								// rs.getInt("firstpower_fpid");
								Role role = new Role(rid, rname, rexplain, new Job(jid),
										new FirstPower(fpid, fpname, new SecondPower(spid, spname, spURL)));
								sr.add(role);
							}
						}

					});
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sr;

	}
}
