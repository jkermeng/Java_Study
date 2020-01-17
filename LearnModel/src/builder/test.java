package builder;

public class test {
    public static void main(String[] args) {
        AWorker aWorker = new ConstructOne();
        AWorker aWorker2 = new ConstructTwo();
        Dirctor dirctor = new Dirctor(aWorker);
        Dirctor dirctor1 = new Dirctor(aWorker2);
        Product product = dirctor.doWork();
        Product product1 = dirctor1.doWork();
        product.show();
        product1.show();
    }
}
