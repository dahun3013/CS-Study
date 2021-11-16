package day12;

public class ThreadYieldEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadY1 ty1 = new ThreadY1();
		ThreadY2 ty2 = new ThreadY2();
		ty1.start();
		ty2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ty1.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ty1.work = true;
		ty1.stop = true;
		ty2.stop = true;
		for(int i=0; i<300; i++) {
			System.out.println("���� ������");
		}
	}

}

class ThreadY1 extends Thread{
	public boolean stop = false;
	public boolean work = true;
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("Thread �۾���Y1...");
			}else {
				Thread.yield();
			}
		}
		System.out.println("������ ����");
	}
}

class ThreadY2 extends Thread{
	public boolean stop = false;
	public boolean work = true;
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("Thread �۾���Y2...");
			}else {
				Thread.yield();
			}
		}
		System.out.println("������ ����");
	}
}