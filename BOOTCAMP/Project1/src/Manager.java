import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager {
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://localhost/employees?&useSSL=false";
	private final String USER_NAME = "root";
	private final String PASSWORD = "root";
	
	public void student_Add() {
		Connection conn = null;
		Statement state = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
			state = conn.createStatement();
			String sql, where="";
			sql = "SELECT * FROM buytbl";
			ResultSet rs = state.executeQuery(sql);
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String userid = rs.getString("userid");
				String prodName = rs.getString("prodName");
				String groupName = rs.getString("groupname");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");
				System.out.println("num: "+num+"\tprodName: "+prodName+"\tgroupName: "+groupName+"\tprice: "+price+"\tamount: "+amount);				
			}
			rs.close();
			state.close();
			conn.close();
			
		}catch(Exception e) {
			
		}finally {
			try {
				if(state!=null)
					state.close();
			}catch(SQLException ex1) {
				
			}
			try {
				if(conn!=null)
					conn.close();
			}catch(SQLException ex1) {
				
			}
		}
	}
	public void student_Search() {}
	public void student_Update() {}
	public void student_Delete() {}
}
