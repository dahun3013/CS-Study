package day8;

public interface Moveable {
	void method();
	class M{}
	interface MI{}
	final static double PI = 3.14;
	final static String TITLE = "��ķ";
	int NUMBER = 100;
	//�������̽��� �ִ� ��� ���� ����̱� ������ final static ���� ����
	abstract void a();
	abstract double b();
	abstract Student c();
	default void setMe() {}
	static void hi() {}
}
