package view;

import java.io.IOException;
import java.util.Scanner;

import entity.DVD;
import service.DVDManager;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		DVDManager dvdManager = new DVDManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭʹ�������DVD��������������");
		System.out.println("----------------------------");
		int choice = 0;
		do {
			System.out.println("1.��� DVD\n2.�鿴 DVD\n3.ɾ�� DVD\n4.��� DVD\n5.�黹 DVD\n6.��\t��");
			System.out.print("��ѡ��:\t");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("���DVD��ID��\t");
				int id = sc.nextInt();
				System.out.print("���DVD�����ƣ�\t");
				String name = "��" + sc.next() + "��";
				int addDVD = dvdManager.addDVD(new DVD(id, name, 1, null, "�ɽ�"));
				break;
			case 2:
				showDVD(dvdManager.selectDVD());
				break;
			case 3:
				System.out.print("���DVD��ID��\t");
				int d_id = sc.nextInt();
				dvdManager.deleteDVD(new DVD(d_id));
				break;
			case 4:
				System.out.print("���DVD��ID��\t");
				int l_id = sc.nextInt();
				dvdManager.lendDVD(new DVD(l_id));
				break;
			case 5:
				System.out.print("���DVD��ID��\t");
				int b_id = sc.nextInt();
				dvdManager.borrowDVD(new DVD(b_id));
				break;
			default:
				break;
			}
			System.out.println("***************************");
		} while (choice != 6);
		sc.close();
	}

	private static void showDVD(DVD[] dvd) {
		System.out.print("���\t״̬\t����\t\t�������\n");
		DVD dvd2 = null;
		int k = 1;
		for (int i = 0; i < dvd.length; i++) {
			dvd2 = dvd[dvd.length - k];
			k++;
			System.out.print(dvd2.getId() + "\t" + dvd2.getStatus() + "\t" + dvd2.getName() + "\t\t"
					+ dvd2.getLendDate() + "\n");
		}

	}
}
