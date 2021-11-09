package day6;

public class ParentEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB bb = new BB();
	}

}

class B{
	public B() {
		System.out.println("B 클래스 기본");
	}
	B(String n, int t){
		System.out.println("B 클래스 명시");
	}
}

class BB extends B{
	public BB() {
		System.out.println("BB클래스 기본");
	}
	public BB(int t, boolean e) {
		System.out.println("BB클래스 명시");
	}
}