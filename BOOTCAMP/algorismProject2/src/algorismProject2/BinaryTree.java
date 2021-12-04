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
			System.out.println("(1) ��ǰ��� (2) ��ǰ���� (3) ��ǰ�˻� (4) ��ü ��ǰ��ȸ (5) ����");
			System.out.print("�޴� ���� : ");
			option = sc.nextInt();
			sc.nextLine();
			
			int number;
			String name;
			Product product;
			Iterator iter;
			
			switch(option) {
				case 1:
					System.out.println();
					System.out.println("��ǰ���");
					System.out.print("��ǰ��ȣ �Է� : ");
					number = sc.nextInt();
					sc.nextLine();
					System.out.print("��ǰ�� �Է� : ");
					name = sc.nextLine();
					product = new Product(number,name);
					tree.add(product);
					break;
				case 2:
					System.out.println();
					System.out.println("��ǰ����");
					System.out.print("��ǰ��ȣ �Է� : ");
					number=sc.nextInt();
					iter = tree.iterator();
					while(iter.hasNext()) {
						product = (Product)iter.next();
						if(product.getProductNumber() == number) {
							tree.remove(product);
							System.out.println("��ǰ���� �Ϸ�");
							break;
						}
					}
					break;
				case 3:
					System.out.println();
					System.out.println("��ǰ�˻�");
					System.out.print("��ǰ��ȣ �Է� : ");
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
						System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
						break;
					}
						
					iter = tree.iterator();
					while(iter.hasNext())
						System.out.println(iter.next());
					break;
				case 5:
					System.out.println("�����մϴ�.");
					return;
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
			}
		}
	}
}
