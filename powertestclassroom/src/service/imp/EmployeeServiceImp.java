package service.imp;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import dao.imp.DepartmentDaoIMP;
import dao.imp.EmployeeDaoIMP;
import entity.Department;
import entity.Employee;
import enums.Enums;
import enums.Responese;
import service.IService;

public class EmployeeServiceImp implements IService<Employee> {
	private EmployeeDaoIMP edimp = new EmployeeDaoIMP();
	private DepartmentDaoIMP daoIMP = new DepartmentDaoIMP();

	public static void main(String[] args) {
		Set<Employee> seleteAllDetailed = new EmployeeServiceImp().SeleteAllDetailed();
		for (Employee employee : seleteAllDetailed) {

			System.out.println(employee);
		}

	}

	@Override
	public Set<Employee> SeleteAll(Employee e) {
		if (e == null) {
			return edimp.Selete();
		}
		return null;
	}

	@Override
	public Set<Employee> SeleteByFK(int pid, int fkid) {
		Set<Employee> sete = new HashSet<>();
		Set<Employee> seleteAll = SeleteAll(null);
		for (Employee employee : seleteAll) {
			if (employee.getEid() == pid && employee.getDid().getDid() == fkid) {
				sete.add(employee);
			}
		}
		return sete;
	}

	@Override
	public Responese getUserPower(Employee e) {
		Responese responese = new Responese(Enums.SUCCESS);
		return responese;

	}

	@Override
	public Responese update(Employee e, int pid, int fkid) {
		edimp.Update(e, pid, fkid);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese insert(Employee e) {
		edimp.Insert(e);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese delete(Employee t) {
		edimp.Delete(t);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Set<Employee> SeleteByFK(int pid) {
		Set<Employee> se = new HashSet<>();
		Employee seleteById = edimp.SeleteById(pid);
		Department seleteById2 = daoIMP.SeleteById(seleteById.getDid().getDid());
		seleteById.setDid(seleteById2);
		se.add(seleteById);
		return se;
	}

	@Override
	public Responese update(Employee e, int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Employee> SeleteAllDetailed() {
		Set<Employee> se = new HashSet<>();
		Set<Employee> selete = edimp.Selete();
		for (Employee employee : selete) {
			employee.setDid(daoIMP.SeleteById(employee.getDid().getDid()));
			se.add(employee);
		}
		return se;
	}

	@Override
	public boolean Login(String num, String pwd) {
		Employee login = edimp.login(num, pwd);
		if (login.getEid() != null) {
			return true;
		} else {
			return false;

		}
	}
}
