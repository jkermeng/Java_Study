package entity;

public class Role {
	private Integer rid;// 角色id
	private String rname;// 角色名称
	private String rexplain;// 角色说明
	private Job jid;// 职位id
	private FirstPower fp;

	public Role(Integer rid, String rname, String rexplain, Job jid, FirstPower fp) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rexplain = rexplain;
		this.jid = jid;
		this.fp = fp;
	}

	public Role(Integer rid, String rname, String rexplain, Job jid) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rexplain = rexplain;
		this.jid = jid;
	}

	public FirstPower getFp() {
		return fp;
	}

	public void setFp(FirstPower fp) {
		this.fp = fp;
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
		return "Role [rid=" + rid + ", rname=" + rname + ", rexplain=" + rexplain + ", jid=" + jid + ", fp=" + fp + "]";
	}


}
