package day2;

import java.util.Scanner;

public class ToPound {
	double kg=0;
	double inputMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단위 변환 프로그램");
		System.out.print("변환할 kg 입력: ");
		kg = sc.nextDouble();
		return kg;
	}
	void printMethod(double kg) {
		System.out.println("kg 출력: "+kg);
	}
	void kgTopound(double kg) {
		System.out.println("pound 출력: "+kg*2.2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToPound tp = new ToPound();
		double kg = tp.inputMethod();
		tp.printMethod(kg);
		tp.kgTopound(kg);
	}

}
