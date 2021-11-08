package day2;

import java.util.Scanner;

public class EX13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 문제 13
		int pencil = 534;
		int student = 30;
		int result1 = pencil/student;
		int result2 = pencil%student;
		System.out.println("학생 "+student+"명에게 각각 "+result1+"개의 연필을 나눠주었고 "+result2+"개의 연필이 남았습니다.");
	}
}
