package Singleton;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getinstense() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;

	}

	public Object readResovle() {
		return singleton;
	}
}
