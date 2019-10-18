package daysix.character;

/**
*
*
*@Author JKermeng
*@Date 2019年10月11日
*@Version 1.0.0
*/
public class CarTest {

	public static void main(String[] args) {
		
		Car c =new Car();
		Car c1 =new Car();
		c.name="保时捷";
		c.money = 1000000;
		c.creat = "意大利";
		c.pullup = 2020;
		
		c1.name="宾利";
		c1.money = 1000000;
		c1.creat = "德国";
		c1.pullup = 2001;
		
		System.out.println("c1的车名："+c1.name+"\tc的车名："+c.name);
		Car[] c_arr = new Car[3];
		c_arr[0]=c;
		c_arr[1]=c1;
		for (Car car : c_arr) {
			try {
				System.out.println(" "+"c1的车名："+car.creat+" 动作");
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
