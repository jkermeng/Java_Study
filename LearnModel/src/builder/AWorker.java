package builder;

abstract class AWorker {
    protected Product product = new Product();

    public abstract void CreateWal();

    public abstract void CreateTV();

    public abstract void CreateSofa();

    public Product getProduct() {
        return product;
    }
}
