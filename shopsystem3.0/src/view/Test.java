package view;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import enums.Responese;
import jdbcutil.MysqlConnet;
import onetomanyentity.Goods;
import onetomanyentity.ShopCart;
import onetomanyentity._Classification;
import onetooneentity.Users;
import service.GoodService;
import service.OrderService;
import service.OrderdetailedService;
import service.ShopCartService;
import service.UserService;
import util.DateUtil;

public class Test {

	public static void main(String[] args) throws SQLException {

		UserService us = new UserService();
		GoodService gs = new GoodService();
		OrderdetailedService odss = new OrderdetailedService();
		OrderService ods = new OrderService();
		ShopCartService scs = new ShopCartService();
		Scanner sc = new Scanner(System.in);
		int l = 3;
		System.out.println("欢迎登陆XXX商店");
		String bcn = null;
		do {
			Responese urs = us.getUserByPhone(new Scanner(System.in));// 拥有用户基本信息
			if (urs.getCode() == 1) {
				Users use = (Users) urs.getObj();
				System.out.println("欢迎: " + use.getUname() + "登入xxx商店");
				showGoods(gs.getGoodsData());// 查询全部商品null
				do {
					System.out.println("1、查看全部商品  2、单独查看商品  3、添加商品  4、修改商品  5、删除商品  6、购物车  0、离开商店 ");
					int nums = sc.nextInt();
					if (nums == 1) {
						showGoods(gs.getGoodsData());
					} else if (nums == 2) {
						System.out.println("亲输入你要单独查看的商品ID: ");
						int idName = sc.nextInt();
						showGoods(gs.getGoodsDataById(new Goods(idName)));

					} else if (nums == 6) {
						do {
							String cn = null;
							System.out.println("1、查看购物车详情  2、添加商品进购物车  3、修改购物车详情信息  4、删除购物车  5、结算购物车  0、退出购物车");
							int numss = sc.nextInt();
							if (numss == 1) {
								Responese userShopCartGoodsData = scs.getUserShopCartGoodsData(use);
								System.out.println("查询：  " + userShopCartGoodsData.getMsg());
								showShopCart(userShopCartGoodsData);// 四个属性在订单详情
							} else if (numss == 2) {
								do {
									System.out.println("亲输入你需要的商品ID： ");
									int id = sc.nextInt();
									System.out.println("亲输入你要购买的数量： ");
									int num = sc.nextInt();
									scs.addShopCartGoods(id, num, use);
									System.out.println("y继续/n取消");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 3) {
								System.out.println("亲输入修改的ID：");
								int id = sc.nextInt();
								System.out.println("亲输入修改的数目：");// 有问题修改的id
								int num = sc.nextInt();
								Responese updateCart = scs.updateShopCartGoods(id, num, use);// 修改订单详情
								System.out.println("修改" + updateCart.getMsg());
							} else if (numss == 4) {
								do {
									System.out.println("亲输入删除购物车货物的ID：");
									int id = sc.nextInt();
									Responese deleteCart = scs.deleteShopCartGoods(id, use);
									System.out.println(deleteCart.getMsg() + "删除购物车");// 删除购物车里的商品
									System.out.println("y继续/n退出");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 5) {
								Responese countAll = scs.countMyShopCart(use);
								System.out.println("结算： " + countAll.getMsg());// 结算orders
							} else if (numss == 0) {
								break;
							}
						} while (true);
					}
					if (use.getUname().equals("管理员")) {

						if (nums == 3) {
							// 管理员添加
							String cn3 = null;
							do {
								System.out.println("添加的商品名称： ");
								String name = sc.next();
								System.out.println("添加的商品数量： ");
								int num = sc.nextInt();
								System.out.println("添加的商品价格： ");
								double price = sc.nextDouble();
								System.out.println("添加的商品种类： ");
								int remake = sc.nextInt();
								Responese addGoods = gs
										.addGoods(new Goods( name, price, num, new _Classification(remake)), use);
								System.out.println("添加貨物：" + addGoods.getMsg());
								System.out.println("y继续/n退出");
								cn3 = sc.next();
							} while (cn3.equals("y"));
						} else if (nums == 4) {
							// 管理员修改
							String cn4 = null;
							do {
								System.out.println("修改的商品ID： ");
								int id = sc.nextInt();
								System.out.println("修改的商品名称： ");
								String name = sc.next();
								System.out.println("修改的商品数量： ");
								int num = sc.nextInt();
								System.out.println("修改的商品价格： ");
								double price = sc.nextDouble();
								System.out.println("修改的商品类别： ");
								int remake = sc.nextInt();
								Responese updateGoods = gs
										.updateGoods(new Goods(id, name, price, num, new _Classification(remake)), use);// 更新货物改为手动输入
								System.out.println("修改货物: " + updateGoods.getMsg());
								System.out.println("y继续/n退出");
								cn4 = sc.next();
							} while (cn4.equals("y"));
						} else if (nums == 5) {
							// 管理员删除货物
							String cn5 = null;
							do {
								System.out.println("删除的商品ID： ");
								int id = sc.nextInt();
								Responese deleteGoods = gs.deleteGoods(new Goods(id), use);// 通过id删除商品
								System.out.println(deleteGoods.getMsg());
								System.out.println("y继续/n退出");
								cn5 = sc.next();
							} while (cn5.equals("y"));
						}
					} else if (nums == 0) {
						System.exit(0);
					}

				} while (true);

			} else {
				l--;
				System.out.println(urs.getMsg() + "账号密码错误剩余" + (l) + "次机会");

				if (l == 0) {
					break;
				}
			}
		} while (true);
		sc.close();
		MysqlConnet.allClose();

	}

	private static void showShopCart(Responese sc) {
		Set<ShopCart> setgoods = (Set<ShopCart>) sc.getObj();
		System.out.println("商品ID\t商品名称\t商品价格\t商品数量\t商品加入时间");
		for (ShopCart shopCart : setgoods) {
			for (Goods gs : shopCart.getSetgoods()) {
				System.out.print(gs.getGid() + "\t" + gs.getGname() + "\t" + gs.getGprice() + "\t"
						+ shopCart.getGnumber() + "\t" + shopCart.getGtime() + "\n");

			}
		}
	}

	private static void showGoods(List<Goods> listg) {
		System.out.println("商品ID\t商品名称\t商品价格\t商品库存\t商品类别");
		for (Goods goods : listg) {
			System.out.print(goods.getGid() + "\t" + goods.getGname() + "\t" + goods.getGprice() + "￥\t"
					+ goods.getGstock() + "\t" + goods.getSetClassfy().getCname() + "\n");
		}
	}

}
