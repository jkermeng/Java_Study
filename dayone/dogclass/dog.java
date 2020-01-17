public class dog {
    String name;
    int age;
    String calor;

    public dog(String name, int age, String calor) {
        this.name = name;
        this.age = age;
        this.calor = calor;
    }

    public dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCalor() {
        return calor;
    }

    public void setCalor(String calor) {
        this.calor = calor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", calor='" + calor + '\'' +
                '}';
    }

    public void roat() {
        System.out.println("roat");
    }

    public void running() {
        System.out.println("running");
    }

    public void eat(String eat) {
        System.out.println("eat" + eat);
    }
}