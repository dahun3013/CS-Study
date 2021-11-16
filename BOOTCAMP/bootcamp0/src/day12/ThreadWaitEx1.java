package day12;

import java.util.ArrayList;

class ThreadWaitEx1 {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // ���� �����尡 �����ϴ� ��ü

		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut"),  "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
	
		// 0.1��(100 �и� ������) �Ŀ� ���� �����Ų��.
		Thread.sleep(100);
		System.exit(0);
	}
}
