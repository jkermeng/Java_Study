package service;

import java.util.List;

import dao.impl.UserDaoImpl;
import entity.User;
import enums.ResponResult;
import enums.Status;

public class UserService {
	private UserDaoImpl userdao = new UserDaoImpl();
	
	public ResponResult addUser(User u) {
		ResponResult res = new ResponResult(Status.SUCCESS);
		if (u == null) {
			return new ResponResult(Status.NULL);
		}
		userdao.insertUser(u);
		return res;
	}
	public ResponResult showUser(User u){
		ResponResult res = new ResponResult(Status.SUCCESS);
		if(u == null){
			res.setObj(userdao.selectUserAll());
		}
		else{
			res.setObj(userdao.selectUserById(u.getId()));
		}
		return res;
	}

}
