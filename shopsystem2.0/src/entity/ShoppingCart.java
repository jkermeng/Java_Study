package entity;

public class ShoppingCart {
	private int id;// ���ﳵID
	private Goods g;// ��Ʒ��Ϣ
	private int num;// ��������
	private double allTotle;// �ܼ۸�
	private String inTime;// ��ӹ��ﳵʱ��

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
