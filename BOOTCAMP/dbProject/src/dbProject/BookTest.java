package dbProject;

public class BookTest {
	public static void main(String args[]) {
		BookDTO b = new BookDTO("B004","�ڹٽ�ũ��Ʈ","���浿",2020,28000,"�������ǻ�");
		
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
