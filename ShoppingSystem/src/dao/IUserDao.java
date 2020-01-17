package dao;

import java.util.List;

import entity.User;

public interface IUserDao {

	void insertUser(User u);
	List<User> selectUserAll();
	User selectUserById(int id);
	boolean isExist(int id);
}
