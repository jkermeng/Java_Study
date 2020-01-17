package arrlistlearn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import util.lcomparaa;

public class demo {
	public static void main(String[] args) {
		// long begin = System.currentTimeMillis();
		// ArrayList<Student> arrlist = new ArrayList<>();

		// for (int i = 0; i < 10000000; i++) {
		// arrlist.add(new Student("name", i));
		// }
		// long end = System.currentTimeMillis();
		// System.out.println(end - begin);
		// System.out.println(arrlist);
		// long lbegin = System.currentTimeMillis();
		//
		// LinkedList<Student> llist = new LinkedList<>();
		// for (int i = 0; i < 10000000; i++) {
		// llist.add(new Student("name", i));
		// }
		// long lend = System.currentTimeMillis();
		// System.out.println(lend - lbegin);
		// lcomparaa lc = new lcomparaa();
		// lc.addcompara(100000);
		// lc.seleccompara(464848);
		Set<Student> map = new LinkedHashSet<>();
		map.add(new Student("xxx",1));
		map.add(new Student("xxx",2));
		Student student = new Student("xxx",3);
		map.add(student);
		map.remove(student);
		System.out.println(map);
		
	}

}
