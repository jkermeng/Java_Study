package Test08;

import java.util.Random;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EnemyPlane edao= new EnemyPlane();
		//玩家飞机创建
	    Plane p1=PlayerPlane.CreatPlayer();
		
		System.out.println(p1.toString());
		//小飞机创建
		EnemyPlane e1=EnemyPlane.CreateSmall();
		System.out.println(e1.toString());
		//打飞机创建
		EnemyPlane e2=EnemyPlane.CreateBig();
		System.out.println(e2.toString());
		
		//新的飞机创建
		EnemyPlane e3=EnemyPlane.CreateNew();
		System.out.println(e3.toString());
		EnemyPlane e4=new EnemyPlane("运输机",500,1);
		System.out.println(e4.toString());
		
		//敌机数组
//		EnemyPlane[] es=edao.CreateE();
		
//		System.out.println("                    敌机：  1、小飞机  2、打飞机  3、歼-10  4、运输机 ");
//		System.out.println("                 任务需求：需击败5架敌机  才能通关任务！！！（敌机随机） ");
//		
		

		
//		for(EnemyPlane a:es) {
//			System.out.println("飞机类型：   " + a.getName() + "   生命值：   " + a.getLife() +"   攻击力：   " + a.getAttack());
//		}
//		
		
		int num=1;
		while(p1.isDie()&&e1.isDie()) {                  //当life>0,继续攻击  直到一方life<0
			System.out.println("                              第"+num+"回合");
			p1.fight(e1);                             //玩家受到敌机攻击
			if(!e1.isDie()) {
				break;
			}
			e1.fight(p1);                             //敌机受到玩家攻击
			
			
			
			System.out.println("当前情况：");
			System.out.println(p1.toString());
			System.out.println(e1.toString());
			num++;
			System.out.println("----------------------------");
		}
		System.out.println(p1.toString());
		System.out.println(e1);
		
		
		
		}

}
