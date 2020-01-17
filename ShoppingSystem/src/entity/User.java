package entity;

public class User {

	private String name;
	private int id;
	private String pwd;
	private String gender;
	private String job;

	public User() {
		super();
	}

	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	public User(String name, int id, String pwd, String gender, String job) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.gender = gender;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getGender() {
		return gender;
	}

	public String getJob() {
		return job;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
