package quiztwo;

public class Test {
	public static void main(String[] args) {

		Century century = new ColorsPrinter();
		Century century2 = new WhiteBlackPrinter();

		Person p = new Person("С��");
		Person p2 = new Person("С��");
		
		century.printer();
		century2.printer();
		century.printer(p);
		century2.printer(p2);
		
	}
}
