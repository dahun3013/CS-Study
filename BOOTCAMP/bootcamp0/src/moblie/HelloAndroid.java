package moblie;

public class HelloAndroid {
	static String gstr = "전역변수";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, Android Application";
		System.out.println(str);
	}
	static void method() {
		System.out.println(gstr);
	}

}
