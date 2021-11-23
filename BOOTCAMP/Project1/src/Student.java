import java.util.ArrayList;

public class Student {
	private String name = "�̸�";
	private int brith = 19900101;
	private String pNumber = "010-1111-2222";
	private String address = "�ּ��ּ�";
	private String classInfo = "1-3";
	private double grade = 2.3;
	private ArrayList<Score> scores;
	//ex) ����:60��, ����:70��
	
	public Student(String name, int brith, String pNumber, String address, String classInfo, double grade,
			ArrayList<Score> scores) {
		super();
		this.name = name;
		this.brith = brith;
		this.pNumber = pNumber;
		this.address = address;
		this.classInfo = classInfo;
		this.grade = grade;
		this.scores = scores;
	}

	public String toString() {
		String str = "";
		str+=name+"\t";
		str+=brith+"\t";
		str+=pNumber+"\t";
		str+=address+"\t";
		str+=classInfo+"\t";
		str+=grade+"\t";
		for(Score s :scores) {
			str+=s;
		}
		return str;
	}
}
