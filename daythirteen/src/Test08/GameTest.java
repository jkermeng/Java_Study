package Test08;

import java.util.Random;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EnemyPlane edao= new EnemyPlane();
		//��ҷɻ�����
	    Plane p1=PlayerPlane.CreatPlayer();
		
		System.out.println(p1.toString());
		//С�ɻ�����
		EnemyPlane e1=EnemyPlane.CreateSmall();
		System.out.println(e1.toString());
		//��ɻ�����
		EnemyPlane e2=EnemyPlane.CreateBig();
		System.out.println(e2.toString());
		
		//�µķɻ�����
		EnemyPlane e3=EnemyPlane.CreateNew();
		System.out.println(e3.toString());
		EnemyPlane e4=new EnemyPlane("�����",500,1);
		System.out.println(e4.toString());
		
		//�л�����
//		EnemyPlane[] es=edao.CreateE();
		
//		System.out.println("                    �л���  1��С�ɻ�  2����ɻ�  3����-10  4������� ");
//		System.out.println("                 �������������5�ܵл�  ����ͨ�����񣡣������л������ ");
//		
		

		
//		for(EnemyPlane a:es) {
//			System.out.println("�ɻ����ͣ�   " + a.getName() + "   ����ֵ��   " + a.getLife() +"   ��������   " + a.getAttack());
//		}
//		
		
		int num=1;
		while(p1.isDie()&&e1.isDie()) {                  //��life>0,��������  ֱ��һ��life<0
			System.out.println("                              ��"+num+"�غ�");
			p1.fight(e1);                             //����ܵ��л�����
			if(!e1.isDie()) {
				break;
			}
			e1.fight(p1);                             //�л��ܵ���ҹ���
			
			
			
			System.out.println("��ǰ�����");
			System.out.println(p1.toString());
			System.out.println(e1.toString());
			num++;
			System.out.println("----------------------------");
		}
		System.out.println(p1.toString());
		System.out.println(e1);
		
		
		
		}

}
