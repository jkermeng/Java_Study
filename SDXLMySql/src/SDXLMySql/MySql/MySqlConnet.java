package SDXLMySql.MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月11日
 * @Version 1.0.0
 */
public class MySqlConnet{

	private static final String Url = "jdbc:mysql://49.232.144.129:3306/test_comment?useUnicode=true&characterEncoding=gbk&useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true";
	private static final String User = "root";
	private static final String PassWord = "JKermeng.1234";
	private static final String Name = "com.mysql.cj.jdbc.Driver";

	
	
	private static  Connection mConnect;
	
	static{
		try {
			Class.forName(Name);
			System.out.println("连接数据库...");
			mConnect = DriverManager.getConnection(Url, User, PassWord);
		} catch (Exception e) {
			e.printStackTrace();  
		}
		
	}
	public static Connection Connect(){
		return mConnect;
	}
	public void closes() {
		try {
			this.mConnect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
