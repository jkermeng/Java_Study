package onetomanyentity;

import java.util.Set;

import onetooneentity.Users;

public class ShopCart {
	private Integer cid;// 购物车id
	// 关系
	private Users use;
	private Set<Goods> setgoods;

	public ShopCart() {
		super();
	}

	public ShopCart(Integer cid) {
		super();
		this.cid = cid;
	}

	public Integer getCid() {
		return cid;
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

	public void setUse(Users use) {
		this.use = use;
	}

	public void setSetgoods(Set<Goods> setgoods) {
		this.setgoods = setgoods;
	}

	@Override
	public String toString() {
		return "ShopCart [cid=" + cid + ", use=" + use + ", setgoods=" + setgoods + "]";
	}

}
