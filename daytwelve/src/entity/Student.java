package entity;

import java.awt.geom.FlatteningPathIterator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Comparable, Serializable {

	private String name;
	private int sroce;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSroce() {
		return sroce;
	}

	public void setSroce(int sroce) {
		this.sroce = sroce;
	}

	public Student(String name, int sroce) {
		super();
		this.name = name;
		this.sroce = sroce;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sroce=" + sroce + "]";
	}

	public static void main(String[] args) throws Exception {

		Comparable t1 = new Student("小明", 22);
		Comparable t2 = new Student("小清", 25);
		Comparable t3 = new Student("小二", 30);
		Comparable t4 = new Student("小流", 52);
		Comparable t5 = new Student("小平", 21);
		Student stu[] = new Student[5];
		stu[0] = (Student) t1;
		stu[1] = (Student) t2;
		stu[2] = (Student) t3;
		stu[3] = (Student) t4;
		stu[4] = (Student) t5;
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\java203\\Student.sss");
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
		out.writeObject(stu);
		out.close();
		fileOutputStream.close();

		Student stu2[] = new Student[5];
		FileInputStream filein = new FileInputStream("D:\\java203\\Student.sss");
		ObjectInputStream in = new ObjectInputStream(filein);
		stu2 = (Student[]) in.readObject();
		in.close();
		filein.close();
		for (Student student : stu2) {
			System.out.println(student.toString());
		}
		// Arrays.sort(stu);
		// for (Student student : stu) {
		// System.out.println(student.toString());
		// }
		//
		// Comparable<Student> s = new Student("战士", 100);
		// Student s2 = new Student("勇士", 100);
		// int compareTo = s.compareTo(s2);
		// if (compareTo > 0) {
		// System.out.println("前者大");
		// } else if (compareTo < 0) {
		// System.out.println("后者大");
		//
		// } else {
		// System.out.println("相同");
		// }

	}

	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		if (student.getSroce() == this.sroce) {
			return 0;
		} else if (student.getSroce() < this.sroce) {
			return -1;
		} else {
			return 1;
		}

	}

}
