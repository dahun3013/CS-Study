package day2;

import java.util.Scanner;

public class OneOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0xAB, y = 0xF;
		String zero="00000000000000000000000000000000";//32��
		String temp = zero + Integer.toBinaryString(x);
		System.out.println(temp.substring(temp.length()-32));
		System.out.println(Integer.toBinaryString(x));
		System.out.printf("x= %#X \t\t%s\n", x, toBinaryString(x));
		
	}

	private static String toBinaryString(int x) {
		String zero="00000000000000000000000000000000";//32��
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
	// ���� 11
	System.out.print("Ű �Է�(cm): ");
	int tall = sc.nextInt();
	System.out.print("������ �Է�(kg): ");
	double kg = sc.nextDouble();
	if(kg<=(tall-100)*0.9) {
		System.out.println("����");
	}else
		System.out.println("��");
	
	// ���� 12
	System.out.print("�ð� �Է�(��) : ");
	int second = sc.nextInt();
	int minute = second/60;
	minute%=60;
	int hour = second/3600;
	second%=60;
	System.out.println(hour+"�� "+minute+"�� "+second+"��");
	
	// ���� 13
	int pencil = 534;
	int student = 30;
	int result1 = pencil/student;
	int result2 = pencil%student;
	System.out.println("�л� "+student+"������ ���� "+result1+"���� ������ �����־��� "+result2+"���� ������ ���ҽ��ϴ�.");

	// ���� 14
	System.out.println("���� �Է�: ");
	int number = sc.nextInt();
	System.out.println(number);
	if(number>99) {
		number/=100;
		number*=100;
	}else
		number=0;
	System.out.println(number);
}*/
	
/*System.out.println("3���� ���� �Է�");
int[] array = new int[3];
array[0]=sc.nextInt();
array[1]=sc.nextInt();
array[2]=sc.nextInt();
int result = 0;
for(int i=0; i<array.length; i++) {
	if(array[i]>result)
		result = array[i];
}
System.out.println("���� ū���� "+result);*/

	/*System.out.print("������ �� �Է�(1~12) : ");
	int month = sc.nextInt();
	if(month>0 && month<13) {
		String str = (month<7) ? "��ݱ�":"�Ϲݱ�";
		System.out.println(str+"�Դϴ�.");
	}*/

	/*System.out.print("õ�� ������ ���� �Է� : ");
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
		System.out.println(array[0]+"�� "+array[1]+"õ "+array[2]+"�� "+array[3]+"�� "+array[4]+"���Դϴ�.");
	}*/

	/*System.out.print("���� �Է��ϱ�: ");
	String word = sc.nextLine();
	System.out.print("�� �Է�: ");
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
		System.out.println("F,f,C,c �� �Է�");
	}*/

	/*System.out.print("�Ǽ��Է� : ");
	double kgNum = sc.nextDouble();
	double pound = kgNum / 0.453592;
	System.out.printf("%.3f\n",pound);
	pound*=1000;
	pound= ((int)pound)/1000.0;
	System.out.println(pound);*/

	/*System.out.print("�� �Ǽ� �Է��ϱ�: ");
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

	/*System.out.print("���� ��� �⵵ �Է�: ");
	int year = sc.nextInt();
	if((year%4 == 0 && year % 100 != 0) || year % 400 ==0) {
		System.out.println(year+"���� �����Դϴ�.");
	}else
		System.out.println(year+"���� ������ �ƴմϴ�.");*/
	/*Scanner sc = new Scanner(System.in);
	System.out.print("�����Է�==>");
	int number1 = sc.nextInt();
	System.out.print("�����Է�==>");
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
		System.out.println("¦");
	else
		System.out.println("Ȧ");*/
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
	
	
	System.out.println("500��¥��: "+money500);
	System.out.println("100��¥��: "+money100);
	System.out.println("50��¥��: "+money50);
	System.out.println("10��¥��: "+money10);
	System.out.println("�ٲ��� ���� �ܵ�: "+number);*/