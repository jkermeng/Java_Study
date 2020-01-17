package arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('b');
		list.add('d');
		list.add('b');

		
		for (Character character : list) {
			
			System.out.println(character);
		}
	}
}
