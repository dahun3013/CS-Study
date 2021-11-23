package day15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberDAO {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/jdbctest";
	String userid="root";
	String passwd = "root";
	Connection conn = null;
	PreparedStatement pStmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	MemberDAO(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
