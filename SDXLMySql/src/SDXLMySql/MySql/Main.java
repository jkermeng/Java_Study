package SDXLMySql.MySql;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;



/**
*
*
*@Author JKermeng
*@Date 2019��10��14��
*@Version 1.0.0
*/
public class Main {
	public Main() {
		
	}
	
	public static void main(String[] args) {
		
	MySql mySql = new MySql(MySqlConnet.Connect());
	mySql.getFind();
	
	}

}
