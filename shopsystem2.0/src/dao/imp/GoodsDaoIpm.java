package dao.imp;

import java.util.ArrayList;
import java.util.List;

import cache.Goods_Store;
import enmus.RespondRuslt;
import enmus.Status;
import entity.Goods;
import idao.Daos;

public class GoodsDaoIpm implements Daos<Goods> {
	private static List<Goods> goodsBox;

	static {
		// 初始化商品
		goodsBox = Goods_Store.GoodsBox;
		goodsBox.add(new Goods(1, "牙刷", 500, 12, ""));
		goodsBox.add(new Goods(2, "杯子", 999, 10, ""));
		goodsBox.add(new Goods(3, "毛巾", 30, 15, ""));
		goodsBox.add(new Goods(4, "铅笔", 100, 2, ""));
	}

	public GoodsDaoIpm() {
	}

	/**
	 * 查询所有商品
	 */
	@Override
	public List<Goods> selectAll() {
		return goodsBox;
	}

	/**
	 * 通过ID查询商品
	 */
	@Override
	public List<Goods> selectById(int id) {
		List<Goods> simpleBox = new ArrayList<>();
		for (Goods goods : goodsBox) {
			if (goods.getId() == id) {
				simpleBox.add(goods);
				return simpleBox;
			}
		}
		return null;

	}

	/**
	 * 添加商品
	 */
	@Override
	public void insert(Goods g) {
		goodsBox.add(g);

	}

	/**
	 * 修改商品
	 */
	@Override
	public void update(Goods g) {
		for (Goods goods : goodsBox) {
			if (goods.getId() == g.getId()) {
				goods.setName(g.getName());
				goods.setNum(g.getNum());
				goods.setPrice(g.getPrice());
				goods.setRemake(g.getRemake());
			}
		}
	}

	/**
	 * 以ID删除商品
	 * 
	 */
	@Override
	public void deleteById(Goods g) {
		for (int i = 0; i < goodsBox.size(); i++) {
			if (goodsBox.get(i).getId() == g.getId()) {
				goodsBox.remove(i);
				break;
			}
		}

	}

	/**
	 * 判断商品是否存在
	 */
	@Override
	public boolean isExist(int id) {
		if (selectById(id) != null) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}
