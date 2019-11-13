package service;

import java.sql.SQLException;
import java.util.Set;

import dao.imp.UsersDaoIMP;
import enums.Enums;
import enums.Responese;
import onetooneentity.Users;

public class UserService {
	private UsersDaoIMP udimp = new UsersDaoIMP();

	public Set<Users> getAllUser() throws SQLException {
		return udimp.selectAllUsers();
	}

	public Responese getUserByPhone(Users phone) throws SQLException {
		Set<Users> selectAllUsers = udimp.selectAllUsers();
		Responese rs = new Responese(Enums.SUCCESS);
		for (Users users : selectAllUsers) {
			if (users.getUphone().equals(phone.getUphone())) {
				rs.setObj(users);
				return rs;
			}
		}
		return new Responese(Enums.NULL);
	}

	public Integer getpower(Users u) throws SQLException {
		Set<Users> selectAllUsers = udimp.selectAllUsers();
		for (Users users : selectAllUsers) {
			if (users.getUname().equals(u.getUphone())) {
				return 0;
			} else {
				return 1;
			}
		}

		return null;

	}

}
