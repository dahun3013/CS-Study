package day2;

import java.util.Scanner;

public class EX11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// ���� 11
		System.out.print("Ű �Է�(cm): ");
		int tall = sc.nextInt();
		System.out.print("������ �Է�(kg): ");
		double kg = sc.nextDouble();
		if(kg<=(tall-100)*0.9) {
			System.out.println("����");
		}else
			System.out.println("��");

	}
}