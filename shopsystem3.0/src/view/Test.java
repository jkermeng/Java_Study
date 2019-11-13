package view;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import enums.Responese;
import jdbcutil.MysqlConnet;
import onetomanyentity.Goods;
import onetomanyentity.ShopCart;
import onetooneentity.Users;
import service.GoodService;
import service.OrderService;
import service.OrderdetailedService;
import service.ShopCartService;
import service.UserService;

public class Test {

	public static void main(String[] args) throws SQLException {

		UserService us = new UserService();
		GoodService gs = new GoodService();
		OrderdetailedService odss = new OrderdetailedService();
		OrderService ods = new OrderService();
		ShopCartService scs = new ShopCartService();
		Scanner sc = new Scanner(System.in);

		Responese urs = us.getUserByPhone(new Users("管理员", "110"));
		Users use = (Users) urs.getObj();
		System.out.println(use);
		System.out.println("欢迎使用xxx商店,欢迎： " + use.getUname());
		// showGoods(gs.getGoodsData());//查询货物
		// 添加货物
		// 修改货物
		// 删除货物
		// 查看购物车
		showShopCart(scs.getAllShopCartGoodsData(use));
		MysqlConnet.allClose();

	}

	private static void showShopCart(ShopCart sc) {
		Set<Goods> setgoods = sc.getSetgoods();
		System.out.println("商品ID\t商品名称\t商品价格\t商品库存\t商品类别");
		for (Goods goods : setgoods) {
			System.out.print(goods.getGid() + "\t" + goods.getGname() + "\t" + goods.getGprice() + "￥\t"
					+ goods.getGstock() + "\t" + goods.getSetClassfy().getCname() + "\n");
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
