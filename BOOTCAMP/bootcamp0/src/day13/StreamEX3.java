package day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(
				"È«±æµ¿","½Å¿ë±Ç","½Å¿ë±Ç","½Å¿ë±Ç","±èÀÚ¹Ù","½Å¼­Áø","½Å¹ÎÃ¶");
		list.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("=====");
		list.stream()
			.distinct()
			.filter(s->s.startsWith("½Å"))
			.forEach(s->System.out.println(s));
		
		List<String> inputList1 = Arrays.asList("java8 lamda","stream mapping");
		inputList1.stream()
			.flatMap(data->Arrays.stream(data.split(",")))
					.forEach(word->System.out.println("word"));
		System.out.println("-----------");
		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
		intStream.sorted().forEach(i->System.out.println(i+" "));
		List<Student> studentList= 
				Arrays.asList(new Student("È«±æµ¿1", 30),
						new Student("È«±æµ¿2",10),
						new Student("È«±æµ¿3",20));
		System.out.println("-----------");
		studentList.stream().sorted().forEach(s->System.out.print(s.getName()+" , "));
	}

}