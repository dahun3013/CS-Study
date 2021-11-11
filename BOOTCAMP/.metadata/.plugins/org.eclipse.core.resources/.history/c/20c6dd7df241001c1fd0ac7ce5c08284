package day8;
//스태틱 static 중첩 클래스 
/* class A{
    static class B{
    }
} 
특징 : 외부의 인스턴스 멤버들을 사용할 수 없다. 외부의 스태틱 멤버들은 사용할 수 있다. 
*/
public class InnerEX3 {

	public static void main(String[] args) {
		//스태틱 내부클래스 객체생성은 외부객체를 생성하지 않고도 바로 객체생성할 수 있다.  
		 //스태틱 멤버들 사용법  클래스명.멤버명
		 A.B.sib =100;
		 A.siaM();
		 A.sia = 90;
		 A.B.sibM();
		 
		 A.B ab =new A.B();
         ab.bB();
         
         //인스턴스 멤버 사용법 참조변수명.멤버명
         ab.iB=100;
         ab.ibM();
         ab.bB();
         
         A a = new A();
         a.ia=100;
         a.iaM();
         
	}

}

class A{
	int ia=10;
	static int sia=100;
	void iaM() {};
	static void siaM() { };
	
	static class B{
		int iB=20;
		static int sib=200;
		void ibM() { }
		static void sibM() { }
		void bB() {
			//ia = ia +100; 밖에 있는 인스턴스 변수 사용 못함
			sia = sia + 100;
			//iaM(); 밖에 있는 인스턴스 메소드 사용 못함
			siaM();
			iB=iB+100;
			ibM();
			sibM();
		}
		
		
		
	}
}
