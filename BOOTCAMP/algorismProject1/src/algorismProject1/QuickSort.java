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
		System.out.print("�л� �� �Է� : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Integer> array = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.print("�л�"+i+" ���� �Է� : ");
			array.add(sc.nextInt());
		}
		
		
		System.out.println("���� ������ ����");
		array = quickSort(array);
		for(int i=1; i<=n; i++) {
			System.out.println(i+"�� : "+array.get(i-1));
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
