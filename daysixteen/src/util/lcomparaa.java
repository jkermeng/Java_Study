package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import arrlistlearn.Student;

public class lcomparaa {
	private static LinkedList<Student> ll = new LinkedList<>();
	private static ArrayList<Student> al = new ArrayList<>();

	public void arrlist(Student s) {
		al.add(s);

	}

	public void linklist(Student s) {
		ll.add(s);
		

	}

	public void addcompara(int i) {
		long currentTimeMillis = System.currentTimeMillis();
		for (int j = 0; j < i; j++) {
			ll.add(new Student("name", j));
		}
		long currentTimeMillis2 = System.currentTimeMillis();
		
		long currentTimeMillis4 = System.currentTimeMillis();
		for (int k = 0; k < i; k++) {
			al.add(new Student("time", k));
		}
		long currentTimeMillis3 = System.currentTimeMillis();
		System.out.println((currentTimeMillis2 - currentTimeMillis) + "LinkList<>ArrayList"
				+ (currentTimeMillis4 - currentTimeMillis3));
	}

	public void seleccompara(int age) {
		long begin = System.currentTimeMillis();
		long lend = 0;
		
		Iterator<Student> iterator2 = ll.iterator();
		while (iterator2.hasNext()) {
			Student next = iterator2.next();
			if (next.getAge() == age) {
				ll.remove(age);
				lend = System.currentTimeMillis();
				System.out.print("linklist" + (lend - begin) + "--------");
				break;
			}
		}
		long currentTimeMillis = System.currentTimeMillis();
		long aend = 0;
		Iterator<Student> iterator = al.iterator();
		
		while (iterator.hasNext()) {
			Student next = iterator.next();
			if (next.getAge() == age) {
				al.remove(age);
				aend = System.currentTimeMillis();
				System.out.print("arrlist" + (aend - currentTimeMillis));
				break;
			}
		}
	}
}
