package SDXLMySql.MySql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��14��
 * @Version 1.0.0
 */
public class MySql {

	public Connection connection;

	public MySql() {
		// TODO Auto-generated constructor stub
	}

	public MySql(Connection connection) {
		this.connection = connection;
	}

	public void getFind() {
		String sql = "select * from comment";
		try {
			Statement statement = (Statement) connection.createStatement();
			ResultSet rSet = statement.executeQuery(sql);
			while (rSet.next()) {
				String linjianhao = rSet.getString("username");
				System.out.println(linjianhao);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
