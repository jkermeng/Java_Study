package onetomanyentity;

import java.util.Set;

import mtomentity.OrderDetails;

public class Goods {
	private Integer gid;// 商品id
	private String gname;// 商品名称
	private Double gprice;// 商品单价
	private Integer gstock;// 商品库存
	private Integer classification_cid;
	// 关系
	private Set<OrderDetails> odetails;
	private Set<ShopCart> setShoCart;
	private _Classification setClassfy;
	private Set<GoodsPicture> gp;

	public Goods() {
		super();
	}

	public Goods(Integer gid, String gname, Double gprice, Integer gstock, Integer classification_cid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gstock = gstock;
		this.classification_cid = classification_cid;
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

	public Integer getClassification_cid() {
		return classification_cid;
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

	public void setClassification_cid(Integer classification_cid) {
		this.classification_cid = classification_cid;
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
				+ ", classification_cid=" + classification_cid + ", odetails=" + odetails + ", setShoCart=" + setShoCart
				+ ", setClassfy=" + setClassfy + ", gp=" + gp + "]";
	}

}
