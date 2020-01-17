package quizfour;

public class BigPlane extends Plane implements Attact{

	private int damage = -2;
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

//	@Override
//	public  int attact() {
//		return this.getDamage();
//	}


	public BigPlane(String name, int id, int blood) {
		super(name, id, blood);
	}
	
	public BigPlane(String name, int id, int blood, int damage) {
		super(name, id, blood);
		this.damage = damage;
	}

	public BigPlane() {
		super();
	}
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return this.getDamage();
	}
	
}
