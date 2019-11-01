package idao;

import java.util.List;

import enmus.RespondRuslt;
import entity.Goods;

public interface Daos<T> {
	//查询所用货物
	List<T> selectAll();
	//查询id下的货物
	List<T> selectById(int id);
	//增加货物
	void insert(T tI);
	//跟新货物
	void update(T tU);
	//删除货物
	void deleteById(T tD);
	//货物是否存在
	boolean isExist(int id);
	void clear();
}
