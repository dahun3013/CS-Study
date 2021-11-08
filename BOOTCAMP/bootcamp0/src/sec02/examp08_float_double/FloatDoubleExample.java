package sec02.examp08_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수값 저장
		double var1 = 3.14;
		//float var2 = 3.14;
		float var3 = 3.14f;
		
		//정밀도 테스트
		double var4=0.123456789;
		float var5=0.123456789f;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	
		int var6=3000000;
		double var7=3e6;
		float var8=3e6f;
		double var9=2e-3;
	}

}
