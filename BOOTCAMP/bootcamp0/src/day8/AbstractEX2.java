package day8;

public class AbstractEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine m = new Marine();
		m.move(10, 20);
		m.stop();
		m.stimPack();
		Tank t = new Tank();
		t.move(30,40);
		t.stop();
		t.changeMode();
		Dropship d = new Dropship();
		d.move(50, 60);
		d.stop();
		d.unload();
	}

}

abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	abstract void stop();
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("마린이 "+x+", "+y+" 움직임");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린이 멈춤");
	}
	
	void stimPack() {
		System.out.println("스팀 팩 사용");
	}
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("탱크가 "+x+", "+y+" 움직임");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 멈춤");
	}
	
	void changeMode() {
		System.out.println("모드 변경");
	}
}

class Dropship extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽이 "+x+", "+y+" 움직임");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽이 멈춤");
	}
	
	void unload() {
		System.out.println("드랍 함");
	}
}