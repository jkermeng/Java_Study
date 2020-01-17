package test2;

public class BeiJingFarm implements Farm {
    @Override
    public Animal BornAnimal() {
        System.out.println("小马出生了！！！");
        return new House();
    }

    @Override
    public Plant CreatePlant() {
        System.out.println("蔬菜长成了！！！");
        return new Vegetable();
    }
}
