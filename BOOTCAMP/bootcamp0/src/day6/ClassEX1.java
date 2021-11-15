package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ClassEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option;
		ArrayList<PSManagement> array = new ArrayList<>();
		do{
			System.out.println("--------------------------------------------");
			System.out.println("��ǰ�ǸŰ��� ���α׷�");
			System.out.println("--------------------------------------------");
			System.out.println("1.�Է�\t2.���\t3.����");
			System.out.print("�Է�:");
			option=sc.nextInt();
			switch(option) {
				case 1:
					String kinds, name;
					int mount;
					System.out.println("--------------------------------------------");
					System.out.println("�Է�ȭ��");
					System.out.println("--------------------------------------------");
					System.out.print("��ǰ�з�:");
					sc.nextLine();
					kinds=sc.nextLine();
					System.out.print("ǰ��:");
					name=sc.nextLine();
					System.out.print("�Ǹŷ�:");
					mount=sc.nextInt();
					PSManagement p = new PSManagement(kinds,name,mount);
					array.add(p);
					break;
				case 2:
					System.out.println("--------------------------------------------");
					System.out.println("��ǰ�з�\tǰ��\t�ǸŰ�\t\t�Ǹŷ�\t�����");
					System.out.println("--------------------------------------------");
					for(PSManagement temp :array)
						System.out.println(temp);
					break;
				case 3:
					return;
				default:
					continue;
			}
		}while(option<3);
	}

}

class Product{
	private HashMap<String,Integer> map = new HashMap<>();
	private Product() {
		System.out.println("��ǰ �ʱ�ȭ");
		map.put("����ƽ",2000);
		map.put("��",500);
		map.put("��Ǫ",1000);
		map.put("�鵵��",1000);
		map.put("��ǳ��",50000);
		map.put("������",300000);
		map.put("A4����",10000);
		map.put("��Ʈ",20000);
		map.put("��",500);
	}
	private static class InnerInstance{
		private static final Product instance = new Product();
	}
	public static Product getInstance() {
		return InnerInstance.instance;
	}
	public HashMap<String,Integer> getMap() {
		return map;
	}
}

class PSManagement{
	String kinds;
	String name;
	Product values = Product.getInstance();
	int value;
	int price;
	int mount;
	
	public PSManagement(String kinds, String name, int mount) {
		this.kinds = kinds;
		this.name = name;
		this.mount = mount;
		init(kinds);
	}
	private void init(String kinds) {
		value = values.getMap().get(name);
		switch(kinds) {
			case "ȭ��ǰ":
				price = (int)(value*1.5);
				break;
			case "������ǰ":
				price = (int)(value*1.3);
				break;
			case "�繫��ǰ":
				price = (int)(value*1.2);				
				break;
			default:
				break;
		}
	}
	@Override
	public String toString() {
		return kinds+"\t"+name+"\t"+price+"\t\t"+mount+"\t"+price*mount;
	}
}