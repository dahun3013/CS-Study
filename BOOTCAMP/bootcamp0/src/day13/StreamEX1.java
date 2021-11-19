package day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEX1 {
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList =
				Arrays.asList(new Student("가가가",10)
						,new Student("나나나",20)
						,new Student("다다다",30)
						);
		double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("평균은 "+avg);
		//int ssum = studentList.stream().mapToInt(Student::getScore).sum();
		IntStream stream = IntStream.rangeClosed(1,100);
		stream.forEach(a-> sum += a);
		System.out.println("총합: "+sum);
	}

}
