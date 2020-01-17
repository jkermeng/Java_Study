package service;

import dao.imp.TDaoIpm;
import entity.Goods;
import idao.Daos;
import idao.TDaos;

public class TService<T extends TDaos<?>> {
	private static  TDaoIpm<Goods> TDaoIpm = new TDaoIpm<Goods>();

	public void insert() {
		TDaoIpm.insert(new Goods());
	}

}
