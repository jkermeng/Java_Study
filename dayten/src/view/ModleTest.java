package view;


import entity.Animal;
import entity.Cat;
import entity.Dog;
import entity.Fish;
import entity.Modle;
import serve.AnimalServe;
import serve.CatSer;

public class ModleTest {

	public static void main(String[] args) {

//		CatSer cs = new CatSer();
//		cs.catser("笑话");
//		
		AnimalServe animalServe = new AnimalServe();
		Animal animal = new Cat();
		animalServe.animal(animal);
		animalServe.animal(new Dog());
//		animalServe.animal(new Fish());
		//当抽象类作为参数时，可以传入继承抽象类的普通类
		
		
	}

}
