package schoole;

public class Test {
	public static void main(String[] args) {
		Graduate graduate = new Graduate("zhangsan", "男", 22, 8000, 5000);
		if (graduate.getPay() - graduate.getFee() < 2000) {
			System.out.println("provide  a  loan");
		}
		System.out.println("年收入： "+graduate.getPay()*12+"\t"+"年学费： "+graduate.getFee()*2);
	}
}
