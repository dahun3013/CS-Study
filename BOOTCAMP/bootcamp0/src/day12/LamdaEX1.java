package day12;

import java.util.HashMap;
import java.util.List;

public class LamdaEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction m1 = (x,y)->{
			System.out.println("람다식1 "+x+" "+y);
		};
		m1.abMethod(10, 20);
		
		MyFunction2 m2 = (a,b,c)->{
			if(a)
				System.out.println(b);
			else
				System.out.println(c);
			return 0;
		};
		m2.mf2(true, "정다훈", 3.5);
	}
	private static <T> List<T> doSomething(HashMap<T,T> f, List<T> list){
		return null;
	}
}

@FunctionalInterface
interface MyFunction{
	abstract void abMethod(int x, int y);
}

interface MyFunction2{
	int mf2(boolean a, String b, double c);
}