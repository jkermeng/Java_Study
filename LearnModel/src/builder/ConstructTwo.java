package builder;

public class ConstructTwo extends AWorker {
    @Override
    public void CreateWal() {
        product.setWal("瓷砖墙");
    }

    @Override
    public void CreateTV() {
        product.setTv("海信电视");
    }

    @Override
    public void CreateSofa() {
        product.setSofa("木质沙发");
    }
}
