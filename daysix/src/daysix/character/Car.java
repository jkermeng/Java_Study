package daysix.character;

import java.sql.Date;

import javax.rmi.CORBA.Tie;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��11��
 * @Version 1.0.0
 */

final class Car {

	public String name;
	public int money;
	public String creat;
	public int pullup;

	public void eat() {
		if (this.money < 5000) {
			System.out.println(name + "��");
		}

	}

	public int dates() {
		if (this.pullup < 2019) {
			return 1;
		} else {
			return 0;
		}

	}

}
