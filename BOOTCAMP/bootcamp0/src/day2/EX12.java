package day2;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ���� 12
		System.out.print("�ð� �Է�(��) : ");
		int second = sc.nextInt();
		int minute = second/60;
		minute%=60;
		int hour = second/3600;
		second%=60;
		System.out.println(hour+"�� "+minute+"�� "+second+"��");
	}
}
