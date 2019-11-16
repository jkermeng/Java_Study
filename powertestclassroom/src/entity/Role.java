package entity;

public class Role {
	private Integer rid;// ��ɫid
	private String rname;// ��ɫ����
	private String rexplain;// ��ɫ˵��

	private Job jid;// ְλid

	public Role(Integer rid, String rname, String rexplain) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rexplain = rexplain;
	}

	public Integer getRid() {
		return rid;
	}

	public String getRname() {
		return rname;
	}

	public String getRexplain() {
		return rexplain;
	}

	public Job getJid() {
		return jid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public void setRexplain(String rexplain) {
		this.rexplain = rexplain;
	}

	public void setJid(Job jid) {
		this.jid = jid;
	}

	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", rexplain=" + rexplain + ", jid=" + jid + "]";
	}

}
