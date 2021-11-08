package day1;

public class C01 {
	public static void main(String[] args) {
		System.out.println("정다훈");
		System.out.println("컴퓨터 공학과");
		System.out.println(100-80);
		System.out.println(50*4-100/5);
		int a,b,c;
		a=10;
		b=20;
		c=4500000;
		System.out.println(a+b+c);
		float f1,f2,f3,f4;
		f1=10.30f;
		f2=20.34f;
		f3=5.0f;
		f4=2.0f;
		
		System.out.println(f1*f2);
		System.out.println(f3/f4);
		
		ChildVar cv = new ChildVar();
		
		short ss1 =30;
		short ss2 = 40;
		int sum = ss1 + ss2;
		
		float fa = 10.0f;
		double dda=10.0;
		dda=fa;
		fa=(float)dda;
		fa = ss1;
		fa = sum;
		
	}

}
