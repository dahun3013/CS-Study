package day9;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEX1 {

	public static void main(String[] args) {
		// List 계열
		ArrayList list1 =new ArrayList();
		//넣기
		list1.add(1);
		list1.add("a");
		list1.add(true);
		list1.add('c');
		list1.add(new A());
		list1.add("a");
		//빼기
		Iterator iter = list1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
class A{
	
}
