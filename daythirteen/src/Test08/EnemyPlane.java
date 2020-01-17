package Test08;

import java.util.Arrays;
import java.util.Random;



public class EnemyPlane extends Plane{
	private EnemyPlane[]  challenge;
	
    static EnemyPlane bigPlane =null;
	
	static EnemyPlane smallPlane =null;
	
	static EnemyPlane jianPlane =null;
	
	static EnemyPlane yunPlane =null;
	
	//EnemyPlane edao= new EnemyPlane();

	
	public EnemyPlane() {
		challenge=new  EnemyPlane[5];
		
	}
	
	
	 public void AddEnemyPlane(EnemyPlane a) {
		 EnemyPlane[] challengeCopy = Arrays.copyOf(challenge, challenge.length + 1);
		 challengeCopy[challengeCopy.length - 1] = a;
		 challenge=challengeCopy;
		 
	 }
	 
	 public EnemyPlane[] showEnemy() {
		 return challenge;
	 }
	

public EnemyPlane[] CreateE() {
	  EnemyPlane[] es=this.showEnemy(); 
		for(int i=0;i<5;i++) {
			Random r=new Random();
			int a=r.nextInt(3)+1;
			for(int j=0;j<5;j++) {
			
			  if(a==0) {
				es[j]=this.CreateSmall();
				break;
			  }else if(a==1) {
				es[j]=this.CreateBig();
				break;
			  }else if(a==2) {
			 	es[j]=this.CreateNew();
				break;
		      }else	if(a==3) {
				es[j]=this.CreateYun();
				break;
			 }
			
			}
		
				
		}
		return es;
	
				
}
	



	public EnemyPlane(String name, int life, int attack) {
		super();
		this.setName(name); 
		this.setLife(life);
		this.setAttack(attack);
	}
	
	
	
	public static EnemyPlane CreateBig() {
		if(bigPlane==null) {
			bigPlane=new EnemyPlane("大飞机",200,2);
			
		}
		return bigPlane;
	}
	
	public static EnemyPlane CreateSmall() {
		if(smallPlane==null) {
			smallPlane=new EnemyPlane("小飞机",100,1);
			
		}
		return smallPlane;
	}
	
	public static EnemyPlane CreateNew() {
		if(jianPlane==null) {
			jianPlane=new EnemyPlane("歼-10",150,3);
			
		}
		return jianPlane;
	}
	
	public static EnemyPlane CreateYun() {
		if(yunPlane==null) {
			yunPlane=new EnemyPlane("运输机",350,1);
			
		}
		return jianPlane;
	}
	
	@Override
	public String toString() {
		return "飞机类型：   " + getName() + "   生命值：   " + getLife() +"   攻击力：   " + getAttack();
	}

	@Override
	public void fight(Plane p) {
		int deleteHP=p.getAttack();//每次攻击减少的HP
		Random r=new Random();
		//暴击率  十分之一 
		if(r.nextInt(10)<1) {
			System.out.println("造成暴击");
			deleteHP*=2;
		}
		if(deleteHP<0) {
			deleteHP=0;
		}
		this.life-=deleteHP;//将HP减少
		System.out.println(this.name +"受到了  "+p.name +"  攻击         损失："+deleteHP+"点生命值！"); 
		
		
	}
	
	
}
