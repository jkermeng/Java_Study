package bean;

public class Maker {
    private Demo demo = null;

    public String make(){
    String word = "我是"+demo.getId()+"个"+demo.getName();
    return word;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }
}
