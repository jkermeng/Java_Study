package SDXLMySql.MySql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.print.DocFlavor.STRING;

import entity.User;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月14日
 * @Version 1.0.0
 */
public class Main {
	public Main() {

	}

	public static void main(String[] args) {

		MySql mySql = new MySql(MySqlConnet.Connect());
		System.out.println("连接成功");
		// mySql.getFind();
		// mySql.insertSql(new User(4, "username4", 78, "password4"));
		// mySql.updataSql(new User(1, "qwe", 1, "123"));
		// mySql.deleteSql(4);
		List<User> find = mySql.getFind(new User("u"));
		System.out.println(find);
		List<User> finds = mySql.getFind(null);
		System.out.println(finds);
		MySqlConnet.closes();
	}

}
