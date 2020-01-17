package quizfour;

public class Player extends Plane implements Attact {
	private static Player p;
	private int damage;

//	@Override
//	public int attact() {
//		
//		return this.damage;
//	}

	private Player(String name ,int id,int blood) {
		super(name,id,blood);
		this.setDamage(-2);
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public static Player getPlayer(){
		if (p == null) {
			p = new Player("Player",0,100);
		}
		return p;
	}
	@Override
	public int attact() {
		// TODO Auto-generated method stub
		return this.getDamage();
	}

	
	

}
