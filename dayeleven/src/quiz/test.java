package quiz;

import java.net.PortUnreachableException;
import java.text.ParseException;

public class test {
	public int one(int a, int b) throws ArithmeticException,MyRuntimeException {
		if (b == 0) {
			throw new MyRuntimeException("·ÖÄ¸Îª0£¡£¡£¡£¡£¡£¡£¡");
		}
		int value = a/b;
		return value;
	}
	public static void main(String[] args) throws ArithmeticException, NullPointerException, MyRuntimeException {
		
		System.out.println(new test().one(1, 0));
		
	}

}
class throwAway extends test{

	@Override
	public int one(int a, int b) {
	
	
//		return super.one(a, b);
		return b;
	}
	
	
}
class MyRuntimeException extends Exception {
	public MyRuntimeException(String mgs){
		super(mgs);
	}
	public MyRuntimeException(){}
	
}
class MyException extends Exception{
	
	
}
