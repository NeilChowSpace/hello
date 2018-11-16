package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	static Connection lianjie = null;
	//Á¬½Ó
	public static Connection lianjie() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		lianjie = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncodiing=UTF-8", "root", "123456");
		return lianjie;
	}
	
	//¹Ø±Õ
	public static void close() throws SQLException{
		lianjie.close();
	}
}
