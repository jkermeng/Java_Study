package entity;
/**
*
*
*@Author JKermeng
*@Date 2019Äê10ÔÂ15ÈÕ
*@Version 1.0.0
*/
public class Goods {
	private int id ;
	private String name ;
	private double prince;
	private int num;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	
	public Goods(int id, String name, double prince, int num) {
		super();
		this.id = id;
		this.name = name;
		this.prince = prince;
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrince() {
		return prince;
	}
	public void setPrince(double prince) {
		this.prince = prince;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", prince=" + prince + ", num=" + num + "]";
	}
	

}
