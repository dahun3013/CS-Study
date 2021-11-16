package day12;

import java.util.ArrayList;

public class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {	this.table = table; }

	public void run() {
		while(true) {
			// ������ �丮�� �ϳ� �����ؼ� table�� �߰��Ѵ�.
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);

			try { Thread.sleep(1);} catch(InterruptedException e) {}
		} // while
	}
}