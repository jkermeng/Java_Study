package quiztwo;

public class C {
	public static void main(String[] args) {
		char[] f = new A().f();
		for (char c : f) {
			System.out.print(c + " ");
		}
		
		System.out.println("-*-*-*-*-*-*-*-");
		B b = new B();
		
		char[] f1 = b.f();
		for (char c : f1) {
			System.out.print(c + " ");
		}
		System.out.println();
		char[] g = b.g();
		for (char c : g) {
			System.out.print(c + " ");

		}
	}
}
