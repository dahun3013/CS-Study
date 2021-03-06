package day12;

import javax.swing.JOptionPane;

public class ThreadEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3_1 t1 = new Thread3_1();
		Thread3_2 r = new Thread3_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("메인 스레드 종료");
		
		Thread3_3 t3 = new Thread3_3();
		t3.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력 하신 값은 "+input+"입니다.");
		t3.interrupt();
		System.out.println("isInterrupted() : " + t3.isInterrupted());
	}

}

class Thread3_1 extends Thread{
	public void run() {
		for(int i=1; i<300;i++) {
			System.out.print("- ");
		}
	}
}

class Thread3_2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<300; i++) {
			System.out.print("| ");
		}
	}
	
}

class Thread3_3 extends Thread{
	public void run() {
		int i=10;
		while(i != 0 && !isInterrupted()) {
			System.out.println("@");
			for(int j=0;j<30; j++);
		}
		System.out.println("카운트가 종료 되었습니다.");
	}
}