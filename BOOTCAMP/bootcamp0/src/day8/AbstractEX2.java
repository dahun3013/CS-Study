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
		System.out.println("������ "+x+", "+y+" ������");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ����");
	}
	
	void stimPack() {
		System.out.println("���� �� ���");
	}
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("��ũ�� "+x+", "+y+" ������");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ũ�� ����");
	}
	
	void changeMode() {
		System.out.println("��� ����");
	}
}

class Dropship extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("������� "+x+", "+y+" ������");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������� ����");
	}
	
	void unload() {
		System.out.println("��� ��");
	}
}