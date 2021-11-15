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
		System.out.print("���� �Է�(����,����,����,����): ");
		address=sc.nextLine();
		System.out.print("��ǰ �Է�(��ǻ��, ������): ");
		product=sc.nextLine();
		System.out.print("���ŷ� �Է�: ");
		mount=sc.nextInt();
		
		Product_Object po;
		if(product.equals("��ǻ��")) {
			
		}
			//map.put(address,(po=new Computer_Object(address, mount)));
		else if(product.equals("������")) {
			
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
			System.out.println("\t\t\t�Ǹŷ����� ������Ʈ");
			System.out.println("------------------------------------------");
			System.out.println("0.�ʱ�ȭ\t1.�Է�\t2.���\t3.����");
			switch(option) {
				case 0:
					System.out.println("�ʱ�ȭ");
					op = new ObjectPrint();
					break;
				case 1:
					op.input(sc);
					break;
				case 2:
					op.output();
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
					option=0;
					break;
			}
		}while(option<3);
		
	}

}