package entity;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��16��
 * @Version 1.0.0
 */
public class Porter {
	private Goods[] set;//ȫ����Ʒ
	private Goods[] addGoods;//���ﳵ
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
