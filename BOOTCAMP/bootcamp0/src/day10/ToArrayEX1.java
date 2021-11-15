package day10;

import java.util.ArrayList;

public class ToArrayEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("LA");
		list1.add("LA");
		list1.add("서울");
		list1.add("LA");
		list1.add("워싱턴");
		
		Object[] sa = list1.toArray(new String[list1.size()]);
		System.out.println(sa[2]);
		sa[4] = "인천";
		System.out.println(sa[4]);
		
	}

}
