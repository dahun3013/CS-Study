package day6;

public class ParentEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB bb = new BB();
	}

}

class B{
	public B() {
		System.out.println("B Ŭ���� �⺻");
	}
	B(String n, int t){
		System.out.println("B Ŭ���� ���");
	}
}

class BB extends B{
	public BB() {
		System.out.println("BBŬ���� �⺻");
	}
	public BB(int t, boolean e) {
		System.out.println("BBŬ���� ���");
	}
}