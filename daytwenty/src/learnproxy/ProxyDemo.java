package learnproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Logins targetLogin = new targetLogin();
        ProxyLogin proxyLogin = new ProxyLogin(targetLogin);
        Logins o = (Logins) Proxy.newProxyInstance(targetLogin.getClass().getClassLoader(), targetLogin.getClass().getInterfaces(), proxyLogin);
        o.Login("jkermeng", "123123123");

    }
}

interface Logins {
    void Login(String name, String pwd);

    void Paymoney(int money);
}

class targetLogin implements Logins {

    @Override
    public void Login(String name, String pwd) {
        System.out.println("账号：" + name + "密码：" + pwd);
    }

    @Override
    public void Paymoney(int money) {
        System.out.println("支付金额：" + money);
    }
}

class ProxyLogin implements InvocationHandler {
    private Object obj;

    public ProxyLogin(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("權限判定我写如代理的方法");
        Object invoke = method.invoke(obj, args);
        System.out.println("日誌");
        return invoke;
    }
}