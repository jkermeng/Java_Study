package dao.impl;

import java.util.List;

import cache.Goods_Store;
import dao.IGoodsDao;
import entity.Goods;

public class GoodsDaoImpl implements IGoodsDao {

	private List<Goods> goodsBox;

	public GoodsDaoImpl() {
		goodsBox = Goods_Store.goodsBox;
		goodsBox.add(new Goods(1, "商品1", 5.6, 500, ""));
		goodsBox.add(new Goods(2, "商品2", 5, 200, ""));
		goodsBox.add(new Goods(3, "商品3", 9, 99, ""));
	}

	/**
	 * 添加商品
	 */
	@Override
	public void insertGoods(Goods g) {
		goodsBox.add(g);

	}

	/**
	 * 修改商品（待开发）
	 */
	@Override
	public void updateGoods(Goods newGoods) {
		
//		goodsBox.
	}

	/**
	 * 删除商品
	 */
	@Override
	public void deleteGoodsById(int goodId) {
		goodsBox.remove(goodId);

	}

	/**
	 * 根据ID查询单个商品
	 */
	@Override
	public Goods selectGoodsById(int goodsId) {
		List<Goods> gs = selectGoodsAll();
		Goods goods = null;
		for (Goods g : gs) {
			if (g.getgId() == goodsId) {
				goods = g;
				break;
			}
		}
		return goods;
	}

	/**
	 * 查询所有商品
	 */
	@Override
	public List<Goods> selectGoodsAll() {
		return goodsBox;
	}

	/**
	 * 判断商品是否存在
	 * true代表存在
	 */
	@Override
	public boolean isExist(int goodId) {
		Goods goods = selectGoodsById(goodId);
		if(goods == null){
			return false;
		}
		return true;
	}

}
