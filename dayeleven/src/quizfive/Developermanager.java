package quizfive;

public class Developermanager extends Manager {

	
	public Developermanager(String name, int number, String degree, int fundSalary, int moneny, double monenySystem){
		super(name, number, degree, fundSalary,moneny,monenySystem);
	}
	
	public double pay() {

		return (super.pay() + new deep().getTechnicianMoneny())*0.5;
	}

	class deep extends Technician {
		public deep(String name, int number, String degree, int fundSalary, int payincrease, int monthwork,
				double coefficient) {
			super(name, number, degree, fundSalary, payincrease, monthwork, coefficient);
	
		}
		public deep(){
			
		}

		public double getTechnicianMoneny() {
			return super.pay();
		}
	}

}
