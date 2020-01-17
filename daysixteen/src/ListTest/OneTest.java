package ListTest;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class OneTest {
	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList();
		arrlist.add("张三");
		arrlist.add("李四");
		arrlist.add("王五");
		arrlist.add("张三");
		arrlist.add("aaa");
		arrlist.add("bbb");
		arrlist.add("aaa");
		System.out.println(arrlist);
		
		for (int i = 0; i < arrlist.size()-1; i++) {
			
			for (int j = i+1; j < arrlist.size(); j++) {
				if(arrlist.get(i).equals(arrlist.get(j))){
					arrlist.remove(j);

				}
			}
		}
		System.out.println(arrlist);

	

	}

}