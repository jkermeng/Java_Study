package dao;

import java.util.List;

import entity.Goods;

public interface IGoodsDao {
	void insertGoods(Goods g);
	Goods selectGoodsById(int goodId);
	List<Goods> selectGoodsAll();
    void updateGoods(Goods newGoods);
    void deleteGoodsById(int goodId);
    boolean isExist(int goodId);
}
