package mtomentity;

import onetomanyentity.Goods;
import onetomanyentity.Orders;

public class OrderDetails {
	private Integer detailedid;// 子项id
	private String detailedname;// 商品名称
	private Integer detailednumber;// 购买数量
	private Double goodsprice;// 商品单价
	private Double detailedtotal;// 小计
	private Integer goods_gid;//
	private Integer order_oid;//
	// 关系
	private Goods good;
	private Orders order;

	public OrderDetails() {
		super();
	}

	public OrderDetails(Integer detailedid, String detailedname, Integer detailednumber, Double goodsprice,
			Double detailedtotal, Integer goods_gid, Integer order_oid) {
		super();
		this.detailedid = detailedid;
		this.detailedname = detailedname;
		this.detailednumber = detailednumber;
		this.goodsprice = goodsprice;
		this.detailedtotal = detailedtotal;
		this.goods_gid = goods_gid;
		this.order_oid = order_oid;
	}

	public Integer getDetailedid() {
		return detailedid;
	}

	public String getDetailedname() {
		return detailedname;
	}

	public Integer getDetailednumber() {
		return detailednumber;
	}

	public Double getGoodsprice() {
		return goodsprice;
	}

	public Double getDetailedtotal() {
		return detailedtotal;
	}

	public Integer getGoods_gid() {
		return goods_gid;
	}

	public Integer getOrder_oid() {
		return order_oid;
	}

	public Goods getGood() {
		return good;
	}

	public Orders getOrder() {
		return order;
	}

	public void setDetailedid(Integer detailedid) {
		this.detailedid = detailedid;
	}

	public void setDetailedname(String detailedname) {
		this.detailedname = detailedname;
	}

	public void setDetailednumber(Integer detailednumber) {
		this.detailednumber = detailednumber;
	}

	public void setGoodsprice(Double goodsprice) {
		this.goodsprice = goodsprice;
	}

	public void setDetailedtotal(Double detailedtotal) {
		this.detailedtotal = detailedtotal;
	}

	public void setGoods_gid(Integer goods_gid) {
		this.goods_gid = goods_gid;
	}

	public void setOrder_oid(Integer order_oid) {
		this.order_oid = order_oid;
	}

	public void setGood(Goods good) {
		this.good = good;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

}
