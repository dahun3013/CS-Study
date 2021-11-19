package day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEX1 {
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList =
				Arrays.asList(new Student("������",10)
						,new Student("������",20)
						,new Student("�ٴٴ�",30)
						);
		double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("����� "+avg);
		//int ssum = studentList.stream().mapToInt(Student::getScore).sum();
		IntStream stream = IntStream.rangeClosed(1,100);
		stream.forEach(a-> sum += a);
		System.out.println("����: "+sum);
	}

}
