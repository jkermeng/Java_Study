package mtomentity;

import onetomanyentity.Goods;
import onetomanyentity.Orders;

public class OrderDetails {
	private Integer detailedid;// ����id
	private String detailedname;// ��Ʒ����
	private Integer detailednumber;// ��������
	private Double goodsprice;// ��Ʒ����
	private Double detailedtotal;// С��
	// ��ϵ
	private Goods goods_gid;
	private Orders order_oid;

	public OrderDetails() {
		super();
	}

	public OrderDetails(String detailedname, Integer detailednumber, Double goodsprice, Double detailedtotal) {
		super();
		this.detailedname = detailedname;
		this.detailednumber = detailednumber;
		this.goodsprice = goodsprice;
		this.detailedtotal = detailedtotal;
	}

	public OrderDetails(Integer detailedid, String detailedname, Integer detailednumber, Double goodsprice,
			Double detailedtotal) {
		super();
		this.detailedid = detailedid;
		this.detailedname = detailedname;
		this.detailednumber = detailednumber;
		this.goodsprice = goodsprice;
		this.detailedtotal = detailedtotal;

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

	public Goods getGoods_gid() {
		return goods_gid;
	}

	public Orders getOrder_oid() {
		return order_oid;
	}

	public void setGoods_gid(Goods goods_gid) {
		this.goods_gid = goods_gid;
	}

	public void setOrder_oid(Orders order_oid) {
		this.order_oid = order_oid;
	}

	@Override
	public String toString() {
		return "OrderDetails [detailedid=" + detailedid + ", detailedname=" + detailedname + ", detailednumber="
				+ detailednumber + ", goodsprice=" + goodsprice + ", detailedtotal=" + detailedtotal + ", goods_gid="
				+ goods_gid + ", order_oid=" + order_oid + "]";
	}

}
