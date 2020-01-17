package monkeyEat;

public class SimpleModle {
	private static SimpleModle sm;
	private int id = 100;
	private String name = "asd";

	private SimpleModle() {

	}

	public SimpleModle getSm() {
		return sm;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setSm(SimpleModle sm) {
		this.sm = sm;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static SimpleModle getSimpleModle() {
		if (sm == null) {
			sm = new SimpleModle();
		}
		return sm;
	}

}
