package day8;

public class AbstractClassEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Player{
	public abstract void play(int pos);
	public abstract void stop();
}

class AudioPlayer extends Player{
	public void play(int pos) {
		
	}
	public void stop() {
		
	}
}

abstract class TvPlay extends Player{
	abstract void tvScreen();
	abstract void tvSize();
}

class RealPlayer extends TvPlay{

	@Override
	void tvScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void tvSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
