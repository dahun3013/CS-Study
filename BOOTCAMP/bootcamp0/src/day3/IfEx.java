package day3;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 2,3,5,7 배수 제외 한행 10개 출력
		int a =0;
		int cnt=0;
		while(a<100) {
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
			a+=1;
			if(a%2==0 || a%3==0 || a%5==0 || a%7==0)
				continue;
			System.out.print(a+" ");
			cnt++;
		}
	}
}

/*String Number = "999999-1234567";
System.out.println(Number);
char gender = Number.charAt(7);
System.out.println(gender);
switch(gender) {
	case '1': case '3':{
		System.out.println("남자");break;
	}
	case '2': case '4':{
		System.out.println("여자");break;
	}
}*/

/*int computer = (int)(Math.random()*3)+1;
Scanner sc = new Scanner(System.in);
System.out.print("가위(1),바위(2),보(3) 중 하나 입력 : ");
int user = sc.nextInt();

System.out.println("컴퓨터는 "+computer+" 입니다.");
switch(user) {
	case 1:
		if(computer==2)
			System.out.println("컴퓨터의 승리입니다.");
		else if(computer==3)
			System.out.println("당신의 승리입니다.");
		else
			System.out.println("비겼습니다.");
		break;
	case 2:
		if(computer==3)
			System.out.println("컴퓨터의 승리입니다.");
		else if(computer==1)
			System.out.println("당신의 승리입니다.");
		else
			System.out.println("비겼습니다.");
		break;
	case 3:
		if(computer==1)
			System.out.println("컴퓨터의 승리입니다.");
		else if(computer==2)
			System.out.println("당신의 승리입니다.");
		else
			System.out.println("비겼습니다.");
		break;
	default:
		System.out.println("잘못된 입력입니다.");
		break;
}*/

/*/ 가위 바위 보 게임 만들기
Scanner sc = new Scanner(System.in);
System.out.print("가위(1), 바위(2), 보(3)중 하나를 입력하세요-->");
int user=sc.nextInt();
int com = (int) (Math.random()*3) + 1;
String panjung=null;
switch(com-user) {
  case 0:{
	  panjung="무승부";
	  break;
   }
  case 1: 
  case -2:{
	  panjung="컴승";
  }
  case -1: case 2:{
	  panjung="유저승";
  }
  
}//end switch
String userOuput=null;
switch(user) {
  case 1:
	userOuput="가위";break;
  case 2:
	userOuput="바위";break;
  case 3:
	userOuput="보";break;
}
String comOuput=null;
switch(com) {
  case 1:
	comOuput="가위";break;
  case 2:
	comOuput="바위";break;
  case 3:
	comOuput="보";break;
}
System.out.println("당신은 " + userOuput+"입니다");
System.out.println("컴퓨터는 " + comOuput+"입니다");
System.out.println(panjung+"했습니다");
*/

/*Scanner sc = new Scanner(System.in);
System.out.print("월 입력: ");
int month = sc.nextInt();
switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.println("현재의 계절은 봄입니다.");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("현재의 계절은 여름입니다.");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println("현재의 계절은 가을입니다.");
		break;
	case 12:
	case 1:
	case 2:
		System.out.println("현재의 계절은 겨울입니다.");
		break;
	default:
		System.out.println("입력 오류");
		break;	
}	*/

/*import java.util.*;
public class Calc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("더학기:+, 빼기:-, 곱하기:*, 나누기:/ 의 부호 1자 입력");
		System.out.print("계산할 부호는? ");
		char ch = input.next().charAt(0);
		System.out.print("숫자1==> ");
		int a = input.nextInt();
		System.out.print("숫자2==> ");
		int b = input.nextInt();
		double res=0;
		switch(ch) {
		case '+':
			res=a+b;
			break;
		case '-':
			res=a-b;
			break;
		case '*':
			res=a*b;
			break;
		case '/':
			if(b==0) {
				System.out.println("나누기가 불가능합니다");
				return;
			}
			res=(double)a/b;
			
		}
		System.out.printf("%d%c%d=%d\n",a,ch,b,(int)res);
	}
}*/


/*
 * String word="D";
		switch(word) {
		   case "A":
		   case "a":{
			   System.out.println("a로 시작되는 영어는 ant가 있다.");
			   break;//switch문을 빠져라
		    }
		   case "B":
		   case "b":{
			   System.out.println("b로 시작되는 영어는 bear가 있다.");
			   break;
		   }
		   case "C":
		   case "c":{
			   System.out.println("c로 시작되는 영어는 cat가 있다.");
			   break;
		   }
		   case "D":
		   case "d":{
			   System.out.println("d로 시작되는 영어는 dog가 있다.");
			   break;
		   }
		   default : {
			   System.out.println("a~d사이의 영문자가 아님");
		   }
		}

 */

/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("점수를 입력하세요 : ");
	int score = sc.nextInt();
	String grade;
	System.out.println("입력된 점수 "+score);
	
	if(score>100 || score<0)
		System.out.println("범위에러");
	else {
		if(score>=90)
			grade = "A";
		else if(score>=80)
			grade = "B";
		else if(score>=70)
			grade = "C";
		else if(score>=60)
			grade = "D";
		else
			grade = "F";
		
		if(!(score<60) && score%10>4)
			grade+="+";
		else
			grade+="o";
		
		System.out.println(grade);
	}
}*/

/*public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();

if(number>=90 && number<=100) {
	System.out.println("정수 number가 90이상 100이하");
}
if(number<0 || number>100)
	System.out.println("정수 number가 0보다 작거나 100보다 클 때");

if(number%3 ==0 && number%2 !=0)
	System.out.println("정수 number가 3의 배수이고 2의 배수가 아닐때");

char c = sc.nextLine().charAt(0);

if(c==' ' || c == '\t' || c=='\n')
	System.out.println("문자 c가 공백이거나 탭 또는 개행문자");

if(c>=65 && c<=90)
	System.out.println("대문자");
else if(c>=97 && c<=122)
	System.out.println("소문자");

String str = sc.nextLine();
if(str.equals("yes"))
	System.out.println("예스");
else if(str.toLowerCase().equals("yes") || str.equalsIgnoreCase("yes"))
	System.out.println("예스");

}*/

/*	public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("정수 입력: ");
int number = sc.nextInt();
if(number>0) {
	System.out.println("0보다 큼");
}else {
	System.out.println("0보다 작음");
}
if(number%5==0) {
	System.out.println("5배수");
}

}*/
