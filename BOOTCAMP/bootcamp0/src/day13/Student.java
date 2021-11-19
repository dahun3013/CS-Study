package day13;

public class Student implements Comparable<Student>{
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}

	Student(String name, boolean isMale, int hak, int ban, int score){
		this.name = name;
		this.isMale = isMale;
		this.hak=hak;
		this.ban = ban;
		this.score= score;
	}
	String getName() {return name;}
	boolean isMale() {return isMale;}
	int getHak() {return hak;}
	int getBan() {return ban;}
	int getScore() {return score;}
	public String toString() {
		return String.format("[%s, %s,  %d학년  %d반, %3d점 ]",
				name, isMale ? "남":"여", hak, ban, score);
	}

	enum Level{HIGH, MID, LOW }
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
		//return Integer.compare(score,o.score);
	}
}
