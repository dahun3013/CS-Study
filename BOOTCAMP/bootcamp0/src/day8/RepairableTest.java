package day8;

public class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CC1Ŭ���� ��üȭ�ϱ� �Ϲ� Ŭ������ �󼼼��赵 �ϼ��� ���赵
				CC1 cc1 = new CC1();
				//C1Ŭ���� ��üȭ�ϱ�(�߻�Ŭ����) �� �� ����. �߻�Ŭ������ �̿ϼ��� ���赵  
				//C1 c1 = new C1();
				//I1 �������̽��� ��üȭ�ϱ� �� �� ����. �������̽��� �⺻���赵 
				// I1 i1 =new I1();
		        //�������̽��� ��üȭ�Ϸ��� �ڼ����� �Ϲ� Ŭ������ implements �� �� ����ϱ�

	}

}

interface Repairable{}
class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable{

	Tank() {
		super(150);
		hitPoint = MAX_HP;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Tank";
	}
	
}
/*
interface I1{
	//�߻�޼ҵ� 
	abstract void i1M();
}
interface II1 extends I1{
	abstract void ii1M();
}
interface II2 extends I1{
	abstract void ii2M();
}
//�߻�Ŭ�����ȿ��� �Ϲݸ޼ҵ�, �߻�޼ҵ� �� ���� �� �ִ�. 
abstract class C1 implements II1{
   //�߻�޼ҵ�
	abstract void cc1M();
		
}
class CC1 extends C1 implements II1, II2 {

	@Override
	public void i1M() {
		
		
	}

	@Override
	public void ii2M() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ii1M() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void cc1M() {
		// TODO Auto-generated method stub
		
	}

}
*/