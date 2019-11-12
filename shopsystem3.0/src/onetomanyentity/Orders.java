package onetomanyentity;

import java.util.Set;

import mtomentity.OrderDetails;
import onetooneentity.Users;

public class Orders {
	private Integer oid;// 订单号
	private String ostart_time;// 订单时间
	private String ostatus;// 订单总额
	private Double ototal;// 订单状态
	private Integer user_uid;//
	// 关系
	private Users use;
	private Set<OrderDetails> setOrder;

	public Orders() {
		super();
	}

	public Orders(Integer oid, String ostart_time, String ostatus, Double ototal, Integer user_uid) {
		super();
		this.oid = oid;
		this.ostart_time = ostart_time;
		this.ostatus = ostatus;
		this.ototal = ototal;
		this.user_uid = user_uid;
	}

	public Integer getOid() {
		return oid;
	}

	public String getOstart_time() {
		return ostart_time;
	}

	public String getOstatus() {
		return ostatus;
	}

	public Double getOtotal() {
		return ototal;
	}

	public Integer getUser_uid() {
		return user_uid;
	}

	public Users getUse() {
		return use;
	}

	public Set<OrderDetails> getSetOrder() {
		return setOrder;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public void setOstart_time(String ostart_time) {
		this.ostart_time = ostart_time;
	}

	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}

	public void setOtotal(Double ototal) {
		this.ototal = ototal;
	}

	public void setUser_uid(Integer user_uid) {
		this.user_uid = user_uid;
	}

	public void setUse(Users use) {
		this.use = use;
	}

	public void setSetOrder(Set<OrderDetails> setOrder) {
		this.setOrder = setOrder;
	}

}
