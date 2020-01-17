package builder;

public class Dirctor {
    private AWorker aWorker;

    public Dirctor(AWorker aWorker) {
        this.aWorker = aWorker;
    }

    public Product doWork() {
        aWorker.CreateWal();
        aWorker.CreateTV();
        aWorker.CreateSofa();
        return aWorker.getProduct();
    }
}
