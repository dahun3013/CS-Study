package day6;

public class ParentEX3 {

	public static void main(String[] args) {
		// supper 개념 익히기
		// 1. 부모 멤버 변수를 가르킬때  2. 부모생성자 호출할 때  조건 : 자식 생성자에서 반드시 첫줄에 쓸것		
         AA a = new AA();
         a.setName("부모님성함");
        // System.out.println(a.getName());
        //자식의 이름을 넣고 출력하기
         AA1 aa1 = new AA1();
         aa1.setName("자식의 이름");
        // System.out.println(aa1.getName());
         
         //AA1클래스의 메소드를 호출하기 pMethod(); //부모이름,  자식이름 2개 출력하기 
         aa1.pMethod();
         
         AA2 aa2 = new AA2();
         aa2.pM();
         
	}

}

class AA{
	//멤버변수 선언
	String ida;
	String name;//값을 부모이름
	//getter /setter 자동으로 만들기
    int age;
    
    
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIda() {
		return ida;
	}

	public void setIda(String ida) {
		this.ida = ida;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class AA1 extends AA{
	String idaa1;
	String name;
	
	void pMethod() {
		super.name="상속관계에서 부모이름";
		System.out.println(this.name);//AA1클래의 멤버변수인 것 가르킴 this
		System.out.println(super.name);//부모클래스의 멤버변수를 가르킨다. super
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdaa1() {
		return idaa1;
	}

	public void setIdaa1(String idaa1) {
		this.idaa1 = idaa1;
	}
	//사용자 정의한 메소드 
	void calA1() {
		this.idaa1 = "100";
		super.ida = "200";//부모클래스의 변수
	}
}

class AA2 extends AA {
	String idaa2;
    int age;
    
    
    
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdaa2() {
		return idaa2;
	}

	public void pM() {
		super.age=50;
		this.age=20;
		System.out.println(super.age);
		System.out.println(this.age);
		
	}

	public void setIdaa2(String idaa2) {
		this.idaa2 = idaa2;
	}
	
}