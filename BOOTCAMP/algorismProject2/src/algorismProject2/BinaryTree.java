package algorismProject2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class BinaryTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Product> tree = new TreeSet<>();
		int option = 0;
		while(true) {
			System.out.println("(1) 상품등록 (2) 상품삭제 (3) 상품검색 (4) 전체 상품조회 (5) 종료");
			System.out.print("메뉴 선택 : ");
			option = sc.nextInt();
			sc.nextLine();
			
			int number;
			String name;
			Product product;
			Iterator iter;
			
			switch(option) {
				case 1:
					System.out.println();
					System.out.println("상품등록");
					System.out.print("상품번호 입력 : ");
					number = sc.nextInt();
					sc.nextLine();
					System.out.print("상품명 입력 : ");
					name = sc.nextLine();
					product = new Product(number,name);
					tree.add(product);
					break;
				case 2:
					System.out.println();
					System.out.println("상품삭제");
					System.out.print("상품번호 입력 : ");
					number=sc.nextInt();
					iter = tree.iterator();
					while(iter.hasNext()) {
						product = (Product)iter.next();
						if(product.getProductNumber() == number) {
							tree.remove(product);
							System.out.println("상품삭제 완료");
							break;
						}
					}
					break;
				case 3:
					System.out.println();
					System.out.println("상품검색");
					System.out.print("상품번호 입력 : ");
					number=sc.nextInt();
					iter = tree.iterator();
					while(iter.hasNext()) {
						product = (Product)iter.next();
						if(product.getProductNumber() == number) {
							System.out.println(product);
							break;
						}
					}
					break;
				case 4:
					if(tree.size()<1) {
						System.out.println("등록된 상품이 없습니다.");
						break;
					}
						
					iter = tree.iterator();
					while(iter.hasNext())
						System.out.println(iter.next());
					break;
				case 5:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
	}
}
