package onetooneentity;

import onetomanyentity.Orders;
import onetomanyentity.ShopCart;

public class Users {
	private Integer uid;// 用户id
	private String uname;// 用户名称
	private String uphone;// 用户手机
	private String ugender;// 性别
	// 关系
	private ShopCart scart;
	private Orders order;

	public Users() {
		super();
	}

	public Users(Integer uid, String uname, String uphone, String ugender) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uphone = uphone;
		this.ugender = ugender;
	}

	public Integer getUid() {
		return uid;
	}

	public String getUname() {
		return uname;
	}

	public String getUphone() {
		return uphone;
	}

	public String getUgender() {
		return ugender;
	}

	public ShopCart getScart() {
		return scart;
	}

	public Orders getOrder() {
		return order;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public void setScart(ShopCart scart) {
		this.scart = scart;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

}
