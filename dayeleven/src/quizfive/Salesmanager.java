package quizfive;

public class Salesmanager extends Manager {

	public double pay() {
		double b = new deep().getSalesmanMoney() + this.getManagerMoney();
		return 0.0;
	}

	public double getManagerMoney() {
		return super.getMoneny() * 0.5;
	}

	public Salesmanager() {}

	class deep extends Salesman {
		public double getSalesmanMoney() {
			double b = super.getSalesvolume() + super.getPercentage();
			System.out.println(super.getSalesvolume());
			return b;
		}

	}

}
