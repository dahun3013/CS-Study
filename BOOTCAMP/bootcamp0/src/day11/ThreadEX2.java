package day11;

import javax.swing.JOptionPane;

public class ThreadEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx6_1 t6=new ThreadEx6_1();
		ThreadEx6_2 t7 = new ThreadEx6_2();
		Thread t77 = new Thread(t7);
		System.out.println(" t6.getPriority()=" +t6.getPriority());
		System.out.println(" t77.getPriority()=" + t77.getPriority());
		t77.start();
		t6.start();

	}

}

class ThreadEx6_1 extends Thread{
	public void run() {
		for(int i=50;i>0;i--) {
			System.out.println("-");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//剐府技农绰 1/1000檬 
		}
	}
}

class ThreadEx6_2 implements Runnable{
	@Override
	public void run() {
		for(int i=50;i>0;i--) {
			System.out.println("|");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//剐府技农绰 1/1000檬 
		}
	}
}
