package quizfour;

public class SmallPlane extends Plane implements Attact {
	private int damage = -1;
	

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}


	public SmallPlane(String name, int id, int blood, int damage) {
		super(name, id, blood);
		this.damage = damage;
	}

	public SmallPlane(String name, int id, int blood) {
		super(name, id, blood);
	}
	public SmallPlane() {
		super();
	}
//	@Override
//	public int attact() {
//		
//		return this.getDamage();
//		
//	}

	@Override
	public int attact() {
		return this.getDamage();
	}

}
