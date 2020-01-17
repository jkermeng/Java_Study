package quiztwo;

public class A {
	public char[] f() {
		char a[] = new char[26];
		int j = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			a[j] = i;
			j++;
		}
		return a;

	}

}
