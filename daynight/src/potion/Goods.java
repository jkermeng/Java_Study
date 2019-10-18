package potion;
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
	private int prince;
	private int num;
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	
	public Goods(int id, String name, int prince, int num) {
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
	public int getPrince() {
		return prince;
	}
	public void setPrince(int prince) {
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
