package potion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月15日
 * @Version 1.0.0
 */
public class AddGoods {

	// public Goods[] set = new Goods[4];
	// 更新位私有访问
	private Goods[] set;

	public Goods[] getSet() {
		return set;
	}

	public void setSet(Goods[] set) {
		this.set = set;
	}

	public AddGoods() {
		set = new Goods[4];
		Goods goods = new Goods(1, "篮球", 88, 90);
		Goods goods2 = new Goods(2, "足球", 88, 80);
		Goods goods3 = new Goods(3, "乒乓球", 88, 2);
		Goods goods4 = new Goods(4, "气球球", 88, 1);
		set[0] = goods;
		set[1] = goods2;
		set[2] = goods3;
		set[3] = goods4;
		selectGoods();

	}

	public Goods[] addGoods() {
		Scanner scanner = new Scanner(System.in);
		String value = null;
		String ab = null;
		do {

			Goods temprory[] = new Goods[set.length + 1];
			if (set.length > 0) {
				for (int j = 0; j < set.length; j++) {
					temprory[j] = set[j];
				}
			}
			System.out.print("请输入商品ID:");
			int id = scanner.nextInt();
			System.out.print("请输入商品名称:");
			String name = scanner.next();
			System.out.print("请输入商品价格:");
			int prince = scanner.nextInt();
			System.out.print("请输入商品数量:");
			int num = scanner.nextInt();
			Goods goods = new Goods(id, name, prince, num);
			temprory[temprory.length - 1] = goods;
			set = temprory;
			System.out.println("输入y继续写入商品n退出");
			ab = scanner.next();
		} while (ab.equals("y"));
		return set;
	}

	public void selectGoods() {
		Goods[] a = set;
		if (a.length > 0) {
			System.out.println("商品ID\t商品名称\t商品数量\t商品价格\t\n");
			for (Goods goods : a) {
				System.out.println(
						goods.getId() + "\t" + goods.getName() + "\t" + goods.getNum() + "\t" + goods.getPrince());
			}
		} else {
			System.out.println("没有任何商品");
		}

	}

	public Goods[] deleteGoods() {
		Goods a[] = set;
		System.out.println(a.length);
		System.out.print("请输入要删除的id：");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		Goods cc[] = new Goods[set.length - 1];
		int j = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i].getId() != id) {
				cc[j] = a[i];
				j++;
			}
			set = cc;
		}

		return set;

	}

	public Goods[] update() {

		return set;
	}

	public int[] trolley() {
		int porter[] = new int[0];
		Scanner sc = new Scanner(System.in);
		int id = 0;
		int j = 0;
		String y;
		do {
			int temprory[] = new int[porter.length + 2];
			if (porter.length > 0) {
				for (int i = 0; i < porter.length; i++) {
					temprory[i] = porter[i];
				}
			}
			System.out.print("输入产品ID：");
			id = sc.nextInt();
			temprory[j] = id;
			System.out.print("输入产品数量：");
			id = sc.nextInt();
			temprory[j + 1] = id;
			porter = temprory;
			j += 2;
			System.out.print("y继续n结束：");
			y = sc.next();
		} while (y.equals("y"));

		return porter;
	}

	public void retreat(Porter porter) {
		// 剩下的货物数量
		int i = 0;
		int j =0;
		int[] num = porter.getNum();
		Goods[] addGoods = porter.getAddGoods();
		// 判断购物车对应的货源id并且修改数目
		if(i<set.length){
		for (;i < set.length; ) {
			Goods goods2 = set[i];
			Goods goods = addGoods[j];
			int num2 = num[j];
			if (goods.getId() == goods2.getId()) {
//			成功修改最初值，下一步打印所买商品和商品总价
				goods.setNum(goods.getNum()-num2);
				set[i] = addGoods[j];
				j++;
				i=0;
			}else{
				i++;;
			}
			if(j==addGoods.length){
				break;
			}

		}
		
		}
		// 拿到原来货物的数量值

	}

}
