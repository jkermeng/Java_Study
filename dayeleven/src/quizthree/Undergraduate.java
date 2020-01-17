package quizthree;

public class Undergraduate extends Student{
	private String specialty;

	public Undergraduate(String name, int age, String degree) {
		super(name, age, degree);
	}

	public Undergraduate(String name, int age, String degree, String specialty) {
		super(name, age, degree);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	
}
