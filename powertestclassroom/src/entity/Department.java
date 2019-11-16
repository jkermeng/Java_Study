package entity;

public class Department {
	private Integer did;// ����id
	private String dname;// ��������
	private Integer dnumber;// ���ű��
	private String dcreatdatetime;// ���Ž���ʱ��
	private String dbrief;// ���ż��
	private String dremarks;// ���ű�ע

	public Department(Integer did, String dname, Integer dnumber, String dcreatdatetime, String dbrief,
			String dremarks) {
		super();
		this.did = did;
		this.dname = dname;
		this.dnumber = dnumber;
		this.dcreatdatetime = dcreatdatetime;
		this.dbrief = dbrief;
		this.dremarks = dremarks;
	}

	public Department(Integer did) {
		super();
		this.did = did;
	}

	public Department() {
		super();
	}

	public Integer getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	public Integer getDnumber() {
		return dnumber;
	}

	public String getDcreatdatetime() {
		return dcreatdatetime;
	}

	public String getDbrief() {
		return dbrief;
	}

	public String getDremarks() {
		return dremarks;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setDnumber(Integer dnumber) {
		this.dnumber = dnumber;
	}

	public void setDcreatdatetime(String dcreatdatetime) {
		this.dcreatdatetime = dcreatdatetime;
	}

	public void setDbrief(String dbrief) {
		this.dbrief = dbrief;
	}

	public void setDremarks(String dremarks) {
		this.dremarks = dremarks;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dnumber=" + dnumber + ", dcreatdatetime="
				+ dcreatdatetime + ", dbrief=" + dbrief + ", dremarks=" + dremarks + "]";
	}

}
