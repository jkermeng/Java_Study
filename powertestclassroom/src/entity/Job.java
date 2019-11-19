package entity;

public class Job {
	private Integer jid;// ְλid
	private String jname;// ְλ����
	private String jnumber;// ְλ���
	private String jexplain;// ְλ˵��

	private Department did;// ����id

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
