package quiztwo;

public class WhiteBlackPrinter extends Century {

	@Override
	public void printer() {

		System.out.println("黑白打印机");

	}

	@Override
	public void printer(Person p) {
		System.out.println(p.getName()+"信息");
	}

}
