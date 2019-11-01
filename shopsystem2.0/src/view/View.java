package view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import enmus.RespondRuslt;
import entity.Goods;
import entity.ShoppingCart;
import entity.User;
import service.GoodsService;
import service.ShoppingCartService;
import service.UserService;
import util.DateUtil;

public class View {
	public static void main(String[] args) {
		GoodsService gs = new GoodsService();
		UserService us = new UserService();
		ShoppingCartService scs = new ShoppingCartService();
		Scanner sc = new Scanner(System.in);
		int l = 3;
		System.out.println("欢迎登陆XXX商店");
		String bcn = null;
		do {
			RespondRuslt login = us.Login(sc);// 拥有用户基本信息
			if (login.getCode() == 1000) {
				User user = (User) login.getObj();
				System.out.println("欢迎: " + user.getName() + user.getPower() + "登入xxx商店");
				showGoodsAll(gs.selectGoods(null));// 查询全部商品null
				do {
					System.out.println("1、查看全部商品  2、单独查看商品  3、添加商品  4、修改商品  5、删除商品  6、购物车  0、离开商店 ");
					int nums = sc.nextInt();
					if (nums == 1) {
						showGoodsAll(gs.selectGoods(null));
					} else if (nums == 2) {
						System.out.println("亲输入你要单独查看的商品ID: ");
						int idName = sc.nextInt();
						showGoodsAll(gs.selectGoods(new Goods(idName)));

					} else if (nums == 6) {
						do {
							String cn = null;
							System.out.println("1、查看购物车信息 2、添加商品进购物车  3、修改购物车信息  4、删除购物车  5、结算购物车  0、退出购物车");
							int numss = sc.nextInt();
							if (numss == 1) {
								RespondRuslt selectCart = scs.selectCart();
								System.out.println("查询：  " + selectCart.getMsg());
								showCart(selectCart);
							} else if (numss == 2) {
								do {
									System.out.println("亲输入你需要的商品ID： ");
									int id = sc.nextInt();
									System.out.println("亲输入你要购买的数量： ");
									int num = sc.nextInt();
									scs.addCart(id, num, DateUtil.dateToStr(new Date(), "yyyy-MM-dd"));
									System.out.println("y继续/n取消");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 3) {
								System.out.println("亲输入修改的ID：");
								int id = sc.nextInt();
								System.out.println("亲输入修改的数目：");// 有问题修改的id
								int num = sc.nextInt();
								RespondRuslt updateCart = scs.updateCart(new Goods(id, num));
								System.out.println("修改" + updateCart.getMsg());
							} else if (numss == 4) {
								do {
									System.out.println("亲输入删除购物车货物的ID：");
									int id = sc.nextInt();
									RespondRuslt deleteCart = scs.deleteCart(new Goods(id));
									System.out.println(deleteCart.getMsg() + "删除购物车");
									System.out.println("y继续/n退出");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 5) {
								RespondRuslt countAll = scs.countAll();
								System.out.println("结算：  " + countAll.getMsg());
							} else if (numss == 0) {
								break;
							}
						} while (true);
					}
					if (user.getId() == 0) {

						if (nums == 3) {
							// 管理员添加
							String cn3 = null;
							do {
								System.out.println("添加的商品ID： ");
								int id = sc.nextInt();
								System.out.println("添加的商品名称： ");
								String name = sc.next();
								System.out.println("添加的商品数量： ");
								int num = sc.nextInt();
								System.out.println("添加的商品价格： ");
								double price = sc.nextInt();
								System.out.println("添加的商品备注： ");
								String remake = sc.next();
								RespondRuslt addGoods = gs.addGoods(new Goods(id, name, num, price, remake));
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
								double price = sc.nextInt();
								System.out.println("修改的商品备注： ");
								String remake = sc.next();
								RespondRuslt updateGoods = gs.addOrUpdateGoods(new Goods(id, name, num, price, remake));// 更新货物改为手动输入
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
								RespondRuslt deleteGoods = gs.deleteGoods(new Goods(id));// 通过id删除商品
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
				System.out.println(login.getMsg() + "账号密码错误剩余" + (l) + "次机会");

				if (l == 0) {
					break;
				}
			}
		} while (true);
		sc.close();
		// 添加商品时不会判断ID重复--solve;
		// 修改商品时首先判断是否存在id
		// 购物车没有货物时报空指针！！！！--solve
		// 购物车超出货物id布报错,首先判断货物id是否存在--solve half

	}

	/**
	 * 内置查询方法
	 * 
	 * @param res
	 */
	private static void showGoodsAll(RespondRuslt res) {
		if (res.getMsg().equals("NULL")) {
			System.out.println(res.getMsg());
		} else {
			List<Goods> goodsBox = (List<Goods>) res.getObj();
			System.out.println("商品ID\t" + "商品名称\t" + "商品单价\t" + "商品库存\t" + "\n");
			for (Goods goods : goodsBox) {
				System.out.print(goods.getId() + "\t" + goods.getName() + "\t" + goods.getPrice() + "\t"
						+ goods.getNum() + "\n");
			}
		}
	}

	/**
	 * 内置购物车商品查看
	 * 
	 * @param res
	 */
	private static void showCart(RespondRuslt res) {
		double all = 0;
		if (res.getCode() == 1000) {
			List<ShoppingCart> shopBox = (List<ShoppingCart>) res.getObj();
			System.out.println("商品ID\t" + "商品名称\t" + "剩余数量\t" + "商品单价\t" + "购买数量\t" + "添加购物车时间\t");
			for (ShoppingCart cartGoods : shopBox) {
				System.out.print(cartGoods.getG().getId() + "\t" + cartGoods.getG().getName() + "\t"
						+ (cartGoods.getG().getNum() - cartGoods.getNum()) + "\t" + cartGoods.getG().getPrice() + "\t"
						+ cartGoods.getNum() + "\t" + cartGoods.getInTime() + "\n");
				all += cartGoods.getAllTotle();
			}
			System.out.println("\n\n" + "总价：  " + all);
		}

	}

}
