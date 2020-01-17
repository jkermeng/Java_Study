package test2;

public class ShangHaiFarm implements Farm {
    @Override
    public Animal BornAnimal() {
        System.out.println("小猪出生了！！！");
        return new Pig();
    }

    @Override
    public Plant CreatePlant() {
        System.out.println("水果成熟了！！！");
        return new Fruit();
    }
}
