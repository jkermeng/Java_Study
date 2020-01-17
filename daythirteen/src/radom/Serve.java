package radom;

import java.util.Random;
import java.util.Scanner;

public class Serve {
	private Person ps[];

	public Person[] addPerson() {
		int key = 0;
		ps = new Person[0];
		Scanner sc = new Scanner(System.in);
		do {
			Person tempory[] = new Person[ps.length + 1];
			if (ps.length > 0) {
				for (int j = 0; j < ps.length; j++) {
					tempory[j] = ps[j];
				}
			}
			System.out.println("ÐÕÃû:");
			String name = sc.next();
			System.out.println("×ùÎ»ºÅ:");
			key = sc.nextInt();
			Person person = new Person(name, key);
			tempory[tempory.length - 1] = person;
			ps = tempory;
			if (key == 40) {
				break;
			}

		} while (true);
		sc.close();
		return ps;
	}

	public String getPersonName() {
		int nextInt = new Random().nextInt(40);
		Person[] addPerson = addPerson();
		Person person = addPerson[nextInt];

		return person.getValue();
	}
}
