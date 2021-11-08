package day2;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 문제 12
		System.out.print("시간 입력(초) : ");
		int second = sc.nextInt();
		int minute = second/60;
		minute%=60;
		int hour = second/3600;
		second%=60;
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}
}
