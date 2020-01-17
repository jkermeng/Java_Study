package quiztwo;

public class B extends A {
	public char[] g() {
		char a[] = new char[26];
		int j = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			a[j] = i;
			j++;
		}
		return a;

	}

}
