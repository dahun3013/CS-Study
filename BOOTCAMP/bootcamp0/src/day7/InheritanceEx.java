package day7;

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		p.name = "������";
		p.age = 28;
		c.phone = "010-1234-5678";
		p.method1();
		c.method2();
	}
}
class Parent{
	String name;
	int age;
	Parent(){
		
	}
	void method1() {
		
	}
}
class Child extends Parent{
	String phone;
	public Child() {
		
	}
	void method2() {
		
	}
}
