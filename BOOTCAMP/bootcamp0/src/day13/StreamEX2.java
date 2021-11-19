package day13;

import java.util.Arrays;
import java.util.List;

public class StreamEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list =
				Arrays.asList(new Member("ȫ�浿",Member.MALE, 30),
				new Member("�質��",Member.FEMALE, 20),
				new Member("�ſ��",Member.MALE,45),
				new Member("�ڼ���",Member.FEMALE,27)
				);
		
		double avg = list.stream()
						.filter(m->m.getSex()==Member.MALE)
						.mapToInt(Member::getAge)
						.average()
						.getAsDouble();
		//list.stream().filter(m->m.getSex()==Member.MALE).mapToInt(m->m.getAge());
		System.out.println("������ ��� ���̴� "+avg);
	}

}

class Member{
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int sex;
	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	private int age;
	
	Member(String name, int sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
}
