package quizfive;

public class test {
	public static void main(String[] args) {
		Manager manager = new Manager("��Ʒ����", 1, "top", 10000, 5000, 0.3);
		Salesman salesman = new Salesman("����С��", 2, "low", 5000, 300, 0.1);
		Manager manager2 =new Developermanager("��Ʒ����", 1, "top", 10000, 5000, 0.3);

		System.out.println(manager2.pay());
//		
//		Salesmanager salesmanager = new Salesmanager();
//		System.out.println(salesmanager.pay(0));
		
	}
}
