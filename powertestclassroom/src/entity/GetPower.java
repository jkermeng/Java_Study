package entity;

public class GetPower {
	private Integer eid;
	private String ename;
	private String enumber;
	private Integer fpid;
	private String fpname;
	private String functionurl;

	public GetPower(Integer eid, String ename, String enumber, Integer fpid, String fpname, String functionurl) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.enumber = enumber;
		this.fpid = fpid;
		this.fpname = fpname;
		this.functionurl = functionurl;
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

	public GetPower() {
		super();
	}

	public Integer getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getEnumber() {
		return enumber;
	}

	public String getFunctionurl() {
		return functionurl;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}

	public void setFunctionurl(String functionurl) {
		this.functionurl = functionurl;
	}

	@Override
	public String toString() {
		return "GetPower [eid=" + eid + ", ename=" + ename + ", enumber=" + enumber + ", fpid=" + fpid + ", fpname="
				+ fpname + ", functionurl=" + functionurl + "]";
	}

}
