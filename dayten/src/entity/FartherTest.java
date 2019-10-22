package entity;

public class FartherTest {

	public static void main(String[] args) {
//		向上转型  多态
		Farther f = new Son();
		System.out.println(f.num);
		f.eat();
		
		
		
		System.out.println("向下转型");
//		向下转型
		Son s = (Son)f;
 
		s.sleep();
		s.eat();
		System.out.println(s.num);
		
	}

}
