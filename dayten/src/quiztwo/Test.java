package quiztwo;

public class Test {
	public static void main(String[] args) {

		Century century = new ColorsPrinter();
		Century century2 = new WhiteBlackPrinter();

		Person p = new Person("Ð¡Ã÷");
		Person p2 = new Person("Ð¡ºì");
		
		century.printer();
		century2.printer();
		century.printer(p);
		century2.printer(p2);
		
	}
}
