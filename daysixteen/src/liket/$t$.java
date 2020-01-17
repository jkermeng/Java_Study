package liket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;

public class $t$ {
	public static void main(String[] args) {
		List<?> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("C");
		list = list2;

		List<Integer> list3 = new ArrayList();
		list3.add(1);
		list3.add(3);
		list3.add(6);
		list = list3;

		List<Student> al = new ArrayList<>();
		al.add(new Student(""));
		list = al;
		List<? extends People> list4 = new ArrayList<>();
		List<Worker> list5 = new ArrayList<>();
		List<Teacher> list6 = new ArrayList<>();
		// list4.add(new People());
		// list4.add(new Teacher());
		// list4.add(new Worker());
		list4 = list5;
		list5.add(new Worker<String>(""));
		list6.add(new Teacher());

		List<? super Worker> list7 = new ArrayList<>();
		List<People> list8 = new ArrayList<>();
		List<Teacher> list9 = new ArrayList<>();
		list8.add(new Worker<String>());
		list9.add(new Teacher());
		list7 = list8;
		// list7.add(new Teacher());
		// list7.add(new People());
		// list7 = list9;

		Collection c = new ArrayList();
		c.add("swas");
		c.add(null);
		System.out.println(c);
		Collection c1 = new ArrayList();
		c1.add(13);
		c1.addAll(c);
		System.out.println(c1);
		System.out.println(c1.contains(13));
		System.out.println(c.retainAll(c1));
		System.out.println(c);
		System.out.println(c1);
		Object[] array = c1.toArray();
		for (Object object : array) {
			System.out.println(object);
		}

		Collection cStudent = new ArrayList<>();
		cStudent.add(new Student("1"));
		cStudent.add(new Student("2"));
		cStudent.add(new Student("3"));
		cStudent.add(new Student("4"));
		cStudent.add(new Student("5"));
		Iterator iterator = cStudent.iterator();
		while (iterator.hasNext()) {
			Student next = (Student) iterator.next();

			System.out.println(next.getName());
		}
		List<Integer> list10 = new ArrayList<>();
		List<Integer> list11 = new ArrayList<>();
		list11.add(-1);
		list11.add(-2);
		list10.add(1);
		list10.add(2);
		list10.addAll(1, list11);
		System.out.println(list10);
		System.out.println("JSON------");
		JSONObject js = new JSONObject();
		js.put("1", c);
		js.valueToString(c);
		
		System.out.println(js.get("1"));

	}
}

class Teacher {
	private String name;

	public Teacher(String name) {
		super();
		this.name = name;
	}

	public Teacher() {
		super();
	}

}

class Worker<T> extends People {
	private String name;

	public Worker(String name) {
		super();
		this.name = name;
	}

	public Worker() {
		super();
	}

}

class People extends Teacher {
	private String name;

	public People(String name) {
		super();
		this.name = name;
	}

	public People() {
		super();
	}

}

class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
	}

}