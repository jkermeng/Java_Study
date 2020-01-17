package test;

public class PigFarm implements AnimalFactor {
    @Override
    public Animal BornAnimal() {
        System.out.println("小猪出生了！！！");
        return new Pig();
    }
}
