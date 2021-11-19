package day13;

public class javaProject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("001","�ڹ� ���α׷���","ȫ�浿",25000,2021,"��Ƽ���ǻ�");
		Book b2 = new Book("002","�ڹٽ�ũ��Ʈ","�̸���",30000,2020,"�������ǻ�");
		Book b3 = new Book("003","HTML/CSS","������",18000,2021,"�������ǻ�");
		System.out.println("������ȣ\t������\t\t����\t����\t������\t���ǻ�");
		System.out.println("----------------------------------------------------------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Magazine m1 = new Magazine("M001","�ڹ� ����","ȫ�浿",25000,2021,"��Ƽ���ǻ�",5);
		Magazine m2 = new Magazine("M002","�� ����","�̸���",30000,2020,"�������ǻ�",7);
		Magazine m3 = new Magazine("M003","���� ����","������",18000,2021,"��Ƽ���ǻ�",9);
		
		System.out.println("������ȣ\t������\t������\t����\t���࿬��\t���ǻ�\t�����");
		System.out.println("----------------------------------------------------------");
		
	}

}

class Book{
	private String bookNo;
	private String bookTitle;
	private String bookAuthor;
	private int bookYear;
	private int bookPrice;
	private String bookPublisher;
	public Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}
	public String getBookNo() {
		return bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public int getBookYear() {
		return bookYear;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	@Override
	public String toString() {
		return bookNo+"\t"+bookTitle+"\t"+bookAuthor+"\t"+bookYear+"\t"+bookPrice+"\t"+bookPublisher;
	}
}

class Magazine extends Book{
	private int month;

	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice,
			String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
		// TODO Auto-generated constructor stub
		this.month = month;
	}
	public Magazine(Book book, int month) {
		super(book.getBookNo(), 
				book.getBookTitle(),
				book.getBookAuthor(),
				book.getBookYear(),
				book.getBookPrice(), 
				book.getBookPublisher());
		// TODO Auto-generated constructor stub
		this.month = month;
	}
	@Override
	public String toString() {
		return super.toString() + "\t" + month;
	}

}