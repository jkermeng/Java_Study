package view;

import dao.imp.TDaoIpm;
import entity.Goods;
import entity.ShoppingCart;
import entity.User;
import service.TService;

public class Test {

	public static void main(String[] args) {

		TService<TDaoIpm<Goods>> ts = new TService();
		TService<TDaoIpm<ShoppingCart>> ss = new TService();
		TService<TDaoIpm<User>> us = new TService();

		ts.insert();
	}

}
