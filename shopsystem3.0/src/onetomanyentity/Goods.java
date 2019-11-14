package onetomanyentity;

import java.util.Set;

import mtomentity.OrderDetails;

public class Goods {
	private Integer gid;// ��Ʒid
	private String gname;// ��Ʒ����
	private Double gprice;// ��Ʒ����
	private Integer gstock;// ��Ʒ���
	private _Classification setClassfy;// fk

	// ��ϵ
	private Set<OrderDetails> odetails;
	private Set<ShopCart> setShoCart;
	private Set<GoodsPicture> gp;

	public Goods() {
		super();
	}
	public Goods(String gname, Double gprice, Integer gstock, _Classification setClassfy) {
		super();
		this.gname = gname;
		this.gprice = gprice;
		this.gstock = gstock;
		this.setClassfy = setClassfy;
	}

	public Goods(Integer gid, String gname, Double gprice, Integer gstock, _Classification setClassfy) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gstock = gstock;
		this.setClassfy = setClassfy;
	}

	public Goods(Integer gid, String gname, Double gprice, Integer gstock) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gstock = gstock;
	}

	public Goods(Integer gid, String gname, Double gprice) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
	}

	public Goods(Integer gid) {
		super();
		this.gid = gid;
	}

	public Integer getGid() {
		return gid;
	}

	public String getGname() {
		return gname;
	}

	public Double getGprice() {
		return gprice;
	}

	public Integer getGstock() {
		return gstock;
	}

	public Set<OrderDetails> getOdetails() {
		return odetails;
	}

	public Set<ShopCart> getSetShoCart() {
		return setShoCart;
	}

	public _Classification getSetClassfy() {
		return setClassfy;
	}

	public Set<GoodsPicture> getGp() {
		return gp;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}

	public void setGstock(Integer gstock) {
		this.gstock = gstock;
	}

	public void setOdetails(Set<OrderDetails> odetails) {
		this.odetails = odetails;
	}

	public void setSetShoCart(Set<ShopCart> setShoCart) {
		this.setShoCart = setShoCart;
	}

	public void setSetClassfy(_Classification setClassfy) {
		this.setClassfy = setClassfy;
	}

	public void setGp(Set<GoodsPicture> gp) {
		this.gp = gp;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gprice=" + gprice + ", gstock=" + gstock
				+ ", classification_cid=" + setClassfy + ", odetails=" + odetails + ", setShoCart=" + setShoCart
				+ ", gp=" + gp + "]";
	}

}
