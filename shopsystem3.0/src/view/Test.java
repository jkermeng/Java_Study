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
		System.out.println("��ӭ��½XXX�̵�");
		String bcn = null;
		do {
			Responese urs = us.getUserByPhone(new Scanner(System.in));// ӵ���û�������Ϣ
			if (urs.getCode() == 1) {
				Users use = (Users) urs.getObj();
				System.out.println("��ӭ: " + use.getUname() + "����xxx�̵�");
				showGoods(gs.getGoodsData());// ��ѯȫ����Ʒnull
				do {
					System.out.println("1���鿴ȫ����Ʒ  2�������鿴��Ʒ  3�������Ʒ  4���޸���Ʒ  5��ɾ����Ʒ  6�����ﳵ  0���뿪�̵� ");
					int nums = sc.nextInt();
					if (nums == 1) {
						showGoods(gs.getGoodsData());
					} else if (nums == 2) {
						System.out.println("��������Ҫ�����鿴����ƷID: ");
						int idName = sc.nextInt();
						showGoods(gs.getGoodsDataById(new Goods(idName)));

					} else if (nums == 6) {
						do {
							String cn = null;
							System.out.println("1���鿴���ﳵ����  2�������Ʒ�����ﳵ  3���޸Ĺ��ﳵ������Ϣ  4��ɾ�����ﳵ  5�����㹺�ﳵ  0���˳����ﳵ");
							int numss = sc.nextInt();
							if (numss == 1) {
								Responese userShopCartGoodsData = scs.getUserShopCartGoodsData(use);
								System.out.println("��ѯ��  " + userShopCartGoodsData.getMsg());
								showShopCart(userShopCartGoodsData);// �ĸ������ڶ�������
							} else if (numss == 2) {
								do {
									System.out.println("����������Ҫ����ƷID�� ");
									int id = sc.nextInt();
									System.out.println("��������Ҫ����������� ");
									int num = sc.nextInt();
									scs.addShopCartGoods(id, num, use);
									System.out.println("y����/nȡ��");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 3) {
								System.out.println("�������޸ĵ�ID��");
								int id = sc.nextInt();
								System.out.println("�������޸ĵ���Ŀ��");// �������޸ĵ�id
								int num = sc.nextInt();
								Responese updateCart = scs.updateShopCartGoods(id, num, use);// �޸Ķ�������
								System.out.println("�޸�" + updateCart.getMsg());
							} else if (numss == 4) {
								do {
									System.out.println("������ɾ�����ﳵ�����ID��");
									int id = sc.nextInt();
									Responese deleteCart = scs.deleteShopCartGoods(id, use);
									System.out.println(deleteCart.getMsg() + "ɾ�����ﳵ");// ɾ�����ﳵ�����Ʒ
									System.out.println("y����/n�˳�");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 5) {
								Responese countAll = scs.countMyShopCart(use);
								System.out.println("���㣺 " + countAll.getMsg());// ����orders
							} else if (numss == 0) {
								break;
							}
						} while (true);
					}
					if (use.getUname().equals("����Ա")) {

						if (nums == 3) {
							// ����Ա���
							String cn3 = null;
							do {
								System.out.println("��ӵ���Ʒ���ƣ� ");
								String name = sc.next();
								System.out.println("��ӵ���Ʒ������ ");
								int num = sc.nextInt();
								System.out.println("��ӵ���Ʒ�۸� ");
								double price = sc.nextDouble();
								System.out.println("��ӵ���Ʒ���ࣺ ");
								int remake = sc.nextInt();
								Responese addGoods = gs
										.addGoods(new Goods( name, price, num, new _Classification(remake)), use);
								System.out.println("���؛�" + addGoods.getMsg());
								System.out.println("y����/n�˳�");
								cn3 = sc.next();
							} while (cn3.equals("y"));
						} else if (nums == 4) {
							// ����Ա�޸�
							String cn4 = null;
							do {
								System.out.println("�޸ĵ���ƷID�� ");
								int id = sc.nextInt();
								System.out.println("�޸ĵ���Ʒ���ƣ� ");
								String name = sc.next();
								System.out.println("�޸ĵ���Ʒ������ ");
								int num = sc.nextInt();
								System.out.println("�޸ĵ���Ʒ�۸� ");
								double price = sc.nextDouble();
								System.out.println("�޸ĵ���Ʒ��� ");
								int remake = sc.nextInt();
								Responese updateGoods = gs
										.updateGoods(new Goods(id, name, price, num, new _Classification(remake)), use);// ���»����Ϊ�ֶ�����
								System.out.println("�޸Ļ���: " + updateGoods.getMsg());
								System.out.println("y����/n�˳�");
								cn4 = sc.next();
							} while (cn4.equals("y"));
						} else if (nums == 5) {
							// ����Աɾ������
							String cn5 = null;
							do {
								System.out.println("ɾ������ƷID�� ");
								int id = sc.nextInt();
								Responese deleteGoods = gs.deleteGoods(new Goods(id), use);// ͨ��idɾ����Ʒ
								System.out.println(deleteGoods.getMsg());
								System.out.println("y����/n�˳�");
								cn5 = sc.next();
							} while (cn5.equals("y"));
						}
					} else if (nums == 0) {
						System.exit(0);
					}

				} while (true);

			} else {
				l--;
				System.out.println(urs.getMsg() + "�˺��������ʣ��" + (l) + "�λ���");

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
		System.out.println("��ƷID\t��Ʒ����\t��Ʒ�۸�\t��Ʒ����\t��Ʒ����ʱ��");
		for (ShopCart shopCart : setgoods) {
			for (Goods gs : shopCart.getSetgoods()) {
				System.out.print(gs.getGid() + "\t" + gs.getGname() + "\t" + gs.getGprice() + "\t"
						+ shopCart.getGnumber() + "\t" + shopCart.getGtime() + "\n");

			}
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
