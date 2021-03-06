package day7;

import java.util.Vector;

class Product{
	int price;
	int bonusPoint;
	Product(){
		price = 0;
		bonusPoint =0;
	}
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Radio extends Product{
	Radio(){
		super(100);
	}
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "computer";
	}
}

class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}

class Buyer{
	int money=1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"를 구입하셨습니다.");
	}
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		}else {
			System.out.println("구매목록에 해당 제품이 없습니다.");	
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 제품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Radio r = new Radio();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(r);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
