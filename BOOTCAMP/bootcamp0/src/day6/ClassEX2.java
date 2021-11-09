package day6;

public class ClassEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member user1 = new Member("È«±æµ¿","hong");
		Member user2 = new Member("±èÀÚ¹Ù","java");
	}
}
class Member{
	String name;
	String id;
	String password;
	int age;
	
	Member(String str1, String str2){
		this.name = str1;
		this.id = str2;
	}
}
class MemberService{
	void login(String id, int password) {
		
	}
	void logout() {
		
	}
}
