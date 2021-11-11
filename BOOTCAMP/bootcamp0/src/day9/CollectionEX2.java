package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(0));
		list1.add(new Integer(5));
		list1.add(new Integer(2));
		list1.add(new Integer(3));
		list1.add(new Integer(4));
		list1.add(new Integer(1));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		Collections.sort(list1);
		Collections.sort(list2);
		print("list1",list1);
		print("list2",list2);
		
		ArrayList list3 = new ArrayList();
		list3.add(new Integer(15));
		list3.add(new Integer(14));
		
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list3));
		boolean bo = list3.contains(new Integer(10));
		System.out.println(bo);
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print("list1",list1);
		print("list2",list2);
		
	}
	static void print(String str,ArrayList list) {
		Iterator iter = list.iterator();
		StringBuffer sb = new StringBuffer();
		sb.append(str+": [");
		while(iter.hasNext()) {
			sb.append(iter.next()+", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		System.out.println(sb);
	}

}
