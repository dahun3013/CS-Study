package javaProject1;

public class javaProject1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("001","노트북",1200000,2021,"삼성");
		Product p2 = new Product("002","모니터",300000,2021,"LG");
		Product p3 = new Product("003","마우스",30000,2020,"로지텍");
		
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("-------------------------------------");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}

class Product{
	private String prdNo;
	private String prdName;
	private int prdPrice;
	private int prdYear;
	private String prdMaker;
	
	Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker){
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}
	
	public String getPrdNo() {
		return prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public int getPrdYear() {
		return prdYear;
	}

	public String getPrdMaker() {
		return prdMaker;
	}
	
	public String toString() {
		return prdNo+"\t"+prdName+"\t"+prdPrice+"\t"+prdYear+"\t"+prdMaker;
	}
}
