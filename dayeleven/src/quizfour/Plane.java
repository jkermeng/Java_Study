package quizfour;

public abstract class Plane implements Attact{
	private String name ;
	private int id ;
	private int blood = 100;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public Plane(String name, int id, int blood) {
		super();
		this.name = name;
		this.id = id;
		this.blood = blood;
	}
	public Plane() {
		super();
	}

	
	
	
}
