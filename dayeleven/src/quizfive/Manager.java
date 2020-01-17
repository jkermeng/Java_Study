package quizfive;

public class Manager extends Employee {

	private int moneny = 5000;// 固定奖金额
	private double monenySystem;// 业绩系数

	public Manager() {
	}

	public Manager(String name, int number, String degree, int fundSalary) {
		super(name, number, degree, fundSalary);
	}

	public Manager(String name, int number, String degree, int fundSalary, int moneny, double monenySystem) {
		super(name, number, degree, fundSalary);
		this.moneny = moneny;
		this.monenySystem = monenySystem;
	}

	public int getMoneny() {
		return moneny;
	}

	public void setMoneny(int moneny) {
		this.moneny = moneny;
	}

	public double getMonenySystem() {
		return monenySystem;
	}

	public void setMonenySystem(double monenySystem) {
		this.monenySystem = monenySystem;
	}

	public double pay() {
		
		double b =this.getMoneny() * this.getMonenySystem();
		return b;
	}

	public double pay(int day) {
		
		return super.pay(day,this.pay());
	}

}
