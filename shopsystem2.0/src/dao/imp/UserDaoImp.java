package dao.imp;

import java.util.ArrayList;
import java.util.List;

import cache.Goods_Store;
import entity.User;
import idao.Daos;

public class UserDaoImp implements Daos<User> {
	private static List<User> userDao;

	static{
		
	}
	public UserDaoImp() {
		userDao = Goods_Store.UserBox;
		userDao.add(new User(0, "莉莉", "123","管理员"));
		userDao.add(new User(1, "妮妮", "123","客户"));
		userDao.add(new User(2, "123", "123","客户"));
	}

	/**
	 * 管理员查询所以用户
	 */
	@Override
	public List<User> selectAll() {

		return userDao;
	}

	/**
	 * 管理员id查询所以用户
	 */
	@Override
	public List<User> selectById(int id) {
		for (User user : userDao) {
			if (user.getId() == id) {
				List<User> lu = new ArrayList<>();
				lu.add(user);
				return lu;
			}
		}

		return null;
	}

	/**
	 * 添加用户
	 */
	@Override
	public void insert(User tI) {

		userDao.add(tI);
	}

	/**
	 * 修改用户信息
	 */
	@Override
	public void update(User tU) {

	}

	/**
	 * 删除用户
	 */
	@Override
	public void deleteById(User u) {
		int index = 0;
		for (User user : userDao) {
			if (user.getId() == u.getId()) {
				userDao.remove(index);
			}
			index++;
		}
	}

	/**
	 * 是否存在用户
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
