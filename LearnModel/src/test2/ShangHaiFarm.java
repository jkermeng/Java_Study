package test2;

public class ShangHaiFarm implements Farm {
    @Override
    public Animal BornAnimal() {
        System.out.println("С������ˣ�����");
        return new Pig();
    }

    @Override
    public Plant CreatePlant() {
        System.out.println("ˮ�������ˣ�����");
        return new Fruit();
    }
}
