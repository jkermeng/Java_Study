package onetomanyentity;

import java.util.Set;

import onetooneentity.Users;

public class ShopCart {
	private Integer cid;// 购物车id
	private Integer user_uid;
	// 关系
	private Users use;
	private Set<Goods> setgoods;

	public ShopCart() {
		super();
	}

	public ShopCart(Integer cid, Integer user_uid) {
		super();
		this.cid = cid;
		this.user_uid = user_uid;
	}

	public Integer getCid() {
		return cid;
	}

	public Integer getUser_uid() {
		return user_uid;
	}

	public Users getUse() {
		return use;
	}

	public Set<Goods> getSetgoods() {
		return setgoods;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public void setUser_uid(Integer user_uid) {
		this.user_uid = user_uid;
	}

	public void setUse(Users use) {
		this.use = use;
	}

	public void setSetgoods(Set<Goods> setgoods) {
		this.setgoods = setgoods;
	}

}
