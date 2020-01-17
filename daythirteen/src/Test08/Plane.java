package Test08;



public abstract class Plane {
	protected String name;
	protected int life;
	protected int attack;
	
	
	public Plane(String name, int life, int attack) {
		super();
		this.name = name;
		this.life = life;
		this.attack = attack;
	}
	
	public boolean isDie() {
		if(life>0) {
			return true;
		}else {
			System.out.println(this.name+"ÒÑËÀÍö");
			return false;
		}
	}
	
	
	public abstract void fight(Plane p);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Plane() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
	
	
}
