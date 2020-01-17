package learnproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        System.out.println("��һ�ֻ�ȡclass����ķ���");
        Student stu1 = new Student();
        Class c1 = stu1.getClass();
        System.out.println(c1.getName());

        Student stu2 = new Student();
        Class c2 = stu2.getClass();

        System.out.println(c1 == c2);
        System.out.println("�ڶ��ֻ�ȡclass����ķ���");
        Class c3 = Student.class;
        System.out.println(c1 == c3);

        System.out.println("�����ֻ�ȡclass����ķ���");
        Class c4 = Class.forName("java22_reflect.Student");
        System.out.println(c1 == c4);

        System.out.println("ͨ�� class����ȥ��public���ι��췽��*********");
        Constructor[] constructors = c4.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("ͨ�� class����ȥ�����й��췽��*********");
        Constructor[] cany = c4.getDeclaredConstructors();
        for (Constructor c : cany) {
            System.out.println(c);
        }

        System.out.println("��һ�� ʵ��������ķ���");

        Constructor cons = c4.getConstructor(int.class, String.class, int.class);
        Student stu3 = (Student) cons.newInstance(1, "ѧ��", 25);
        System.out.println(stu3.toString());

        System.out.println("****************************");
        System.out.println(int.class);
        System.out.println(Integer.class);

        System.out.println("********ͨ��class�����õ�public����************");
        Field[] fields = c4.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("********ͨ��class�����õ���������************");
        Field[] fd = c4.getDeclaredFields();
        for (Field f : fd) {
            System.out.println(f);
        }

        System.out.println("********************������Ա����***********************");
        Field field = c4.getField("name");
        Object obj = c4.getConstructor().newInstance();
        field.set(obj, "��ѧ��");
        Student stu4 = (Student) obj;
        System.out.println(stu4.toString());

        System.out.println("********************����˽�г�Ա����***********************");
        Field idField = c4.getDeclaredField("id");
        idField.setAccessible(true);
        Object obj1 = c4.getConstructor().newInstance();
        idField.set(obj1, 8888);
        Student stu5 = (Student) obj1;
        System.out.println(stu5.toString());

        System.out.println("********************�������༰�������� public��Ա����***********************");
        Method[] methods = c4.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println("********************���������Ա����***********************");
        Method[] ms = c4.getDeclaredMethods();
        for (Method m : ms) {
            System.out.println(m);
        }

        System.out.println("*************************ͨ�� class�������public����***************************");
        Method publicMethod = c4.getMethod("publicMethod", String.class);
        Object obj2 = c4.getConstructor().newInstance();
        publicMethod.invoke(obj2, "���ǹ�������");

        System.out.println("*************************ͨ�� class���������public����***************************");
        Method privateMethod = c4.getDeclaredMethod("privateMethod", String.class);
        privateMethod.setAccessible(true);
        Student obj3 = new Student();//c4.getConstructor().newInstance();//��ͬ��Object obj = new Student();
        privateMethod.invoke(obj3, "����˽�з���");


    }

}

class Student {
    private int id;
    public String name;
    int age;

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
        super();
    }

    private Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    Student(int age) {
        this.age = age;
    }

    private void privateMethod(String content) {
        System.out.println("this is privatemethod+" + content);
    }

    public void publicMethod(String content) {
        System.out.println("this is publicMethod+" + content);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
