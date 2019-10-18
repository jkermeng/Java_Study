package daytwo.protect_test;

public class test {

	private static int number = 0;
	private static int getNumber()
	{
		return number;
	}
	private static void addNumber()
	{
		number++;
	}
	test(){
		test.addNumber();
	}
	
	public static void main(String[] args) {
		
		System.err.println("开始" + test.getNumber() + "结束");
		for(int i=0;i<500;i++)
		{
			new test();
			
		}
		System.err.println("开始" + test.getNumber() + "长度");
	}
	
}
