package dao;

import java.util.Arrays;
import java.util.Scanner;

import entity.Goods;
import entity.Porter;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��15��
 * @Version 1.0.0
 */
public class AddGoods {

	// ����λ˽�з���
	private Goods[] set;

	public Goods[] getSet() {
		return set;
	}

	public void setSet(Goods[] set) {
		this.set = set;
	}

	/**
	 * ��ʼ����Ʒ
	 */
	public AddGoods() {
		set = new Goods[4];
		Goods goods = new Goods(1, "����", 88, 90);
		Goods goods2 = new Goods(2, "����", 88, 80);
		Goods goods3 = new Goods(3, "ƹ����", 88, 2);
		Goods goods4 = new Goods(4, "������", 88, 1);
		set[0] = goods;
		set[1] = goods2;
		set[2] = goods3;
		set[3] = goods4;
		selectGoods();

	}

	/**
	 * �����Ʒ
	 * 
	 * @return
	 */
	public Goods[] addGoods() {
		Scanner scanners = new Scanner(System.in);
		String value = null;
		String ab = null;
		boolean bl = true;
		do {
			System.out.print("��������ƷID:");
			int id = scanners.nextInt();
			Goods temprory[] = new Goods[set.length + 1];
			if (set.length > 0) {
				for (int j = 0; j < set.length; j++) {
					temprory[j] = set[j];
					if (id == set[j].getId() ) {
						System.out.println("���ظ�ID");
						bl = false;

					}
				}
			}
			if (bl == true) {
				System.out.print("��������Ʒ����:");
				String name = scanners.next();
				System.out.print("��������Ʒ�۸�:");
				int prince = scanners.nextInt();
				System.out.print("��������Ʒ����:");
				int num = scanners.nextInt();
				Goods goods = new Goods(id, name, prince, num);
				temprory[temprory.length - 1] = goods;
				set = temprory;
			}
			bl =true;
			System.out.println("����y����д����Ʒn�˳�");
			ab = scanners.next();

		} while (ab.equals("y"));

		return set;

	}

	/**
	 * ��ѯ����
	 */
	public void selectGoods() {
		Goods[] a = set;
		if (a.length > 0) {
			System.out.println("��ƷID\t��Ʒ����\t��Ʒ����\t��Ʒ�۸�\t\n");
			for (Goods goods : a) {
				System.out.println(
						goods.getId() + "\t" + goods.getName() + "\t" + goods.getNum() + "\t" + goods.getPrince());
			}
		} else {
			System.out.println("û���κ���Ʒ");
		}

	}

	/**
	 * ɾ����Ʒ����
	 * 
	 * @return ����ʣ����Ʒ����
	 */
	public Goods[] deleteGoods() {
		Goods a[] = set;
		System.out.print("������Ҫɾ����id��");
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
	 * �޸���Ʒ��Ϣ
	 * 
	 * @return
	 */
	public Goods[] update(int id) {
		// ʣ�µĻ�������
		int i = 0;
		int j = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("��Ʒ���ƣ� ");
		String name = scanner.next();
		System.out.println("��Ʒ������ ");
		int num = scanner.nextInt();
		System.out.println("��Ʒ�۸� ");
		double prince = scanner.nextDouble();
		// Goods addGoods = new Goods(id,name,price,num);
		// �жϹ��ﳵ��Ӧ�Ļ�Դid�����޸���Ŀ
		if (i < set.length) {
			for (; i < set.length;) {
				Goods goods2 = set[i];
				// Goods goods = addGoods[j];
				if (id == goods2.getId()) {
					// �ɹ��޸����ֵ����һ����ӡ������Ʒ����Ʒ�ܼ�
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
		// �õ�ԭ�����������ֵ

		return set;
	}

	/**
	 * ������
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
			System.out.print("�����ƷID��");
			id = sc.nextInt();
			for (; k < set.length; k++) {
				if(id == set[k].getId()){
					bbc = true;
					break;
				}
			}
			if(bbc){
			temprory[j] = id;
			System.out.print("�����Ʒ������");
			int num = sc.nextInt();
			if(num<set[k].getNum()){
				temprory[j + 1] = num;
				porter = temprory;
				j += 2;
			}else{
				System.out.println("������Ʒ����");
			}
		
			}else{
				System.out.println("�����û�и���Ʒ");
			}
			k=0;
			System.out.print("y����n������");
			y = sc.next();
			
		} while (y.equals("y"));

		return porter;
	}

	/**
	 * ��Ʒ����
	 * 
	 * @param porter
	 *            ���ﳵ
	 */
	public void retreat(AddPorter porter) {
		// ʣ�µĻ�������
		int i = 0;
		int j = 0;
		int[] num = porter.getTrolley().getNum();
		Goods[] addGoods = porter.getTrolley().getAddGoods();
		// �жϹ��ﳵ��Ӧ�Ļ�Դid�����޸���Ŀ
		if (i < set.length) {
			for (; i < set.length;) {
				Goods goods2 = set[i];
				Goods goods = addGoods[j];
				int num2 = num[j];
				if (goods.getId() == goods2.getId()) {
					// �ɹ��޸����ֵ����һ����ӡ������Ʒ����Ʒ�ܼ�
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
		// �õ�ԭ�����������ֵ

	}

}
