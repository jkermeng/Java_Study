package test;

public class HouseFarm implements AnimalFactor {
    @Override
    public Animal BornAnimal() {
        System.out.println("С������ˣ�����");
        return new House();
    }
}
