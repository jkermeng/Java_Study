package builder;

public class ConstructOne extends AWorker {
    @Override
    public void CreateWal() {
        product.setWal("纸墙");
    }

    @Override
    public void CreateTV() {
        product.setTv("三星电视");
    }

    @Override
    public void CreateSofa() {
        product.setSofa("海绵沙发");
    }
}
