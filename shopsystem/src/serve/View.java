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
 * @Date 2019��10��15��
 * @Version 1.0.0
 */
public class View {

	public static void main(String[] args) {
		int num = 0;
		boolean db = true;
		System.out.println("��ӭ");
		AddGoods addGoods = new AddGoods();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1���ͻ����� 2���˳�ϵͳ  0������Ա");
			String users[] = { "����Ա", "�ͻ�����" };
			int user = scanner.nextInt();
			if (user == 1 | user == 0) {
				System.out.println("��ӭ" + users[user]);

				System.out.println("�������˺ţ� ");
				int username = scanner.nextInt();
				System.out.println("���������룺  ");
				int userpassword = scanner.nextInt();

				if (username == 123 & userpassword == 123) {
					do {
						System.err.println("1���鿴��Ʒ 2�������Ʒ 3��ɾ����Ʒ 4���޸���Ʒ  5�����ﳵ  6���˳�ϵͳ");
						num = scanner.nextInt();

						if (user == 1 & num != 1 & num != 5 & num != 6) {
							System.out.println("�����ǹ���Ա");
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
								System.out.println("�޸ĵ���Ʒid");
								int nums = scanner.nextInt();
								addGoods.update(nums);
							}
							 if(num == 5){
								System.out.println("����Աû�й��ﳵ");
							}
						} else if (num == 5) {
							// Porter trolley = null;
							AddPorter trolley = new AddPorter(addGoods);
							int num5 = 0;
							while (num5 != 5) {
								System.out.println("1���鿴���ﳵ��Ʒ 2�������Ʒ�����ﳵ 3�����㹺�ﳵ   5���˳����ﳵ");
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
									System.out.println("\n\n�ܼ۸�" + trolley.sumGoods());
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
					System.out.println("�˺�������󣡣�����");
				}

			}

		}
	}
}
