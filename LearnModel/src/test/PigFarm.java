package test;

public class PigFarm implements AnimalFactor {
    @Override
    public Animal BornAnimal() {
        System.out.println("С������ˣ�����");
        return new Pig();
    }
}
