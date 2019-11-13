package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.imp.GoodsDaoIMP;
import dao.imp._ClassificationDaoIMP;
import onetomanyentity.Goods;
import onetomanyentity._Classification;

public class GoodService {
	private GoodsDaoIMP gdimp = new GoodsDaoIMP();
	private _ClassificationDaoIMP _cfdimp = new _ClassificationDaoIMP();

	public List<Goods> getGoodsData() throws SQLException {
		Set<Goods> goods = gdimp.select(null);
		List<Goods> glist = new ArrayList<>();
		for (Goods gs : goods) {
			_Classification cId = _cfdimp.selectById(gs.getSetClassfy().getCid());
			gs.setSetClassfy(cId);
			glist.add(gs);
		}
		glist.sort(new Comparator<Goods>() {

			@Override
			public int compare(Goods o1, Goods o2) {
				return o1.getGid() - o2.getGid();
			}
		});
		return glist;
	}

	public List<_Classification> getClassificationData() throws SQLException {
		List<_Classification> cflist = new ArrayList<>();
		Set<_Classification> selectall = _cfdimp.selectall();
		for (_Classification cfs : selectall) {
			Set<Goods> cfid = gdimp.selectByClassficationId(cfs.getCid());
			cfs.setSetgoods(cfid);
			cflist.add(cfs);
		}
		cflist.sort(new Comparator<_Classification>() {

			@Override
			public int compare(_Classification o1, _Classification o2) {
				// TODO Auto-generated method stub
				return o1.getCid() - o2.getCid();
			}
		});
		return cflist;

	}
}
