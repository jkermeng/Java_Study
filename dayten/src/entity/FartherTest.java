package entity;

public class FartherTest {

	public static void main(String[] args) {
//		����ת��  ��̬
		Farther f = new Son();
		System.out.println(f.num);
		f.eat();
		
		
		
		System.out.println("����ת��");
//		����ת��
		Son s = (Son)f;
 
		s.sleep();
		s.eat();
		System.out.println(s.num);
		
	}

}
