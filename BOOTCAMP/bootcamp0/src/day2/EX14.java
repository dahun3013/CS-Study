package day2;

import java.util.Scanner;

public class EX14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 문제 14
		System.out.println("숫자 입력: ");
		int number = sc.nextInt();
		System.out.println(number);
		if(number>99) {
			number/=100;
			number*=100;
		}else
			number=0;
		System.out.println(number);
	}
}
