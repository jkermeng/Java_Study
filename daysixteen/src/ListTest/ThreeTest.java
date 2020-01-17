package ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreeTest {
	public static void main(String[] args) {

		List<Worker> list = new ArrayList<>();
		list.add(new Worker("zhang3", 18, 3000));
		list.add(new Worker("li4", 25, 3500));
		list.add(new Worker("wang5", 25, 3200));
		System.out.println(list.toString());
		list.add(1, new Worker("zhao6", 24, 3300));
		list.remove(3);
		for (Worker worker : list) {
			System.out.println(worker.toString());
		}
		Iterator<Worker> iterator = list.iterator();
		while (iterator.hasNext()) {
			Worker next = iterator.next();
			
			String string = next.toString();
			System.out.println(string);
			
			System.out.println(next.equals(next));
		}

	}
}

class Worker {
	private String name;
	private int age;
	private int sasry;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSasry() {
		return sasry;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSasry(int sasry) {
		this.sasry = sasry;
	}

	public Worker(String name, int age, int sasry) {
		super();
		this.name = name;
		this.age = age;
		this.sasry = sasry;
	}

	public Worker(String name) {
		super();
		this.name = name;
	}

	public Worker() {
		super();
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", sasry=" + sasry + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Worker worker = (Worker) obj;
		if (worker.getName().equals(this.name) && worker.getAge() == this.age && worker.getSasry() == this.sasry) {
			return true;
		}
		return false;
	}

}