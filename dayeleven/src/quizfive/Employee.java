package quizfive;

public abstract class Employee {
	private String name;
	private int number;
	private String degree;
	private int fundSalary;
	


	public double pay(int day ,double workSalary) {
		//基本月工资
		int allday = 30;
		allday -= day;
		return allday*(this.fundSalary/30)+workSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getFundSalary() {
		return fundSalary;
	}

	public void setFundSalary(int fundSalary) {
		this.fundSalary = fundSalary;
	}


/**
 * 
 * @param name 姓名
 * @param number 、职工号
 * @param degree 工资级别
 * @param fundSalary 实发基本工资
 * @param workSalary 业绩工资
 */
	public Employee(String name, int number, String degree, int fundSalary) {
		super();
		this.name = name;
		this.number = number;
		this.degree = degree;
		this.fundSalary = fundSalary;

	}

	public Employee() {
		super();
	}

}
