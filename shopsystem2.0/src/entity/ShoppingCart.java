package entity;

public class ShoppingCart {
	private int id;// 购物车ID
	private Goods g;// 商品信息
	private int num;// 购买数量
	private double allTotle;// 总价格
	private String inTime;// 添加购物车时间

	public ShoppingCart(int id, Goods g, int num, String inTime) {
		super();
		this.id = id;
		this.g = g;
		this.num = num;
		this.inTime = inTime;
	}

	public ShoppingCart(int id, int num) {
		super();
		this.id = id;
		this.num = num;
	}

	public ShoppingCart(Goods g, int num, String inTime) {
		super();
		this.g = g;
		this.num = num;
		this.inTime = inTime;
	}

	public ShoppingCart(int id) {
		super();
		this.id = id;
	}

	public ShoppingCart() {
		super();
	}

	public double getAllTotle() {
		return allTotle;
	}

	public void setAllTotle(double allTotle) {
		this.allTotle = allTotle;
	}

	public int getId() {
		return id;
	}

	public Goods getG() {
		return g;
	}

	public int getNum() {
		return num;
	}

	public String getInTime() {
		return inTime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setG(Goods g) {
		this.g = g;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

}
