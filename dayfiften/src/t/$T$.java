package t;

public class $T$ {
	public static void main(String[] args) {

	}

}

class Person<T> {
	public void fit(T t) {
		System.out.println(t.toString());
	}
}

class Dao<T extends FoodInterFace> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void select(T t) {
		System.out.println(t.toString());
	}

	public void insert(T t) {
		System.out.println(t.toString());
	}

	public void delete(T t) {
		System.out.println(t.toString());
	}
	public <K,V>void gggg(K k,V v){
		t.returnTKV(k, v);
	}

}

abstract class Food {
	private String name;

	public void xxx() {
		System.out.println("xxxx");
	}
}


class Bone extends Food {
	private String name;

	public Bone(String name) {
		super();
		this.name = name;
	}

	public Bone() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bone [name=" + name + "]";
	}

	public void ggg() {
		System.out.println("gggx");
	}
}


interface FoodInterFace {
	<K, V> void returnTKV(K k, V v);
}


class Fish implements FoodInterFace {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fish(String name) {
		super();
		this.name = name;
	}

	public Fish() {
		super();
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + "]";
	}

	@Override
	public <K, V> void returnTKV(K k, V v) {
		System.out.println(k + " " + v);
	}

}