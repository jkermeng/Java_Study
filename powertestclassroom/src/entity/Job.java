package entity;

public class Job {
	private Integer jid;// 职位id
	private String jname;// 职位名称
	private String jnumber;// 职位编号
	private String jexplain;// 职位说明

	private Department did;// 部门id

	public Job(Integer jid, String jname, String jnumber, String jexplain) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.jnumber = jnumber;
		this.jexplain = jexplain;
	}

	public Job(Integer jid) {
		super();
		this.jid = jid;
	}

	public Job() {
		super();
	}

	public Integer getJid() {
		return jid;
	}

	public String getJname() {
		return jname;
	}

	public String getJnumber() {
		return jnumber;
	}

	public String getJexplain() {
		return jexplain;
	}

	public Department getDid() {
		return did;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public void setJnumber(String jnumber) {
		this.jnumber = jnumber;
	}

	public void setJexplain(String jexplain) {
		this.jexplain = jexplain;
	}

	public void setDid(Department did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Job [jid=" + jid + ", jname=" + jname + ", jnumber=" + jnumber + ", jexplain=" + jexplain + ", did="
				+ did + "]";
	}

}
