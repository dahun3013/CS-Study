package day7;

public class CastingTest1 {

	public static void main(String[] args) {
		//���������� ��ü�����ϱ�		�θ�Ŭ������ ������ = new �ڽ�Ŭ������();
		Tv t = new CaptionTv();
		//ūŸ�� = �θ�Ŭ����  ����Ÿ�� = �ڽ�Ŭ����
		t.power=true;
		t.channel=13;
		t.power();
		t.channelUp();
		t.channelDown();
		//t������ �θ�Ÿ���� ���� �Ǿ� �ֱ� ������ �ڽ� Ŭ������ ����� ���� ����
		//���޸𸮿��� �̹� CaptionTv�� ������� �÷��� �ִ�. 
		//�׷��� t������ �ڼ�Ÿ������ ����ȯ�� ���ش�.  down casting : ūŸ��--> ����Ÿ��
		CaptionTv ctt = (CaptionTv) t;
		ctt.text="ĸ��Tv";
		ctt.caption();
	}
}
class Tv{
	boolean power;//�������� on, off
	int channel;
	
	void power(){ power=!power; System.out.println(power);}
	void channelUp() { ++channel;System.out.println(channel); }
	void channelDown() { --channel; System.out.println(channel);}
	
}
class CaptionTv extends Tv{
	String text;
	void caption() { System.out.println(text); }
}

