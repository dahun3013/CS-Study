package day6;

public class SingTonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingTonClass st1 = SingTonClass.getInstance();
		SingTonClass st2 = SingTonClass.getInstance();
		
	}

}

class SingTonClass{
	private SingTonClass() {
		System.out.println("½Ì±ÛÅæ Å×½ºÆ®");
	}
	private static class InnerInstance{
		private static final SingTonClass instance = new SingTonClass();
	}
	public static SingTonClass getInstance() {
		return InnerInstance.instance;
	}
}