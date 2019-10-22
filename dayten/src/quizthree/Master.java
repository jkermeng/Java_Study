package quizthree;

import java.time.chrono.IsoChronology;

public class Master {
	private String name;

	public Master() {
		super();
	}

	public Master(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void feed(Pet p, Food f) {
		System.out.println(this.name + "��ι" + p.getName() + "��" + f.getName());

		if (f instanceof Bone && p instanceof Dog) {
			System.out.println(p.getName() + "�ڳ�" + f.getName());
		} else if (f instanceof Fish && p instanceof Cat) {
			System.out.println(p.getName() + "�ڳ�" + f.getName());
		} else {
			System.out.println(p.getName() + "����" + f.getName());
		}

	}
}
