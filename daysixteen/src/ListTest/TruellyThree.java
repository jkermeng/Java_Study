package ListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TruellyThree {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				if (o1.length() == o2.length()) {
					return 0;
				} else if (o1.length() < o2.length()) {
					return -1;
				}

				return 1;
			}

		});
		// TreeSet<String> ts = new TreeSet<>();
		ts.add("xiaoqiang");
		ts.add("zhangsan");
		ts.add("lisi");
		ts.add("xiaohua");
		ts.add("ruhua");
		ts.add("wangcai");
		System.out.println(ts);

	}
}
