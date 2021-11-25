package dbProject;

import java.sql.*;


public class BookDAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/jdbctest";
	private String userid="root";
	private String passwd = "root";
	private Connection conn = null;
	private PreparedStatement pStmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	BookDAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,userid,passwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initBookTBL() {
		String sql = "delete from book";
		try {
			stmt = conn.createStatement();
			stmt.execute("set SQL_SAFE_UPDATES = 0");
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void insertBook(BookDTO bookDTO) {
		String sql = "insert into book values(?,?,?,?,?,?)";
		try {
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, bookDTO.getBookNo());
			pStmt.setString(2, bookDTO.getBookTitle());
			pStmt.setString(3, bookDTO.getBookAuthor());
			pStmt.setInt(4, bookDTO.getBookYear());
			pStmt.setInt(5, bookDTO.getBookPrice());
			pStmt.setString(6, bookDTO.getBookPublisher());
			
			if(pStmt.executeUpdate()==1) {
				System.out.println("insert ¼º°ø!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void selectBook() {
		String sql = "select * from book";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				BookDTO temp = new BookDTO(
								rs.getString("bookNo"),rs.getString("bookTitle"),rs.getString("bookAuthor"),
								rs.getInt("bookYear"),rs.getInt("bookPrice"),rs.getString("bookPublisher")
								);
				System.out.println(temp);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	@Override protected void finalize() throws Throwable {
		if(!conn.isClosed())
			conn.close();
	}
}
