package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbctest1 {

	public static void main(String[] args) throws Exception, SQLException{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jdbctest";
		String userid="root";
		String passwd = "root";
		Connection conn = null;
		PreparedStatement pStmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("deptno : ");
		int deptno = sc.nextInt();
		sc.nextLine();
		System.out.print("job : ");
		String job = sc.nextLine();
		
		try {
			Class.forName(driver); 
			conn = DriverManager.getConnection(url, userid, passwd);
			//stmt = conn.createStatement();
			String pQuery = "update emp set sal = sal + sal * 0.1 where empno=? or job=?";
			pStmt = conn.prepareStatement(pQuery);
			pStmt.setInt(1,deptno);
			pStmt.setString(2, job);
			//dept 테이블에 있는 것 모두 검색하기
			//String query = "update dept set dname='정다훈' where deptno=30";
			//int updateCheck = stmt.executeUpdate(query);
			int updateCheck = pStmt.executeUpdate();
			if(updateCheck==1)
				System.out.println("Sucess");
			/*
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");

				/*BigDecimal sal = rs.getBigDecimal("sal");
				BigDecimal comm = rs.getBigDecimal("comm");
				BigDecimal deptno = rs.getBigDecimal("deptno");*/
				/*Double sal = rs.getDouble("sal");
				Double comm = rs.getDouble("comm");
				Double deptno = rs.getDouble("deptno");

				System.out.println(empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno);
			}*/
			//emp테이블에 있는 것 모두 검색하기
			
			
		} catch (Exception e) {
			System.out.println("연결 실패함");
			e.printStackTrace();
		}finally {
			//stmt.close();
			pStmt.close();
			//rs.close();
			conn.close();
		}

	}
}
