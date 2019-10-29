package entity;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月16日
 * @Version 1.0.0
 */
public class Porter {
	private Goods[] set;//全部商品
	private Goods[] addGoods;//购物车
	private int num[];

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public Goods[] getAddGoods() {
		return addGoods;
	}

	public void setAddGoods(Goods[] addGoods) {
		this.addGoods = addGoods;
	}

	public Goods[] getSet() {
		return set;
	}

	public void setSet(Goods[] set) {
		this.set = set;
	}

	public Porter(Goods[] goods) {
	
		addGoods = new Goods[0];
		num = new int[0];
		this.set = goods;
		
	}
	
public Porter(){}


	
}
