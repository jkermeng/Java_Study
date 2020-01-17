package quizfive;

public class Technician extends Employee{
	//ҵ������
	private int payincrease;//ÿСʱ���ӳ��
	private int monthwork;//�¹���ʱ��
	private double coefficient;//����ɽ���ϵ��
	
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
//	ҵ������
	public double pay(){

		return this.coefficient*this.monthwork*this.payincrease;
	}
//	�����ܶ�
	public double pay(int day) {
		//���10%;�ٷֺ�����
		//ҵ������
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
