package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.IUserDao;
import entity.User;
import enums.Status;

public class UserDaoImpl implements IUserDao {

	List<User> userBox = new ArrayList<>();

	public UserDaoImpl() {
		// 初始用户
		userBox.add(new User("小何", 1, "123456", "女", "顾客"));
		userBox.add(new User("破网", 1, "123456", "女", "管理员"));
	}

	/**
	 * 增加用户
	 */
	@Override
	public void insertUser(User u) {
		userBox.add(u);
	}

	/**
	 * 查询所用用户
	 */

	@Override
	public List<User> selectUserAll() {

		return userBox;
	}

	/**
	 * id查询用户
	 */
	@Override
	public User selectUserById(int id) {
		List<User> userAll = selectUserAll();
		User u = null;
		for (User user : userAll) {
			if (user.getId() == id) {
				u = user;
				return u;
			}
		}
		return u;
	}

	/**
	 * 判断是否存在id
	 */
	@Override
	public boolean isExist(int id) {
		User Userid = selectUserById(id);
		if (Userid == null) {
			return false;
		}
		return true;
	}

}
