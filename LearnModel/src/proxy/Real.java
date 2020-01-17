package proxy;

public class Real implements Request {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Request() {
        System.out.println("·ÃÎÊµÄÄÚÈİ"+name);
    }
}
