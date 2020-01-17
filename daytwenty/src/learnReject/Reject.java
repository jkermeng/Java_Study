package learnReject;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Reject {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Student stu1 = new Student();
        Class c1 = stu1.getClass();
        System.out.println(c1.getName());
        Class c2 = Student.class;
        System.out.println(c1 == c2);
        Class c3 = Class.forName("learnReject.Student");
        System.out.println(c3 == c1);
        System.out.println("查看构造方法");
        Constructor[] cons = c3.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }
        System.out.println("查看所有构造方法！！！！");
        Constructor[] ds = c3.getDeclaredConstructors();
        for (Constructor a :
                ds) {
            System.out.println(a);
        }
        Student stu2 = new Student();
        System.out.println("拿到对象里的属性");
        Class c4 = stu2.getClass();
        Constructor cons1 = c4.getConstructor(int.class, String.class, int.class);
        Object obj = cons1.newInstance(1, "www", 12);
        Student stu3 = (Student) obj;

        System.out.println(stu3);
        System.out.println("查看可查看的成员");
        Field[] f1 = c4.getFields();
        for (Field f :
                f1) {
            System.out.println(f);
        }
        System.out.println("查看所有的成员");
        Field[] f2 = c4.getDeclaredFields();
        for (Field f : f2
        ) {
            System.out.println(f);
        }
        System.out.println("修改对象里的属性");
        Object o1 = c4.newInstance();
        Field field = c4.getField("name");
        field.set(o1, "小学生");
        Student stu4 = (Student) o1;
        System.out.println(stu4);
        System.out.println("拿到private成员id");
        Field field1 = c4.getDeclaredField("id");
        field1.setAccessible(true);
        field1.setInt(o1, 222);
        System.out.println(stu4);
        System.out.println("打印成员方法");
        Method[] methods = c4.getMethods();
        for (Method m : methods
        ) {
            System.out.println(m);
        }
        System.out.println("打印成员所有方法");
        Method[] declaredMethods = c4.getDeclaredMethods();
        for (Method m : declaredMethods
        ) {
            System.out.println(m);
        }
        System.out.println("使用成员public方法");
        Class c5 = Student.class;
        Object o = c5.newInstance();
        Method publicMethod = c5.getMethod("publicMethod", String.class);
        publicMethod.invoke(o,"我读取 啊商店");
        System.out.println(o);
        System.out.println("使用成员私有方法");
        Method privateMethod = c5.getDeclaredMethod("privateMethod", String.class);
        privateMethod.setAccessible(true);
        privateMethod.invoke(o,"我QQ是想啊爱上");
        System.out.println(o);

    }
}

class Student {
    private int id;
    public String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(int age) {
        this.age = age;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void publicMethod(String conn) {
        System.out.println("publicMethod" + conn);
    }

    private void privateMethod(String conn) {
        System.out.println("privateMethod" + conn);

    }

    void defaultMethod(String conn) {
        System.out.println("defaultMethod" + conn);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
