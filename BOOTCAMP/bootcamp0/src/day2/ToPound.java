package day2;

import java.util.Scanner;

public class ToPound {
	double kg=0;
	double inputMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��ȯ ���α׷�");
		System.out.print("��ȯ�� kg �Է�: ");
		kg = sc.nextDouble();
		return kg;
	}
	void printMethod(double kg) {
		System.out.println("kg ���: "+kg);
	}
	void kgTopound(double kg) {
		System.out.println("pound ���: "+kg*2.2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToPound tp = new ToPound();
		double kg = tp.inputMethod();
		tp.printMethod(kg);
		tp.kgTopound(kg);
	}

}
