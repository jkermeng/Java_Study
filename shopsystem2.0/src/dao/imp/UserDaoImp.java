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
		userDao.add(new User(0, "����", "123","����Ա"));
		userDao.add(new User(1, "����", "123","�ͻ�"));
		userDao.add(new User(2, "123", "123","�ͻ�"));
	}

	/**
	 * ����Ա��ѯ�����û�
	 */
	@Override
	public List<User> selectAll() {

		return userDao;
	}

	/**
	 * ����Աid��ѯ�����û�
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
	 * ����û�
	 */
	@Override
	public void insert(User tI) {

		userDao.add(tI);
	}

	/**
	 * �޸��û���Ϣ
	 */
	@Override
	public void update(User tU) {

	}

	/**
	 * ɾ���û�
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
	 * �Ƿ�����û�
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
