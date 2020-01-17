package builder;

public class Product {
    private String wal;
    private String tv;
    private String sofa;

    public String getWal() {
        return wal;
    }

    public void setWal(String wal) {
        this.wal = wal;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
    public void show(){
        System.out.println("Product{" +
                "wal='" + wal + '\'' +
                ", tv='" + tv + '\'' +
                ", sofa='" + sofa + '\'' +
                '}');
    }


}
