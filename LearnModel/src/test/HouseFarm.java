package test;

public class HouseFarm implements AnimalFactor {
    @Override
    public Animal BornAnimal() {
        System.out.println("小马出生了！！！");
        return new House();
    }
}
