package day9;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add(new Integer(1));
		v1.add(new Integer(0));
		v1.add(new Integer(0));
		
		System.out.println(v1.get(0));
		
		Iterator iter = v1.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		v1.add(1,"B");
		System.out.println(v1.contains(0));
		
		//v1.remove(new Integer(1));
		Collections.sort(v1);
		
		iter = v1.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
	}

}
