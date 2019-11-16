package entity;

public class Employee {
	private Integer eid;// 员工id
	private String ename;// 员工名称
	private String enumber;// 员工编号
	private String epassword;// 员工密码
	private String egender;// 员工性别
	private String ephone;// 员工电话
	private String eemail;// 员工邮件
	private String estattus;// 员工状态

	private Department did;// 部门编号

	public Employee(Integer eid, String ename, String enumber, String epassword, String egender, String ephone,
			String eemail, String estattus) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.enumber = enumber;
		this.epassword = epassword;
		this.egender = egender;
		this.ephone = ephone;
		this.eemail = eemail;
		this.estattus = estattus;
	}

	public Employee() {
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

	public String getEpassword() {
		return epassword;
	}

	public String getEgender() {
		return egender;
	}

	public String getEphone() {
		return ephone;
	}

	public String getEemail() {
		return eemail;
	}

	public String getEstattus() {
		return estattus;
	}

	public Department getDid() {
		return did;
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

	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}

	public void setEgender(String egender) {
		this.egender = egender;
	}

	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public void setEstattus(String estattus) {
		this.estattus = estattus;
	}

	public void setDid(Department did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", enumber=" + enumber + ", epassword=" + epassword
				+ ", egender=" + egender + ", ephone=" + ephone + ", eemail=" + eemail + ", estattus=" + estattus
				+ ", did=" + did + "]";
	}
	
}
