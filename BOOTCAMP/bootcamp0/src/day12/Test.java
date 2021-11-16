package day12;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sungjuk sj1 = new Sungjuk(2021,"자바",100,"컴공");
		Sungjuk sj2 = new Sungjuk(2020,"C",80,"산공");
		Sungjuk sj3 = new Sungjuk(2019,"HTML",100,"디자인");
		
		System.out.println("학번\t과목명\t점수\t전공명\t");
		System.out.println("--------------------------------------------");
		System.out.println(sj1);
		System.out.println(sj2);
		System.out.println(sj3);
	}

}

class Sungjuk{
	int stuHakBun;
	String stuSubject;
	int stuJumsu;
	String stuMajor;
	
	Sungjuk(int stuHakBun, String stuSubject, int stuJumsu, String stuMajor){
		this.stuHakBun = stuHakBun;
		this.stuSubject = stuSubject;
		this.stuJumsu = stuJumsu;
		this.stuMajor = stuMajor;
	}
	@Override
	public String toString() {
		return stuHakBun + "\t" + stuSubject+ "\t" + stuJumsu + "\t" + stuMajor;
	}
}