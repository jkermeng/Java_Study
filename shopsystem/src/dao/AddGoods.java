package dao;

import java.util.Arrays;
import java.util.Scanner;

import entity.Goods;
import entity.Porter;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月15日
 * @Version 1.0.0
 */
public class AddGoods {

	// 更新位私有访问
	private Goods[] set;

	public Goods[] getSet() {
		return set;
	}

	public void setSet(Goods[] set) {
		this.set = set;
	}

	/**
	 * 初始化商品
	 */
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

	/**
	 * 添加商品
	 * 
	 * @return
	 */
	public Goods[] addGoods() {
		Scanner scanners = new Scanner(System.in);
		String value = null;
		String ab = null;
		boolean bl = true;
		do {
			System.out.print("请输入商品ID:");
			int id = scanners.nextInt();
			Goods temprory[] = new Goods[set.length + 1];
			if (set.length > 0) {
				for (int j = 0; j < set.length; j++) {
					temprory[j] = set[j];
					if (id == set[j].getId() ) {
						System.out.println("有重复ID");
						bl = false;

					}
				}
			}
			if (bl == true) {
				System.out.print("请输入商品名称:");
				String name = scanners.next();
				System.out.print("请输入商品价格:");
				int prince = scanners.nextInt();
				System.out.print("请输入商品数量:");
				int num = scanners.nextInt();
				Goods goods = new Goods(id, name, prince, num);
				temprory[temprory.length - 1] = goods;
				set = temprory;
			}
			bl =true;
			System.out.println("输入y继续写入商品n退出");
			ab = scanners.next();

		} while (ab.equals("y"));

		return set;

	}

	/**
	 * 查询货物
	 */
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

	/**
	 * 删除商品数量
	 * 
	 * @return 返回剩余商品内容
	 */
	public Goods[] deleteGoods() {
		Goods a[] = set;
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

	/**
	 * 修改商品信息
	 * 
	 * @return
	 */
	public Goods[] update(int id) {
		// 剩下的货物数量
		int i = 0;
		int j = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品名称： ");
		String name = scanner.next();
		System.out.println("商品数量： ");
		int num = scanner.nextInt();
		System.out.println("商品价格： ");
		double prince = scanner.nextDouble();
		// Goods addGoods = new Goods(id,name,price,num);
		// 判断购物车对应的货源id并且修改数目
		if (i < set.length) {
			for (; i < set.length;) {
				Goods goods2 = set[i];
				// Goods goods = addGoods[j];
				if (id == goods2.getId()) {
					// 成功修改最初值，下一步打印所买商品和商品总价
					goods2.setName(name);
					goods2.setNum(num);
					goods2.setPrince(prince);
					// set[i] = addGoods[j];
					// j++;
					i = 0;
					break;
				} else {
					i++;

				}
			}

		}
		// 拿到原来货物的数量值

		return set;
	}

	/**
	 * 购物篮
	 * 
	 * @return
	 */
	public int[] trolley() {
		int porter[] = new int[0];
		Scanner sc = new Scanner(System.in);
		int id = 0;
		int j = 0;
		int k = 0;
		boolean bbc = false;
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
			for (; k < set.length; k++) {
				if(id == set[k].getId()){
					bbc = true;
					break;
				}
			}
			if(bbc){
			temprory[j] = id;
			System.out.print("输入产品数量：");
			int num = sc.nextInt();
			if(num<set[k].getNum()){
				temprory[j + 1] = num;
				porter = temprory;
				j += 2;
			}else{
				System.out.println("超出产品数量");
			}
		
			}else{
				System.out.println("库存中没有该商品");
			}
			k=0;
			System.out.print("y继续n结束：");
			y = sc.next();
			
		} while (y.equals("y"));

		return porter;
	}

	/**
	 * 商品减少
	 * 
	 * @param porter
	 *            购物车
	 */
	public void retreat(AddPorter porter) {
		// 剩下的货物数量
		int i = 0;
		int j = 0;
		int[] num = porter.getTrolley().getNum();
		Goods[] addGoods = porter.getTrolley().getAddGoods();
		// 判断购物车对应的货源id并且修改数目
		if (i < set.length) {
			for (; i < set.length;) {
				Goods goods2 = set[i];
				Goods goods = addGoods[j];
				int num2 = num[j];
				if (goods.getId() == goods2.getId()) {
					// 成功修改最初值，下一步打印所买商品和商品总价
					goods.setNum(goods.getNum() - num2);
					set[i] = addGoods[j];
					j++;
					i = 0;
				} else {
					i++;
					;
				}
				if (j == addGoods.length) {
					break;
				}

			}

		}
		// 拿到原来货物的数量值

	}

}
