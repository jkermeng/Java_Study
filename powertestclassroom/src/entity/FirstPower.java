package entity;

public class FirstPower {
	private Integer fpid;
	private String fpname;

	private SecondPower sp;

	public FirstPower(Integer fpid, String fpname, SecondPower sp) {
		super();
		this.fpid = fpid;
		this.fpname = fpname;
		this.sp = sp;
	}

	public SecondPower getSp() {
		return sp;
	}

	public void setSp(SecondPower sp) {
		this.sp = sp;
	}

	public Integer getFpid() {
		return fpid;
	}

	public String getFpname() {
		return fpname;
	}

	public void setFpid(Integer fpid) {
		this.fpid = fpid;
	}

	public void setFpname(String fpname) {
		this.fpname = fpname;
	}

	@Override
	public String toString() {
		return "FirstPower [fpid=" + fpid + ", fpname=" + fpname + "]";
	}

}
