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
			a=new PlayerPlane("���",300,10);
		}
		return a;
	}

	@Override
	public String toString() {
		return "��ʻԱ��  " + getName() + "   ����ֵ��  " + getLife() + "   ��������  " + getAttack();
				
	}

	@Override
	public void fight(Plane p) {
		int deleteHP=p.getAttack();//ÿ�ι������ٵ�HP
		Random r=new Random();
		//������  ʮ��֮һ 
		if(r.nextInt(10)<1) {
			System.out.println("��ɱ���");
			deleteHP*=2;
		}
		if(deleteHP<0) {
			deleteHP=0;
		}
		this.life-=deleteHP;//��HP����
		
		System.out.println(this.name +"�ܵ���  "+p.name +"  ����         ��ʧ��"+deleteHP+"������ֵ��");
		
	}
	
	
	
}
