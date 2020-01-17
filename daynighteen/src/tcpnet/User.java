package tcpnet;

public class User {
	private Integer id;
	private String ip;

	public Integer getId() {
		return id;
	}

	public String getIp() {
		return ip;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public User(Integer id, String ip) {
		super();
		this.id = id;
		this.ip = ip;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ip=" + ip + "]";
	}

}
