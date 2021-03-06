package day12;

public class ThreadEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnImplEX15 r = new RunnImplEX15();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(2000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class RunnImplEX15 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}