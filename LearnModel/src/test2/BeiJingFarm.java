package test2;

public class BeiJingFarm implements Farm {
    @Override
    public Animal BornAnimal() {
        System.out.println("С������ˣ�����");
        return new House();
    }

    @Override
    public Plant CreatePlant() {
        System.out.println("�߲˳����ˣ�����");
        return new Vegetable();
    }
}
