package view;

import java.util.List;
import java.util.Scanner;

import entity.Goods;
import enums.ResponResult;
import service.GoodService;

public class Test {

	public static void main(String[] args) {
		GoodService gs = new GoodService();
		Scanner sc = new Scanner(System.in);
		// ResponResult sg = gs.showGoods(null);
		// List<Goods> obj = (List<Goods>) sg.getObj();
		//
		/*
		 * for(Goods g : obj) { System.out.println(g.getgId()+g.getgName()); }
		 */
		// Goods goods = new Goods();
		// goods.setgId(3);
		// ResponResult showGoods = gs.showGoods(goods);
		// Goods obj2 = (Goods) showGoods.getObj();
		// System.out.println(showGoods.getStatus());
		// System.out.println(obj2.getgName()+obj2.getgNum());
		// gs.addGoods(new Goods(1, "商品1", 5.6, 500, ""));
		Goods g = new Goods(4, "商品4", 5.6, 500, "");
		gs.addGoods(g);
		ResponResult showGoods = gs.showGoods(null);
		showGoodsAll(showGoods);//查询所有商品
		ResponResult showGoodsById = gs.showGoods(1);
		showGoodsById(showGoodsById);//根据iD查询商品
		System.out.println("输入删除id");
		int id = sc.nextInt();
		ResponResult daleteGoodsById = gs.daleteGoodsById(id);
		System.out.println(daleteGoodsById.getStatus());
		showGoodsAll(showGoods);//查询所有商品

		
	}
	private static void showGoodsAll(ResponResult obj) {
		List<Goods> goodslist = (List<Goods>) obj.getObj();
		System.out.println("商品ID\t" + "商品名称\t" + "商品单价\t" + "商品库存\t" + "\n");
		for (Goods goods : goodslist) {
			System.out.print(goods.getgId() + "\t" + goods.getgName() + "\t" + goods.getgPrice() + "\t"
					+ goods.getgNum() + "\n");
		}
	}
	private static void showGoodsById(ResponResult showGoodsById) {
		Goods goods = (Goods) showGoodsById.getObj();
		System.out.println("商品ID\t" + "商品名称\t" + "商品单价\t" + "商品库存\t" + "\n");

		System.out.print(
				goods.getgId() + "\t" + goods.getgName() + "\t" + goods.getgPrice() + "\t" + goods.getgNum() + "\n");

	}
}
