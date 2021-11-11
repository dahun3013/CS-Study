package day8;

public interface Moveable {
	void method();
	class M{}
	interface MI{}
	final static double PI = 3.14;
	final static String TITLE = "멀캠";
	int NUMBER = 100;
	//인터페이스에 있는 모든 것은 상수이기 때문에 final static 생략 가능
	abstract void a();
	abstract double b();
	abstract Student c();
	default void setMe() {}
	static void hi() {}
}
