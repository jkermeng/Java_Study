package daynight.learnoverride;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月15日
 * @Version 1.0.0
 */
public class IPhone extends Phone{
	public IPhone() {
		super();
		System.out.println("子类构造方法");
	}

	static {
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类普通代码块");
	}
}
