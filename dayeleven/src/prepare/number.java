package prepare;

public class number implements biaojiao {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public number(int a) {
		super();
		this.a = a;
	}

	public number() {
		super();
	}

	@Override
	public boolean b(A a) {

		return this.a > a.getA();

	}

}
