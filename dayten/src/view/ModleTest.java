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
//		cs.catser("Ц��");
//		
		AnimalServe animalServe = new AnimalServe();
		Animal animal = new Cat();
		animalServe.animal(animal);
		animalServe.animal(new Dog());
//		animalServe.animal(new Fish());
		//����������Ϊ����ʱ�����Դ���̳г��������ͨ��
		
		
	}

}
