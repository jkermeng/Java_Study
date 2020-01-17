package test;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        AnimalFactor pigFarm =new PigFarm();
        Animal pig = pigFarm.BornAnimal();
        pig.show();
        AnimalFactor houseFarm =new HouseFarm();
        Animal house = houseFarm.BornAnimal();
        house.show();
    }
}