package ListTest;

import java.util.ArrayList;
import java.util.List;

public class TwoTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim", 30, 80, "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		int num = 0;
		for (Student student : list) {
			num += student.getAge();
		}
		System.out.println("计算所有学生的平均年龄:  " + num / list.size());
		int avergan = 0;
		int one = 0;
		int index = 1;
		for (int i = 0; i < list.size() - 1; i++) {
			one = list.get(i).getScore();
			for (int j = i + 1; j < list.size(); j++) {		
				if (list.get(i).getClassNum().equals(list.get(j).getClassNum())) {
					one += list.get(j).getScore();
					index++;
					
				}
				
			}
			System.out.println(list.get(i).getClassNum() + "的平均分" + one / index);
//			one = 0;
			index = 1;
		}

	}
}

class Student {
	private String name;
	private int age;
	private int score;
	private String classNum;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	public Student(String name, int age, int score, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	}

	public Student() {
		super();
	}

}