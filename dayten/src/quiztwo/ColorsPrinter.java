package quiztwo;

public class ColorsPrinter extends Century {

	@Override
	public void printer() {
		System.out.println("彩色打印机");

	}

	@Override
	public void printer(Person p) {
		System.out.println(p.getName() + "信息");

	}

}
