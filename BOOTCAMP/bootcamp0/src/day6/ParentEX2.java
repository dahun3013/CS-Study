package day6;

public class ParentEX2 {

	public static void main(String[] args) {
		// 멤버변수안에 값을 넣을 때 메소드호출을 통해서 넣기
		//1단계 객체생성을 한다.
		A a = new A();
		
		//2단계 메소드를 호출한다.
		a.setName("정다훈");
		System.out.println(a.getName());
		a.setKind("사탕");
		System.out.println(a.getKind());
		a.setCount(10);;
		System.out.println(a.getCount());
		a.setOk(true);
		System.out.println(a.getOk());
		a.setRate(3.4);
		System.out.println(a.getRate());
	}

}
class A{
	//멤버 변수, 멤버필드,  클래스변수
	String name;
	String kind;
	int count;
	boolean ok;
	double rate;
	//setter메소드 만들기 역할 멤버변수에 값 넣기
	void setName(String name) {
		this.name=name;
	}
	void setKind(String kind) {
		this.kind=kind;
	}
	void setCount(int count) {
		this.count = count;
	}
	void setOk(boolean ok) {
		this.ok=ok;
	}
	void setRate(double rate) {
		this.rate=rate;
	}
	double getRate() {
		return rate;
	}
	
	//getter메소드 만들기
	String getName() {
		return name;
	}
	String getKind() {
		return kind;
	}
	int getCount() {
		return count;
	}
	boolean getOk() {
		return ok;
	}
	double rate() {
		return rate;
	}
	
	
}
