package daynight.learnoverride;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��15��
 * @Version 1.0.0
 */
public class IPhone extends Phone{
	public IPhone() {
		super();
		System.out.println("���๹�췽��");
	}

	static {
		System.out.println("���ྲ̬�����");
	}
	{
		System.out.println("������ͨ�����");
	}
}
