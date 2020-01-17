package learnproxy;

public class StaticProxyTest {

	public static void main(String[] args) {
		Iproxy proxy = new proxyImpl1();
		proxy.dosomething();

	}

}
/**
 * ��������Ҫ�Ľӿ�
 * @author Administrator
 *
 */
interface Iproxy {
	void dosomething();
}

/**
 * Ŀ����
 * @author Administrator
 *
 */
class proxyImpl implements Iproxy {

	@Override
	public void dosomething() {
		System.out.println("this is dosomething method");
	}
}

/**
 * ������
 * @author Administrator
 *
 */
class proxyImpl1 implements Iproxy {
	private Iproxy proxy = new proxyImpl();

	@Override
	public void dosomething() {
		System.out.println("��dosomething����֮ǰ������");
		proxy.dosomething();
		System.out.println("��dosomething�������к�������");
	}

}
