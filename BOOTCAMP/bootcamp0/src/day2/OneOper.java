package day2;

import java.util.Scanner;

public class OneOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0xAB, y = 0xF;
		String zero="00000000000000000000000000000000";//32개
		String temp = zero + Integer.toBinaryString(x);
		System.out.println(temp.substring(temp.length()-32));
		System.out.println(Integer.toBinaryString(x));
		System.out.printf("x= %#X \t\t%s\n", x, toBinaryString(x));
		
	}

	private static String toBinaryString(int x) {
		String zero="00000000000000000000000000000000";//32개
		String temp = zero + Integer.toBinaryString(x);
		return temp.substring(temp.length()-32);
	}
}
/*		boolean b=true;
char ch='C';

System.out.printf("b=%b%n",b);
System.out.printf("!b=%b%n",!b);
System.out.printf("!!b=%b%n",!!b);
System.out.printf("!!!b=%b%n",!!!b);
System.out.printf("b=%b%n",b);
System.out.println();

System.out.printf("ch=%c%n",ch);
System.out.printf("ch < 'a' ch> 'z' = %b%n",ch<'a'||ch>'z');
System.out.printf("!('a' <= ch ch <= 'z') = %b%n",!(ch<'a'||ch>'z'));
System.out.printf(" 'a' <= ch && ch <= 'z' = %b%n",'a'<=ch && ch<='z');
*/
	/*
	// 문제 11
	System.out.print("키 입력(cm): ");
	int tall = sc.nextInt();
	System.out.print("몸무게 입력(kg): ");
	double kg = sc.nextDouble();
	if(kg<=(tall-100)*0.9) {
		System.out.println("정상");
	}else
		System.out.println("비만");
	
	// 문제 12
	System.out.print("시간 입력(초) : ");
	int second = sc.nextInt();
	int minute = second/60;
	minute%=60;
	int hour = second/3600;
	second%=60;
	System.out.println(hour+"시 "+minute+"분 "+second+"초");
	
	// 문제 13
	int pencil = 534;
	int student = 30;
	int result1 = pencil/student;
	int result2 = pencil%student;
	System.out.println("학생 "+student+"명에게 각각 "+result1+"개의 연필을 나눠주었고 "+result2+"개의 연필이 남았습니다.");

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
}*/
	
/*System.out.println("3개의 숫자 입력");
int[] array = new int[3];
array[0]=sc.nextInt();
array[1]=sc.nextInt();
array[2]=sc.nextInt();
int result = 0;
for(int i=0; i<array.length; i++) {
	if(array[i]>result)
		result = array[i];
}
System.out.println("가장 큰수는 "+result);*/

	/*System.out.print("임의의 달 입력(1~12) : ");
	int month = sc.nextInt();
	if(month>0 && month<13) {
		String str = (month<7) ? "상반기":"하반기";
		System.out.println(str+"입니다.");
	}*/

	/*System.out.print("천만 이하의 정수 입력 : ");
	int number = sc.nextInt();
	if(number<=10000000) {
		int[] array = new int[5];
		array[0] = number/10000;
		number-= array[0]*10000;
		array[1] = number/1000;
		number-= array[1]*1000;
		array[2] = number/100;
		number-= array[2]*100;
		array[3] = number/10;
		number-= array[3]*10;
		array[4] = number;
		System.out.println(array[0]+"만 "+array[1]+"천 "+array[2]+"백 "+array[3]+"십 "+array[4]+"원입니다.");
	}*/

	/*System.out.print("문자 입력하기: ");
	String word = sc.nextLine();
	System.out.print("값 입력: ");
	double value = sc.nextDouble();
	double f,c;
	if(word.equals("F") || word.equals("f")) {
		c = (5.0/9.0) * (value - 32);
		System.out.println(f);
	}else if(word.equals("C") || word.equals("c")){
		f = (9.0/5.0)*value + 32;
		System.out.println("??"+f);
	}
	else {
		System.out.println("F,f,C,c 중 입력");
	}*/

	/*System.out.print("실수입력 : ");
	double kgNum = sc.nextDouble();
	double pound = kgNum / 0.453592;
	System.out.printf("%.3f\n",pound);
	pound*=1000;
	pound= ((int)pound)/1000.0;
	System.out.println(pound);*/

	/*System.out.print("두 실수 입력하기: ");
	double dNumber1 = sc.nextDouble();
	double dNumber2 = sc.nextDouble();
	double dsum = dNumber1+dNumber2 ,davg = dsum/2;
	System.out.println(dsum);
	System.out.println(davg);
	
	int Number1 = (int)dNumber1;
	int Number2 = (int)dNumber2;
	int sum = Number1+Number2;
	int avg = sum /2;
	System.out.println(Number1);
	System.out.println(Number2);
	System.out.println(sum);
	System.out.println(avg);*/

	/*System.out.print("윤년 계산 년도 입력: ");
	int year = sc.nextInt();
	if((year%4 == 0 && year % 100 != 0) || year % 400 ==0) {
		System.out.println(year+"년은 윤년입니다.");
	}else
		System.out.println(year+"년은 윤년이 아닙니다.");*/
	/*Scanner sc = new Scanner(System.in);
	System.out.print("정수입력==>");
	int number1 = sc.nextInt();
	System.out.print("정수입력==>");
	int number2 = sc.nextInt();
	System.out.println();
	int sum = number1+number2;
	System.out.println(sum);
	int sub = number1-number2;
	System.out.println(sub);
	int mul = number1*number2;
	System.out.println(mul);
	int div = number1/number2;
	System.out.println(div);
	int mod = number1%number2;
	System.out.println(mod);
	if(number1%2==0)
		System.out.println("짝");
	else
		System.out.println("홀");*/
	/*Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int money500 = number/500;
	number-=money500*500;
	int money100 = number/100;
	number-=money100*100;
	int money50 = number/50;
	number-=money50*50;
	int money10 = number/10;
	number-=money10*10;
	
	
	System.out.println("500원짜리: "+money500);
	System.out.println("100원짜리: "+money100);
	System.out.println("50원짜리: "+money50);
	System.out.println("10원짜리: "+money10);
	System.out.println("바꾸지 못한 잔돈: "+number);*/
