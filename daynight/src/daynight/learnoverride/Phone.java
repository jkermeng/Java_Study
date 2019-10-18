package daynight.learnoverride;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月15日
 * @Version 1.0.0
 */
public class Phone {
	
	public Phone() {
		System.out.println("父类构造方法");
	}

	{
		System.out.println("父类普通代码块");
	}
	static {
		System.out.println("父类静态代码块");
	}
}
