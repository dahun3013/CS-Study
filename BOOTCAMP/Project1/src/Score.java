
public class Score {
	private String subjectName;
	private int score;
	
	public Score(String subjectName, int score) {
		super();
		this.subjectName = subjectName;
		this.score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getScore() {
		return score;
	}

	public String toString() {
		return subjectName+":"+score;
	}
}
