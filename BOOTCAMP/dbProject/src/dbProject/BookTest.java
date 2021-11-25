package dbProject;

public class BookTest {
	public static void main(String args[]) {
		BookDTO b = new BookDTO("B004","자바스크립트","강길동",2020,28000,"서울출판사");
		
		BookDAO manager = new BookDAO();
		//manager.insertBook(b);
		manager.selectBook();
		try {
			manager.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
