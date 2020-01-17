package quizthree;

public class Graduate extends Student{
	private String studyDrection;

	public Graduate(String name, int age, String degree, String studyDrection) {
		super(name, age, degree);
		this.studyDrection = studyDrection;
	}

	public Graduate(String name, int age, String degree) {
		super(name, age, degree);
	}

	public String getStudyDrection() {
		return studyDrection;
	}

	public void setStudyDrection(String studyDrection) {
		this.studyDrection = studyDrection;
	}
	

}
