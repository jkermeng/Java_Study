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
		System.out.println("��ӭ��½XXX�̵�");
		String bcn = null;
		do {
			RespondRuslt login = us.Login(sc);// ӵ���û�������Ϣ
			if (login.getCode() == 1000) {
				User user = (User) login.getObj();
				System.out.println("��ӭ: " + user.getName() + user.getPower() + "����xxx�̵�");
				showGoodsAll(gs.selectGoods(null));// ��ѯȫ����Ʒnull
				do {
					System.out.println("1���鿴ȫ����Ʒ  2�������鿴��Ʒ  3�������Ʒ  4���޸���Ʒ  5��ɾ����Ʒ  6�����ﳵ  0���뿪�̵� ");
					int nums = sc.nextInt();
					if (nums == 1) {
						showGoodsAll(gs.selectGoods(null));
					} else if (nums == 2) {
						System.out.println("��������Ҫ�����鿴����ƷID: ");
						int idName = sc.nextInt();
						showGoodsAll(gs.selectGoods(new Goods(idName)));

					} else if (nums == 6) {
						do {
							String cn = null;
							System.out.println("1���鿴���ﳵ��Ϣ 2�������Ʒ�����ﳵ  3���޸Ĺ��ﳵ��Ϣ  4��ɾ�����ﳵ  5�����㹺�ﳵ  0���˳����ﳵ");
							int numss = sc.nextInt();
							if (numss == 1) {
								RespondRuslt selectCart = scs.selectCart();
								System.out.println("��ѯ��  " + selectCart.getMsg());
								showCart(selectCart);
							} else if (numss == 2) {
								do {
									System.out.println("����������Ҫ����ƷID�� ");
									int id = sc.nextInt();
									System.out.println("��������Ҫ����������� ");
									int num = sc.nextInt();
									scs.addCart(id, num, DateUtil.dateToStr(new Date(), "yyyy-MM-dd"));
									System.out.println("y����/nȡ��");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 3) {
								System.out.println("�������޸ĵ�ID��");
								int id = sc.nextInt();
								System.out.println("�������޸ĵ���Ŀ��");// �������޸ĵ�id
								int num = sc.nextInt();
								RespondRuslt updateCart = scs.updateCart(new Goods(id, num));
								System.out.println("�޸�" + updateCart.getMsg());
							} else if (numss == 4) {
								do {
									System.out.println("������ɾ�����ﳵ�����ID��");
									int id = sc.nextInt();
									RespondRuslt deleteCart = scs.deleteCart(new Goods(id));
									System.out.println(deleteCart.getMsg() + "ɾ�����ﳵ");
									System.out.println("y����/n�˳�");
									cn = sc.next();
								} while (cn.equals("y"));
							} else if (numss == 5) {
								RespondRuslt countAll = scs.countAll();
								System.out.println("���㣺  " + countAll.getMsg());
							} else if (numss == 0) {
								break;
							}
						} while (true);
					}
					if (user.getId() == 0) {

						if (nums == 3) {
							// ����Ա���
							String cn3 = null;
							do {
								System.out.println("��ӵ���ƷID�� ");
								int id = sc.nextInt();
								System.out.println("��ӵ���Ʒ���ƣ� ");
								String name = sc.next();
								System.out.println("��ӵ���Ʒ������ ");
								int num = sc.nextInt();
								System.out.println("��ӵ���Ʒ�۸� ");
								double price = sc.nextInt();
								System.out.println("��ӵ���Ʒ��ע�� ");
								String remake = sc.next();
								RespondRuslt addGoods = gs.addGoods(new Goods(id, name, num, price, remake));
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
								double price = sc.nextInt();
								System.out.println("�޸ĵ���Ʒ��ע�� ");
								String remake = sc.next();
								RespondRuslt updateGoods = gs.addOrUpdateGoods(new Goods(id, name, num, price, remake));// ���»����Ϊ�ֶ�����
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
								RespondRuslt deleteGoods = gs.deleteGoods(new Goods(id));// ͨ��idɾ����Ʒ
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
				System.out.println(login.getMsg() + "�˺��������ʣ��" + (l) + "�λ���");

				if (l == 0) {
					break;
				}
			}
		} while (true);
		sc.close();
		// �����Ʒʱ�����ж�ID�ظ�--solve;
		// �޸���Ʒʱ�����ж��Ƿ����id
		// ���ﳵû�л���ʱ����ָ�룡������--solve
		// ���ﳵ��������id������,�����жϻ���id�Ƿ����--solve half

	}

	/**
	 * ���ò�ѯ����
	 * 
	 * @param res
	 */
	private static void showGoodsAll(RespondRuslt res) {
		if (res.getMsg().equals("NULL")) {
			System.out.println(res.getMsg());
		} else {
			List<Goods> goodsBox = (List<Goods>) res.getObj();
			System.out.println("��ƷID\t" + "��Ʒ����\t" + "��Ʒ����\t" + "��Ʒ���\t" + "\n");
			for (Goods goods : goodsBox) {
				System.out.print(goods.getId() + "\t" + goods.getName() + "\t" + goods.getPrice() + "\t"
						+ goods.getNum() + "\n");
			}
		}
	}

	/**
	 * ���ù��ﳵ��Ʒ�鿴
	 * 
	 * @param res
	 */
	private static void showCart(RespondRuslt res) {
		double all = 0;
		if (res.getCode() == 1000) {
			List<ShoppingCart> shopBox = (List<ShoppingCart>) res.getObj();
			System.out.println("��ƷID\t" + "��Ʒ����\t" + "ʣ������\t" + "��Ʒ����\t" + "��������\t" + "��ӹ��ﳵʱ��\t");
			for (ShoppingCart cartGoods : shopBox) {
				System.out.print(cartGoods.getG().getId() + "\t" + cartGoods.getG().getName() + "\t"
						+ (cartGoods.getG().getNum() - cartGoods.getNum()) + "\t" + cartGoods.getG().getPrice() + "\t"
						+ cartGoods.getNum() + "\t" + cartGoods.getInTime() + "\n");
				all += cartGoods.getAllTotle();
			}
			System.out.println("\n\n" + "�ܼۣ�  " + all);
		}

	}

}
