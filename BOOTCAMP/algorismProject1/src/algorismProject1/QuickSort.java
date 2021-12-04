package algorismProject1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Integer> array = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.print("학생"+i+" 점수 입력 : ");
			array.add(sc.nextInt());
		}
		
		
		System.out.println("성적 순으로 정렬");
		array = quickSort(array);
		for(int i=1; i<=n; i++) {
			System.out.println(i+"등 : "+array.get(i-1));
		}
	}
	public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() <= 1) return list;
        int pivot = list.get(list.size() / 2);

        List<Integer> lesserArr = new LinkedList<>();
        List<Integer> equalArr = new LinkedList<>();
        List<Integer> greaterArr = new LinkedList<>();

        for (int num : list) {
            if (num < pivot) lesserArr.add(num);
            else if (num > pivot) greaterArr.add(num);
            else equalArr.add(num);
        }

        return Stream.of(quickSort(greaterArr), equalArr, quickSort(lesserArr))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
