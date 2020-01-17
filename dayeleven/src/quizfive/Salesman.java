package quizfive;

public class Salesman extends Employee {
	private int salesvolume;// 当月销售额
	private double Percentage;// 酬金提取百分比

	public int getSalesvolume() {
		return salesvolume;
	}

	public void setSalesvolume(int salesvolume) {
		this.salesvolume = salesvolume;
	}

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(double percentage) {
		Percentage = percentage;
	}

	public Salesman(String name, int number, String degree, int fundSalary) {
		super(name, number, degree, fundSalary);
	}

	public Salesman(String name, int number, String degree, int fundSalary, int salesvolume, double percentage) {
		super(name, number, degree, fundSalary);
		this.salesvolume = salesvolume;
		Percentage = percentage;
	}

	public Salesman() {
	}

	public double pay(){
		double b = this.getSalesvolume() * this.getPercentage();

		return b;
	}
	// 工资总额
	public double pay(int day) {
		// 解决10%;百分号问题

		return super.pay(day, this.pay());
	}

}
