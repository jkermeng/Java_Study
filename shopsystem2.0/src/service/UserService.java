package service;

import java.util.List;
import java.util.Scanner;

import dao.imp.UserDaoImp;
import enmus.RespondRuslt;
import enmus.Status;
import entity.User;
import idao.Daos;

public class UserService {
	private Daos userDao;

	public UserService() {
		userDao = new UserDaoImp();
	}

	public RespondRuslt addUser(User u) {
		userDao.insert(u);
		return new RespondRuslt(Status.SUSSECE);
	}

	public RespondRuslt Login(Scanner sc) {
		RespondRuslt rs = new RespondRuslt(Status.SUSSECE);
		RespondRuslt falt = new RespondRuslt(Status.FAIL);

		List<User> useBox = userDao.selectAll();
		System.out.println("«Î ‰»Î’À∫≈£∫ ");
		String uName = sc.next();
		System.out.println("«Î ‰»Î√‹¬Î£∫ ");
		String uPwd = sc.next();
		for (User user : useBox) {
			if (user.getName().equals(uName)) {
				if (user.getPwd().equals(uPwd)) {
					rs.setObj(user);
					return rs;
				}
				return falt;
			}
			 continue;
		}
		return falt;
	}

}
