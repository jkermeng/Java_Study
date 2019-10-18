package potion;

import java.util.Scanner;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月15日
 * @Version 1.0.0
 */
public class View {

	public static void main(String[] args) {
	
		System.out.println("欢迎");
		AddGoods addGoods = new AddGoods();

		Scanner scanner = new Scanner(System.in);
		int num;
		do {
			System.err.println("1、查看商品 2、添加商品 3、删除商品 4、修改商品  5、购物车  6、退出系统");
			num = scanner.nextInt();
			if (num == 1) {
				addGoods.selectGoods();

			} else if (num == 2) {
				addGoods.addGoods();

			} else if (num == 3) {
				addGoods.deleteGoods();
			} else if (num == 4) {
				addGoods.update();
			}
			 else if (num == 5) {
			Porter trolley = new Porter(addGoods.getSet());
			trolley.addBukey(addGoods.trolley());
			System.out.println("\n\n总价格："+trolley.sumGoods());
			addGoods.retreat(trolley);
			
				}
		} while (num != 6);
		scanner.close();
	}

}
