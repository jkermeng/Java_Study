package test2;

public class Test {
    public static void main(String[] args) {
        Farm beijing = new BeiJingFarm();
        Animal animal = beijing.BornAnimal();
        animal.show();
        Plant plant = beijing.CreatePlant();
        plant.show();
        Farm shanghai = new ShangHaiFarm();
        Animal animal1 = shanghai.BornAnimal();
        animal1.show();
        Plant plant1 = shanghai.CreatePlant();
        plant1.show();
    }
}
