package schoole;

public class Graduate implements IStudentInterface, ITeacherInterface {
	private String name;
	private String sex;
	private int age;
	private double fee;// 每学期学费
	private double pay;// 月工资

	public Graduate(String name, String sex, int age, double fee, double pay) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}

	public Graduate() {
	}

	@Override
	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public double getPay() {
		return this.pay;
	}

	@Override
	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public double getFee() {
		return this.fee;
	}

}
