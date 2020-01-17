package Test08;

import java.util.Random;

public class PlayerPlane extends Plane{

	static PlayerPlane a =null;

	private PlayerPlane(String name, int life, int attack) {
		super();
		this.setName(name) ;
		this.setLife(life);
		this.setAttack(attack);
	}

	public static PlayerPlane CreatPlayer() {
		if(a==null) {
			a=new PlayerPlane("玩家",300,10);
		}
		return a;
	}

	@Override
	public String toString() {
		return "驾驶员：  " + getName() + "   生命值：  " + getLife() + "   攻击力：  " + getAttack();
				
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
