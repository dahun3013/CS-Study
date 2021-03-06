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
			System.out.println("제품판매관리 프로그램");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력\t2.출력\t3.종료");
			System.out.print("입력:");
			option=sc.nextInt();
			switch(option) {
				case 1:
					String kinds, name;
					int mount;
					System.out.println("--------------------------------------------");
					System.out.println("입력화면");
					System.out.println("--------------------------------------------");
					System.out.print("제품분류:");
					sc.nextLine();
					kinds=sc.nextLine();
					System.out.print("품명:");
					name=sc.nextLine();
					System.out.print("판매량:");
					mount=sc.nextInt();
					PSManagement p = new PSManagement(kinds,name,mount);
					array.add(p);
					break;
				case 2:
					System.out.println("--------------------------------------------");
					System.out.println("제품분류\t품명\t판매가\t\t판매량\t매출액");
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
		System.out.println("상품 초기화");
		map.put("립스틱",2000);
		map.put("비누",500);
		map.put("샴푸",1000);
		map.put("면도기",1000);
		map.put("선풍기",50000);
		map.put("전기담요",300000);
		map.put("A4용지",10000);
		map.put("노트",20000);
		map.put("펜",500);
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
			case "화장품":
				price = (int)(value*1.5);
				break;
			case "가전제품":
				price = (int)(value*1.3);
				break;
			case "사무용품":
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
