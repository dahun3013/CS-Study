package day13;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import day13.Student.Level;

public class StreamEX4 {

	public static void main(String[] args) {
		Student[] stuArr= {
				new Student("���ڹ�", true,1,1,300),
				new Student("������", false,1,1,250),
				new Student("���ڹ�", true,1,1,200),
				new Student("������", false,1,2,150),
				new Student("���ڹ�", true,1,2,100),
				new Student("������", false,1,2,50),
				new Student("Ȳ����", false,1,3,100),
				new Student("������", false,1,3,150),
				new Student("���ڹ�", true,1,3,200),

				new Student("���ڹ�", true,2,1,300),
				new Student("������", false,2,1,250),
				new Student("���ڹ�", true,2,1,200),
				new Student("������", false,2,2,150),
				new Student("���ڹ�", true,2,2,100),
				new Student("������", false,2,2,50),
				new Student("Ȳ����", false,2,3,100),
				new Student("������", false,2,3,150),
				new Student("���ڹ�", true,2,3,200) };

		System.out.printf("1. �ܼ� �׷�ȭ(�ݺ��� �׷�ȭ)%n");

		Map<Integer, List<Student>> stuByBan =
				Stream.of(stuArr)
				.collect(groupingBy(Student::getBan));
		for(List<Student> ban : stuByBan.values()) {
			for(Student s:ban) {
				System.out.println(s);
			}
		}
		System.out.printf("%n 2. �ܼ� �׷�ȭ(�������� �׷�ȭ)%n");

		Map<Student.Level,List<Student>> stuByLevel =
				Stream.of(stuArr)
				.collect(groupingBy(s->{
					if(s.getScore() >= 200) return Student.Level.HIGH;
					else if(s.getScore() >= 100) return Student.Level.MID;
					else return Student.Level.LOW;
				}));
		
		TreeSet<Student.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		for(Student.Level key : keySet) {
			System.out.println("[" + key + "]");
			for(Student s:stuByLevel.get(key)) {
				System.out.println(s);
				System.out.println();
			}
		}


		System.out.printf("%n 3. �ܼ� �׷�ȭ + ���(������ �л���)%n");

		Map<Student.Level, Long > stuCntByLevel =
				Stream.of(stuArr)
					.collect(groupingBy(s->{
						if(s.getScore() >= 200) return Student.Level.HIGH;
						else if(s.getScore() >= 100) return Student.Level.MID;
						else return Student.Level.LOW;
					},counting()));
		
		for(Student.Level key : stuCntByLevel.keySet()) 
			System.out.printf("[%s] - %d��,  ", key, stuCntByLevel.get(key));
		System.out.println();

		System.out.printf("%n 4. ���� �׷�ȭ(�г⺰, �ݺ�)%n");

		Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan =
				Stream.of(stuArr)
					.collect(groupingBy(Student::getHak,groupingBy(Student::getBan)));
					
		for(Map<Integer, List<Student>> hak : stuByHakAndBan.values()) {
			for(List<Student> ban : hak.values()) {
				System.out.println();
				for(Student s: ban) {
					System.out.println(s);
				}
			}
		}

		System.out.printf("%n 5. ���� �׷�ȭ + ���(�г⺰, �ݺ� 1��)%n");
		
		Map<Integer, Map<Integer, Student>> topStuByHakBan =
				Stream.of(stuArr)
				.collect(groupingBy(Student::getHak,
									groupingBy(Student::getBan,
											collectingAndThen(maxBy(comparingInt(Student::getScore)), Optional::get)
											)
									)
						);
		
		for(Map<Integer, Student> ban : topStuByHakBan.values())
			for(Student s : ban.values())
				System.out.println(s);

		System.out.printf("%n 6. ���� �׷�ȭ + ���(�г⺰, �ݺ� ���� �׷�)%n");
		
		Map<String, Set<Student.Level>>stuByScoreGroup =
				Stream.of(stuArr)
				.collect(groupingBy(s->s.getHak() +"-"+s.getBan(),
						mapping(s->{
							if(s.getScore() >= 200) return Student.Level.HIGH;
							else if(s.getScore() >= 100) return Student.Level.MID;
							else return Student.Level.LOW;
						},toSet())
					));
					
		Set<String> keySet2 = stuByScoreGroup.keySet();
		for(String key:keySet2) {
			System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
		}
	}
}
