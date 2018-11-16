package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	static Connection lianie = null;
	static PreparedStatement p = null;
	
	//Ìí¼Ó
	public static void tianjia(int sid,String sname,int sage,String sphone) throws ClassNotFoundException, SQLException{
		lianie = Dbutil.lianjie();
		p = lianie.prepareStatement("insert into student values("+sid+",'"+sname+"',"+sage+",'"+sphone+"')");
		
		p.executeUpdate();
		Dbutil.close();
	}
}
