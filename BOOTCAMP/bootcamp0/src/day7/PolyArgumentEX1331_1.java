package day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Product_Object{
	public String getAddress() {
		return address;
	}
	public int getPrice() {
		return price;
	}
	public int getMount() {
		return mount;
	}
	protected String address;
	protected int price;
	protected int mount;
	Product_Object(String address){
		this.address = address;
	}
}

class Computer_Object extends Product_Object{
	Computer_Object(String address, int mount){
		super(address);
		super.price = 2000000;
		super.mount=mount;
	}
}

class Printer_Object extends Product_Object{
	Printer_Object(String address, int mount){
		super(address);
		super.price = 500000;
		super.mount=mount;
	}
}


class ObjectPrint{
	private HashMap<String,ArrayList<Product_Object>> map;
	public ObjectPrint() {
		this.map = new HashMap<>();
	}
	public void input(Scanner sc) {
		String address, product;
		int mount;
		System.out.print("지사 입력(서울,경인,강원,제주): ");
		address=sc.nextLine();
		System.out.print("제품 입력(컴퓨터, 프린터): ");
		product=sc.nextLine();
		System.out.print("만매량 입력: ");
		mount=sc.nextInt();
		
		Product_Object po;
		if(product.equals("컴퓨터")) {
			
		}
			//map.put(address,(po=new Computer_Object(address, mount)));
		else if(product.equals("프린터")) {
			
		}
			//map.put(address,new Printer_Object(address, mount));
	}
	public void output() {
				
	}
}
public class PolyArgumentEX1331_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectPrint op = new ObjectPrint();
		Scanner sc = new Scanner(System.in);
		int option = -1;
		do {
			System.out.println("------------------------------------------");
			System.out.println("\t\t\t판매량관리 프로젝트");
			System.out.println("------------------------------------------");
			System.out.println("0.초기화\t1.입력\t2.출력\t3.종료");
			switch(option) {
				case 0:
					System.out.println("초기화");
					op = new ObjectPrint();
					break;
				case 1:
					op.input(sc);
					break;
				case 2:
					op.output();
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					option=0;
					break;
			}
		}while(option<3);
		
	}

}
