package learnproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyTest {

	public static void main(String[] args) {
		Login login = new taget();

		loginProxy loginProxy = new loginProxy(login);

		Login loginProxy1 = (Login) Proxy.newProxyInstance(login.getClass().getClassLoader(),
				login.getClass().getInterfaces(), loginProxy);
		
		loginProxy1.login("userName", "123456");
		
		//loginProxy1.payMoney("", passwrod);

	}

}

interface Login {
	public void login(String username, String password);

	public void payMoney(int money, String passwrod);
}

class taget implements Login {

	@Override
	public void login(String username, String password) {
		System.out.println("��¼����,�˺�:" + username + ",���룺" + password);

	}

	@Override
	public void payMoney(int money, String passwrod) {
		System.out.println("��Ǯ���ܣ���" + money + ",֧�����룺" + passwrod);

	}

}

class loginProxy implements InvocationHandler {
	private Object obj;

	public loginProxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("Ȩ��У��");
		Object invoke = method.invoke(obj, args);
		System.out.println("��־��¼");

		return invoke;
	}

}