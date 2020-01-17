package quizfive;

public class Technician extends Employee{
	//业绩工资
	private int payincrease;//每小时附加酬金
	private int monthwork;//月工作时数
	private double coefficient;//究完成进度系数
	
	public int getPayincrease() {
		return payincrease;
	}
	public void setPayincrease(int payincrease) {
		this.payincrease = payincrease;
	}
	public int getMonthwork() {
		return monthwork;
	}
	public void setMonthwork(int monthwork) {
		this.monthwork = monthwork;
	}
	public double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}
//	业绩工资
	public double pay(){

		return this.coefficient*this.monthwork*this.payincrease;
	}
//	工资总额
	public double pay(int day) {
		//解决10%;百分号问题
		//业绩总数
		return super.pay(day,this.pay());
	}
	
	public Technician(String name, int number, String degree, int fundSalary, int payincrease,
			int monthwork, double coefficient) {
		super(name, number, degree, fundSalary);
		this.payincrease = payincrease;
		this.monthwork = monthwork;
		this.coefficient = coefficient;
	}
	public Technician(String name, int number, String degree, int fundSalary) {
		super(name, number, degree, fundSalary);
	}
	public Technician() {}
	

}
