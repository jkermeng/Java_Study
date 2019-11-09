package entity;

import java.io.Serializable;

public class DVD implements Serializable{
	private int id;
	private String name;
	private int lendCount;
	private String lendDate;
	private String status;

	public DVD(int id, String name, int lendCount, String lendDate, String status) {
		super();
		this.id = id;
		this.name = name;
		this.lendCount = lendCount;
		this.lendDate = lendDate;
		this.status = status;
	}
//
	public DVD(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public DVD(int id) {
		super();
		this.id = id;
	}

	public DVD(String status) {
		super();
		this.status = status;
	}

	public DVD() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getLendCount() {
		return lendCount;
	}

	public String getLendDate() {
		return lendDate;
	}

	public String getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLendCount(int lendCount) {
		this.lendCount = lendCount;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DVD [id=" + id + ", name=" + name + ", lendDate=" + lendDate + ", status=" + status + "]";
	}

}
