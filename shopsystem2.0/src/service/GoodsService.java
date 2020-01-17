package service;

import java.util.List;

import dao.imp.GoodsDaoIpm;
import enmus.RespondRuslt;
import enmus.Status;
import entity.Goods;
import idao.Daos;

public class GoodsService {
	private Daos<Goods> goodsDao;

	public GoodsService() {
		// 数据层goodsDao
		goodsDao = new GoodsDaoIpm();
	}

	/**
	 * 添加商品
	 * 
	 * @param g
	 *            一个商品对象
	 * @return 判断是否成功RespondRuslt
	 */
	public RespondRuslt addGoods(Goods g) {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		// 缺少商品是否重复的判断
		if (goodsDao.isExist(g.getId())) {
			RespondRuslt respondRuslt = new RespondRuslt(Status.FAIL);
			respondRuslt.setMsg("ID冲突");
			return respondRuslt;
		} else {
			goodsDao.insert(g);
			return rs;
		}

	}

	/**
	 * 查看所有商品
	 * 
	 * @return 所有商品列表List<Goods>
	 */

	public RespondRuslt selectGoods(Goods g) {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		if (g == null) {
			rs.setObj(goodsDao.selectAll());
			return rs;
		} else if (goodsDao.isExist(g.getId())) {
			rs.setObj(goodsDao.selectById(g.getId()));
			return rs;
		} else {
			return new RespondRuslt(Status.NULL);
		}
	}

	/**
	 * 添加商品、跟新商品
	 * 
	 * @param g
	 *            货物
	 * @return 结果值
	 */
	public RespondRuslt addOrUpdateGoods(Goods g) {
		if (goodsDao.isExist(g.getId())) {
			goodsDao.update(g);
			return new RespondRuslt(Status.SUSSECE);
		} else {
			// goodsDao.insert(g);
			return new RespondRuslt(Status.FAIL);
		}
		// return new RespondRuslt(Status.FAIL);

	}
/**
 * 删除货物通过id
 * @param g
 * @return
 */
	public RespondRuslt deleteGoods(Goods g) {
		if (goodsDao.isExist(g.getId())) {
			goodsDao.deleteById(g);
			return new RespondRuslt(Status.SUSSECE);
		} else {
			return new RespondRuslt(Status.FAIL);
		}

	}

}
