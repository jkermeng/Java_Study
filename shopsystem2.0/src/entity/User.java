package entity;

public class User {
	private int id;
	private String name;
	private String pwd;
	private String power;

	public User() {
		super();
	}

	public User(int id, String name, String pwd, String power) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.power = power;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
