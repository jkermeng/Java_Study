package connutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import template.IPrepareStatementOpration;
import template.IResultSetOpration;
import template.JdbcTemplate;

public class JdbcTest {

	public static void main(String[] args) throws SQLException {
		// Worker w1 = new Worker(1001,"工人1",20);
		// Worker w2 = new Worker(1002,"工人2",21);
		// Worker w3 = new Worker(1003,"工人3",25);
		//
		//
		// IDCar w1car = new IDCar(1,"450506****");
		// IDCar w2car = new IDCar(2,"450506****");
		// IDCar w3car = new IDCar(3,"450506****");
		//
		// //Worker和IDCar联系
		// w1.setIdCar(w1car);
		// w2.setIdCar(w2car);
		// w3.setIdCar(w3car);
		//
		// w1car.setWorked(w1);
		// w2car.setWorked(w2);
		// w3car.setWorked(w3);

		Connection conn = ConnectUitl.getConn();
		Statement st = null;
		ResultSet rs = null;
		try {
			// // 加载驱动
			// Class.forName("com.mysql.jdbc.Driver");
			// // 建立连接
			// conn =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
			// "root", "root");
			// // 得到执行SQL语句的对象
			// st = conn.createStatement();
			// //执行SQL语句，返回结果集
			// rs = st.executeQuery("select * from t_user");
			// while(rs.next()) {
			// int uid = rs.getInt("uid");
			// String uname = rs.getString("uname");
			// System.out.println(uid+"="+uname);
			// }
			conn.setAutoCommit(false);
			JdbcTemplate jt = new JdbcTemplate(conn);
//			jt.queryNoParam("select * from t_user", new IResultSetOpration() {
//
//				@Override
//				public void getResult(ResultSet rs) {
//					try {
//						while (rs.next()) {
//							int uid = rs.getInt("uid");
//							String uname = rs.getString("uname");
//							System.out.println(uid + "=" + uname);
//						}
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}
//				}
//			});
			// System.out.println("成功");
			// PreparedStatement ps = conn.prepareStatement("insert into
			// t_user(uid,uname) values(?,?)");
			// ps.setInt(1, 7);
			// ps.setString(2, "刘三强1");
			// int executeUpdate = ps.executeUpdate();
			// System.out.println(executeUpdate);
			jt.updateAndInsert("insert into t_user(uid,uname) values(?,?)", new IPrepareStatementOpration() {
				
				@Override
				public void setParam(PreparedStatement ps) {
					try {
						ps.setInt(1, 12);
						ps.setString(2, "刘四强3");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			});
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// try {
			// conn.close();
			// st.close();
			// rs.close();
			// } catch (SQLException e) {
			// e.printStackTrace();
			// }
			ConnectUitl.closeAll();

		}

	}

}

