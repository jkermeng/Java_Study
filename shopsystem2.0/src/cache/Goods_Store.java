package cache;

import java.util.ArrayList;
import java.util.List;

import entity.Goods;
import entity.ShoppingCart;
import entity.User;

public final class Goods_Store {
//	未来添加数据库
public static List<Goods> GoodsBox = new ArrayList<>();
//购物车
public static List<ShoppingCart> CartBox = new ArrayList<>();
//用户
public static List<User> UserBox = new ArrayList<>();
//方法测试
public static List<?> GBox = new ArrayList<>();
public static List<?> SBox = new ArrayList<>();
public static List<?> UBox = new ArrayList<>();
private Goods_Store() {
	// TODO Auto-generated constructor stub
}
}
