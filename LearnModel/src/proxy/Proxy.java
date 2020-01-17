package proxy;

public class Proxy {
    private Real real;

    public void getReal() {
        if (real == null) {
            real = new Real();
        }
        RequestBefore();
        real.setName("player");
        real.Request();
        RequestAfter();
    }

    public void RequestBefore() {
        System.out.println("访问前修改问题");
        real.setName("loser");
        real.Request();
    }

    public void RequestAfter() {
        System.out.println("访问后问题");
        real.setName("winner");
        real.Request();

    }
}
