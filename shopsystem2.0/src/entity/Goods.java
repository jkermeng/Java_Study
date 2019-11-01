package entity;

public class Goods {
	private int id;
	private String name;
	private int num;
	private double price;
	private String remake;

	public Goods() {
		super();
	}

	public Goods(int id) {
		super();
		this.id = id;
	}

	public Goods(String name) {
		super();
		this.name = name;
	}

	public Goods(int id, int num) {
		super();
		this.id = id;
		this.num = num;
	}

	public Goods(int id, String name, int num, double price, String remake) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
		this.price = price;
		this.remake = remake;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public double getPrice() {
		return price;
	}

	public String getRemake() {
		return remake;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

}
