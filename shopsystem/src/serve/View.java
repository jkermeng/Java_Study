package serve;

import java.util.Scanner;

import dao.AddGoods;
import dao.AddPorter;
import entity.Goods;
import entity.Porter;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月15日
 * @Version 1.0.0
 */
public class View {

	public static void main(String[] args) {
		int num = 0;
		boolean db = true;
		System.out.println("欢迎");
		AddGoods addGoods = new AddGoods();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1、客户购买 2、退出系统  0、管理员");
			String users[] = { "管理员", "客户购买" };
			int user = scanner.nextInt();
			if (user == 1 | user == 0) {
				System.out.println("欢迎" + users[user]);

				System.out.println("请输入账号： ");
				int username = scanner.nextInt();
				System.out.println("请输入密码：  ");
				int userpassword = scanner.nextInt();

				if (username == 123 & userpassword == 123) {
					do {
						System.err.println("1、查看商品 2、添加商品 3、删除商品 4、修改商品  5、购物车  6、退出系统");
						num = scanner.nextInt();

						if (user == 1 & num != 1 & num != 5 & num != 6) {
							System.out.println("您不是管理员");
						}
						if (num == 1) {
							addGoods.selectGoods();

						}
						if (user == 0) {
							if (num == 2) {
								addGoods.addGoods();

							} else if (num == 3) {
								addGoods.deleteGoods();
							} else if (num == 4) {
								System.out.println("修改的商品id");
								int nums = scanner.nextInt();
								addGoods.update(nums);
							}
							 if(num == 5){
								System.out.println("管理员没有购物车");
							}
						} else if (num == 5) {
							// Porter trolley = null;
							AddPorter trolley = new AddPorter(addGoods);
							int num5 = 0;
							while (num5 != 5) {
								System.out.println("1、查看购物车商品 2、添加商品到购物车 3、结算购物车   5、退出购物车");
								num5 = scanner.nextInt();
								if (num5 == 1) {
									String[] lookUpPorter = trolley.lookUpPorter();
									for (String string : lookUpPorter) {
										System.out.println(string);
									}
								} else if (num5 == 2) {
									trolley.addBukey(addGoods.trolley(), trolley.getTrolley().getAddGoods());
									// trolley = new Porter(addGoods.getSet());
									// trolley.addBukey(addGoods.trolley());
								} else if (num5 == 3) {
									System.out.println("\n\n总价格：" + trolley.sumGoods());
									addGoods.retreat(trolley);
								} else if (num5 == 4) {
									trolley.cleanPorter();
								}

							}

						}
					} while (num != 6);
					scanner.close();
					System.exit(0);
				}else {
					System.out.println("账号密码错误！！！！");
				}

			}

		}
	}
}
