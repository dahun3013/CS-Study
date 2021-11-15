package day10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayAsListEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("È«±æµ¿","½Å¿ë±Ç","±èÀÚ¹Ù");
		System.out.println(list1.get(1));
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int i=0; i<list2.size(); i++) {
			System.out.print(list2.get(i)+" ");
		}
		System.out.println();
		
		for(int n :list2) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		Iterator<Integer> iter = list2.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		int ido = list1.indexOf("±èÀÚ¹Ù");
		System.out.println(ido);
		ido = list1.indexOf("Á¤ÇöÈñ");
		System.out.println(ido);
	}
}
