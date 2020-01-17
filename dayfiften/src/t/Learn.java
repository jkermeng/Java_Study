package t;

public class Learn {
	public static void main(String[] args) {
		// Father f = new Father();
		// f.fatherMethod("shwehn");
		// Son<Integer> s = new Son<>();
		// s.fatherMethod("asdsad");
		// s.sonMethod("jk");
		// Son<String> son = new Son();
		Father<String> f = new Father<String>();
//		Eat<Son<String>> eat = new Eat();
//		 eat.setT(son);
		System.out.println();
//		Son<Eat> sson = new Son();
	}
}

class Father<T> {
	private String name = "Father";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fatherMethod(T t) {
		System.out.println(t);
	}
}

class Son<String> extends Father<String> {

	public Son() {
		// sonMethod();
	}

	private Integer age = 10;

//	public void sonMethod(T t) {
//		System.out.println(t);
//		System.out.println("Son+" + age);
//	}
//}

// 此次T只能使用Father类型或子类如Son
class Eat<T extends Father<?>> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public T returnEntity(T t) {
		return t;
	}
}
}