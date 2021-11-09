package day6;

public class SingletonEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2)
			System.out.println("같다");
		else
			System.out.println("다르다");
	}

}

class Singleton{
	private Singleton() {}
	private static class SingletonInnerClass {
		private static final Singleton instance = new Singleton();
	}
	public static Singleton getInstance() {
		return SingletonInnerClass.instance;
	}
}