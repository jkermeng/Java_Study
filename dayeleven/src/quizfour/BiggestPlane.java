package quizfour;

public class BiggestPlane extends Plane{
	private int damage;
	
//	@Override
//	public int attact() {
//		
//		return this.getDamage();
//	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public BiggestPlane(String name, int id, int blood, int damage) {
		super(name, id, blood);
		this.damage = damage;
	}
	public BiggestPlane(String name, int id, int blood) {
		super(name, id, blood);
	}
	
	public BiggestPlane(){
		super();
	}
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return this.getDamage();
	}
}
