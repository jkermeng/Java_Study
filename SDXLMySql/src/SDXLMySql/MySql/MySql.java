package SDXLMySql.MySql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.exceptions.RSAException;
import com.mysql.cj.jdbc.util.ResultSetUtil;

import entity.User;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月14日
 * @Version 1.0.0
 */
public class MySql {

	private Connection connection;
	private PreparedStatement ps;
	private List<User> list;

	public MySql() {
	}

	public MySql(Connection connection) {
		this.connection = connection;
		list = new ArrayList<User>();
	}

	public List<User> getFind(User u) {
		String sql = "select * from J_User";
		ResultSet rSet = null;
		try {
			if (u == null) {
				// 全部
				ps = connection.prepareStatement(sql);
				rSet = ps.executeQuery();

			} else if (u.getName() != null && u != null) {
				// 名字模糊查询
				sql = "select * from J_User where name like ?";
				ps = connection.prepareStatement(sql);
				ps.setString(1, "%" + u.getName() + "%");
				rSet = ps.executeQuery();

			} else if (u.getId() != 0 && u != null) {
				sql = "select * from  J_User where id = ?";
				ps = connection.prepareStatement(sql);
				ps.setInt(1, u.getId());
				rSet = ps.executeQuery();

			}

			while (rSet.next()) {
				User user = new User();
				user.setId(rSet.getInt("ID"));
				user.setName(rSet.getString("NAME"));
				user.setAge(rSet.getInt("AGE"));
				user.setPassword(rSet.getString("PASSWORD"));
				list.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnet.partClose();
		}
		//
		// statement = (Statement) connection.createStatement();
		// ResultSet rSet = statement.executeQuery(sql);
		// while (rSet.next()) {
		// int id = rSet.getInt("id");
		// String name = rSet.getString("name");
		// int age = rSet.getInt("age");
		// int saslary = rSet.getInt("saslary");
		// System.out.println(id + "=" + name + "=" + age + "=" + saslary);
		return list;

	}

	public void insertSql(User use) {
		int id = use.getId();
		String name = use.getName();
		int age = use.getAge();
		String password = use.getPassword();
		String sql = "insert into J_User values(?,?,?,?)";
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, password);
			ps.execute();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		// StringBuffer sb = new StringBuffer();
		// sb.append("insert into J_User values(");
		// sb.append(id + ",");
		// sb.append("'" + name + "',");
		// sb.append(age + ",");
		// sb.append("'" + password + "')");
		// try {
		// statement = (Statement) connection.createStatement();
		//// statement.execute(sb.substring(0));
		// } catch (SQLException e) {
		//
		// e.printStackTrace();
		// }
		finally {
			MySqlConnet.partClose();

		}

	}

	public void updataSql(User u) {
		String updateSql = "UPDATE J_User SET NAME = ? , age = ? ,PASSWORD = ? WHERE id = ?";
		try {
			ps = connection.prepareStatement(updateSql);
			ps.setString(1, u.getName());
			ps.setInt(2, u.getAge());
			ps.setString(3, u.getPassword());
			ps.setInt(4, u.getId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnet.partClose();

		}

	}

	public void deleteSql(int sqlId) {
		String deleteSql = "delete from J_User where id = ?";
		try {
			ps = connection.prepareStatement(deleteSql);
			ps.setInt(1, sqlId);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MySqlConnet.partClose();

		}

	}

}
