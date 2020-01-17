package student;

public class Student<T> implements Comparable<T> {
	private String name;
	private int sNum;
	private int sorce;

	public String getName() {
		return name;
	}

	public int getsNum() {
		return sNum;
	}

	public int getSorce() {
		return sorce;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public void setSorce(int sorce) {
		this.sorce = sorce;
	}

	public Student(String name, int sNum, int sorce) {
		super();
		this.name = name;
		this.sNum = sNum;
		this.sorce = sorce;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sNum=" + sNum + ", sorce=" + sorce + "]";
	}

	public Student() {

	}

	@Override
	public int compareTo(T o) {
		Student st = (Student) o;
		if (this.sorce > st.sorce) {
			return 1;
		} else if (this.sorce < st.sorce) {
			return -1;
		}

		return 0;

	}

}
