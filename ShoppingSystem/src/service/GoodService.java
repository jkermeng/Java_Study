package service;

import java.util.List;

import dao.IGoodsDao;
import dao.impl.GoodsDaoImpl;
import entity.Goods;
import enums.ResponResult;
import enums.Status;

public class GoodService {
	private IGoodsDao goodsDao = new GoodsDaoImpl();

	/**
	 * 添加商品
	 */
	public ResponResult addGoods(Goods g) {
		ResponResult res = new ResponResult(Status.SUCCESS);
		
    	if(g == null) {
    		//throw new NullPointerException("异常发生在GoodService的addGoods方法");
    		res = new ResponResult(Status.NULL);
    	}
    	
    	goodsDao.insertGoods(g);
    	
    	return res;
    }
	
	/**
	 *查看商品
	 */
	public ResponResult showGoods(Integer id) {
		ResponResult res = new ResponResult(Status.SUCCESS);
		Goods good = null;
    	if(id == null) {
    		List<Goods> goodsList = goodsDao.selectGoodsAll();
    		res.setObj(goodsList);
    	}else {
    		good = goodsDao.selectGoodsById(id);
    		res.setObj(good);
    	}
    	
    	return res;
    }
	/**
	 * 修改商品
	 */
	public void updateGoods(Goods newGoods){
		ResponResult res = new ResponResult(Status.SUCCESS);
		goodsDao.updateGoods(newGoods);
//		id判断已存在的商品
	}
	/**
	 * 凭借ID删除商品
	 */
	public ResponResult daleteGoodsById(int id){
		ResponResult res = new ResponResult(Status.SUCCESS);
		goodsDao.deleteGoodsById(id);
		return res;
	}
}
