package day12;

import java.util.stream.Stream;

public class StreamEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Student> stStream =
				Stream.of(new Student("���ڹ�",3,300),
						new Student("���ڹ�",1,200),
						new Student("���ڹ�",2,100),
						new Student("���ڹ�",3,200),
						);
		stStream.sorted();
	}

}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	Student(String name, int ban, int totalScore){
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.totalScore - totalScore;
	}
	
}
