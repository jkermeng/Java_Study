package dao;

import entity.Goods;
import entity.Porter;

public class AddPorter {
	private Porter trolley;
	public Porter getTrolley() {
		return trolley;
	}
	public void setTrolley(Porter trolley) {
		this.trolley = trolley;
	}

	public AddPorter(AddGoods addGoods) {
		this.trolley = new Porter(addGoods.getSet());// 总货物

	}

	/**
	 * 添加商品进购物车
	 * @param id 选择的商品id
	 * @return 购物车的商品
	 */
	public Goods[] addBukey(int[] id, Goods[] addGoods) {

		int i = 1;
		int k = 0;
		int j = 0;
		int g = addGoods.length;

		if (g != id.length) {
			for (k = 0; k < trolley.getSet().length;) {
				Goods goods = trolley.getSet()[k];// 重新拿商品对比
				if (goods.getId() == id[j]) {
					// 临时的货物空间
					Goods temprory[] = new Goods[addGoods.length + 1];
					int int_temprory[] = new int[trolley.getNum().length + 1];
					// 临时货物空间添加对应数据
					temprory[temprory.length - 1] = trolley.getSet()[k];
					// 购买的货物的值
					int_temprory[int_temprory.length - 1] = id[i];
					i += 2;
					// 重新寻找货物id
					k = 0;
					// 拿到id值
					if (addGoods.length > 0) {
						for (int o = 0; o < addGoods.length; o++) {
							temprory[o] = addGoods[o];
							int_temprory[o] = trolley.getNum()[o];
						}
					}
					addGoods = temprory;
					this.trolley.setAddGoods(temprory);
					trolley.setNum(int_temprory);
					j += 2;
					if (j == id.length) {
						break;
					}

				} else {
					k++;
				}
			}
			g--;
		}
		return addGoods;

	}

	public String[] lookUpPorter() {
		String g[] = new String [trolley.getAddGoods().length];
		if(g.length>0){
			for (int i = 0; i < trolley.getAddGoods().length; i++) {
				Goods goods = trolley.getAddGoods()[i];
				g[i] = "\t" + goods.getId() + "\t" + goods.getName() + "\t" + trolley.getNum()[i] + "\t" + goods.getNum();
			}
		}else{
			String g1[] ={"你没有任何商品"};
			return g1;
		}
		

		return g;
	}

	/**
	 * 计算商品总价
	 * 
	 * @return 购物金额
	 */
	public int sumGoods() {
		int sum = 0;
		System.out.println("已购买 -> 商品ID\t商品名称\t商品数量\t商品价格\t\n");
		for (int i = 0; i < trolley.getAddGoods().length; i++) {
			Goods goods = trolley.getAddGoods()[i];

			sum += (trolley.getNum()[i] * goods.getPrince());
			System.out.println(
					"\t" + goods.getId() + "\t" + goods.getName() + "\t" + trolley.getNum()[i] + "\t" + goods.getPrince());

		}
		return sum;
	}

	public void cleanPorter() {
		Goods z[] = new Goods[1];
		z[0] = new Goods(0, "null", 0, 0);
		int zero[] = { 0 };
		// addGoods =z;
		trolley.setNum(zero);
	}

}
