package student;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		Student stus[] = new Student[5];
		stus[0] = new Student("獲獲", 1001, 80);
		stus[1] = new Student("獲獲", 1002, 98);
		stus[2] = new Student("獲獲", 1003, 90);
		stus[3] = new Student("獲獲", 1004, 60);
		stus[4] = new Student("獲獲", 1005, 70);
		Arrays.sort(stus);
	
		for (Student student : stus) {
			System.out.println(student);
		}
	
	}
}
