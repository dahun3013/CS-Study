package day5;

public class classEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int a=0;
		//블록 만들기
		{
			int b;
			System.out.println("이곳은 블록입니다.-2");
			System.out.println( (a+=10) + "~");
		}
		//기본생성자 만들기
		A(){
			System.out.println("이곳은 기본생성자입니다.-3");
			System.out.println((a+=10) + "~~");
		}
		//정적 블록 만들기
		static {
			System.out.println("이곳은 정적 블록입니다-1");
		}
		{
			System.out.println("이곳은 블록입니다.-4");
			System.out.println( (a+=10) + "~~~");
		}*/
		//프로그래머가 정의하지 않으면 자바 컴파일러가 자동으로 만들어 준다. 단, {} 안에 아무것도 
		//넣지 않는다 그러므로 아무것도 셋팅되지는 않는다.
		/*
		static { }
		{ }
		A() { }
		*/

	}

}

class A{
	//클래스속에 넣을 수 있는 것들 - 멤버
    //속성  : 변수, 배열
	int a;
	int[] ia= {10,20,30};
	//메소드 
	void method01() { //메소드 기능 구현 
	}
	double method02() {
		return 0.0; //메소드 호출한 곳으로 실수형 값을 되돌려 주어라
	}
	//생성자
	A(){
		
	}
	//블록 
	{
		
	}
	//정적 블록
	static {
		
	}
	//클래스
	class AA{
		
	}
	
}
