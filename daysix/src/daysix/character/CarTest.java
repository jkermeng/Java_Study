package daysix.character;

/**
*
*
*@Author JKermeng
*@Date 2019��10��11��
*@Version 1.0.0
*/
public class CarTest {

	public static void main(String[] args) {
		
		Car c =new Car();
		Car c1 =new Car();
		c.name="��ʱ��";
		c.money = 1000000;
		c.creat = "�����";
		c.pullup = 2020;
		
		c1.name="����";
		c1.money = 1000000;
		c1.creat = "�¹�";
		c1.pullup = 2001;
		
		System.out.println("c1�ĳ�����"+c1.name+"\tc�ĳ�����"+c.name);
		Car[] c_arr = new Car[3];
		c_arr[0]=c;
		c_arr[1]=c1;
		for (Car car : c_arr) {
			try {
				System.out.println(" "+"c1�ĳ�����"+car.creat+" ����");
				car.eat();
				int a = car.dates();
				
				System.out.println(a);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.gc();
	}

}
