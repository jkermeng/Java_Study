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

		Responese urs = us.getUserByPhone(new Users("����Ա", "110"));
		Users use = (Users) urs.getObj();
		System.out.println(use);
		System.out.println("��ӭʹ��xxx�̵�,��ӭ�� " + use.getUname());
		// showGoods(gs.getGoodsData());//��ѯ����
		// ��ӻ���
		// �޸Ļ���
		// ɾ������
		// �鿴���ﳵ
		showShopCart(scs.getAllShopCartGoodsData(use));
		MysqlConnet.allClose();

	}

	private static void showShopCart(ShopCart sc) {
		Set<Goods> setgoods = sc.getSetgoods();
		System.out.println("��ƷID\t��Ʒ����\t��Ʒ�۸�\t��Ʒ���\t��Ʒ���");
		for (Goods goods : setgoods) {
			System.out.print(goods.getGid() + "\t" + goods.getGname() + "\t" + goods.getGprice() + "��\t"
					+ goods.getGstock() + "\t" + goods.getSetClassfy().getCname() + "\n");
		}
	}

	private static void showGoods(List<Goods> listg) {
		System.out.println("��ƷID\t��Ʒ����\t��Ʒ�۸�\t��Ʒ���\t��Ʒ���");
		for (Goods goods : listg) {
			System.out.print(goods.getGid() + "\t" + goods.getGname() + "\t" + goods.getGprice() + "��\t"
					+ goods.getGstock() + "\t" + goods.getSetClassfy().getCname() + "\n");
		}
	}

}
