package entity;

public class SecondPower {
	private Integer spid;
	private String spname;
	private String spURL;
	
	public SecondPower(Integer spid, String spname, String spURL) {
		super();
		this.spid = spid;
		this.spname = spname;
		this.spURL = spURL;
	}

	public Integer getSpid() {
		return spid;
	}

	public String getSpname() {
		return spname;
	}

	public String getSpURL() {
		return spURL;
	}

	public void setSpid(Integer spid) {
		this.spid = spid;
	}

	public void setSpname(String spname) {
		this.spname = spname;
	}

	public void setSpURL(String spURL) {
		this.spURL = spURL;
	}

	@Override
	public String toString() {
		return "SecondPower [spid=" + spid + ", spname=" + spname + ", spURL=" + spURL + "]";
	}

}
