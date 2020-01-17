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
        System.out.println("����ǰ�޸�����");
        real.setName("loser");
        real.Request();
    }

    public void RequestAfter() {
        System.out.println("���ʺ�����");
        real.setName("winner");
        real.Request();

    }
}
