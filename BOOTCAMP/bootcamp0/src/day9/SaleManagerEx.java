package day9;

import java.util.Scanner;

public class SaleManagerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuSelect = 0;
		Business b = new Business();
		while( menuSelect != 3) {
			System.out.println("--------------");
			System.out.println("�Ǹŷ� ���� ������Ʈ");
			System.out.println("---------------");
			System.out.println("1.�Է� 2.��� 3.����");
			System.out.print("����? ");
			menuSelect=sc.nextInt();
			if(menuSelect == 1) {
				b.input();
			}else if(menuSelect == 2) {
				b.output();
			}else if(menuSelect == 3) {
				break;
			}else {
				System.out.println("�޴��� 1~3 ���� ���� ");
			}
		}

	}

}
class Business{
	Scanner sc;
	SeoulJisa sj = new SeoulJisa();
	KyunginJisa kj=new KyunginJisa();
	KangWonJisa kwj = new KangWonJisa();
	GejuJisa gj = new GejuJisa();
	String yN="y";//�Լ��Ͻðڽ��ϱ� �Ǵ��ϴ� ����

	void salesStaus(Jisa jisa) {
		if(jisa instanceof SeoulJisa) {
			if(sj.productName.equals("com")) 
				sj.salesStatus = 2000000  * sj.salesAmount; 
			else if(sj.productName.equals("printer")) 
				sj.salesStatus = 500000  *sj.salesAmount; 
				
		}else if(jisa instanceof KangWonJisa) {
				if(kwj.productName.equals("com")) 
					kwj.salesStatus = 2000000  *kwj.salesAmount; 
				else if(kwj.productName.equals("printer")) 
					kwj.salesStatus = 500000  *kwj.salesAmount; 
		}else if(jisa instanceof KyunginJisa) {
				if(kj.productName.equals("com")) 
					kj.salesStatus = 2000000  *kj.salesAmount; 
				else if(kj.productName.equals("printer")) 
					kj.salesStatus = 500000  *kj.salesAmount; 
		}else if(jisa instanceof KyunginJisa) {
				if(kj.productName.equals("com")) 
		    		kj.salesStatus = 2000000  *kj.salesAmount;
				else if(kj.productName.equals("printer")) 
					kj.salesStatus = 500000  *kj.salesAmount; 			
		}else if(jisa instanceof GejuJisa) {
				if(gj.productName.equals("com")) 
					gj.salesStatus = 2000000  *gj.salesAmount; 
				else if(gj.productName.equals("printer"))
					gj.salesStatus = 500000  *gj.salesAmount; 			
		}
	}

	void input() {
		//�Է�
		do {	
			System.out.println("�����?");
			System.out.println("1. ��������, 2. ��������, 3. �������� 4. �������� ");
			System.out.print("������? ");
			int jisaSelect=0;
			sc = new Scanner(System.in);
			jisaSelect = sc.nextInt();
			if(jisaSelect == 1) {
				jisaInput(sj);
			}else if(jisaSelect == 2) {
				jisaInput(kj);
			}else if(jisaSelect == 3) {
				jisaInput(kwj);
			}else if(jisaSelect == 4) {
				jisaInput(gj);
			}else {
				System.out.println("�����ȣ Ʋ�Ƚ��ϴ�");
			}
		}while(yN.equalsIgnoreCase("y")); 	
	}
	void jisaInput(Jisa jisa) {

		System.out.print("��ǰ��?");
		if(jisa instanceof SeoulJisa) {
			sj=(SeoulJisa) jisa;
			sj.productName=sc.next();
			System.out.println();
			System.out.println(sj.toString() + " " + sj.productName + "�Ǹŷ���? ");
			sj.salesAmount = sc.nextInt();
			salesStaus(sj);//������Ȳ ���
		}else if(jisa instanceof KangWonJisa) {
			kwj=(KangWonJisa) jisa;
			kwj.productName=sc.next();
			System.out.println();
			System.out.println(kwj.toString() + " " + kwj.productName + "�Ǹŷ���? ");

			kwj.salesAmount = sc.nextInt();
			salesStaus(kwj);//������Ȳ ���

		}else if(jisa instanceof KyunginJisa) {
			kj=(KyunginJisa) jisa;
			kj.productName=sc.next();
			System.out.println();
			System.out.println(kj.toString() + " " + kj.productName + "�Ǹŷ���? ");

			kj.salesAmount = sc.nextInt();
			salesStaus(kj);//������Ȳ ���

		}else if(jisa instanceof GejuJisa) {
			gj=(GejuJisa) jisa;
			gj.productName=sc.next();	
			System.out.println();
			System.out.println(gj.toString() + " " + gj.productName + "�Ǹŷ���? ");
			gj.salesAmount = sc.nextInt();
			salesStaus(gj);
		}
		System.out.println();
		System.out.print("����Ͻðڽ��ϱ�?");
		yN = sc.next();
	}
	void output() {
		//���
		System.out.println("---------------------------");
		System.out.println("�� ���纰 �Ǹ���Ȳ");
		System.out.println("--------------------------- ");
		System.out.println("����� ��ǰ�� ��ǰ���� �Ǹŷ� ������Ȳ");
		System.out.println("----------------------------");
		System.out.println(sj + " " + sj.productName + " " + sj.salesAmount + " " + sj.salesAmount);
		System.out.println(kj + " " + kj.productName + " " + kj.salesAmount + " " + kj.salesAmount);
		System.out.println(kwj + " " + kwj.productName + " " + kwj.salesAmount + " " + kwj.salesAmount);
		System.out.println(gj + " " + gj.productName + " " + gj.salesAmount + " " + gj.salesAmount);
		
	}

}
class Jisa{
	String jisaName;//�����
	String productName;//��ǰ��
	int salesAmount;//�Ǹŷ�

}
class SeoulJisa extends Jisa{
	int salesStatus;//������Ȳ
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��������";
	}
}
class KyunginJisa extends Jisa{
	int salesStatus;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��������";
	}
}
class KangWonJisa extends Jisa{
	int salesStatus;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��������";
	}
}
class GejuJisa extends Jisa{
	int salesStatus;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��������";
	}
}
