package service;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import dao.imp.EmployeeDaoIMP;
import entity.Employee;
import enums.Enums;
import enums.Responese;

public class EmployeeService {
	EmployeeDaoIMP edimp = new EmployeeDaoIMP();

	public static void main(String[] args) {
		Set<Employee> seleteAll = new EmployeeService().SeleteByFK(1, 1);
		for (Employee employee : seleteAll) {
			System.out.println(employee);
		}
	}

	public Set<Employee> SeleteAll(Employee e) {
		if (e == null) {
			return edimp.Selete();
		}
		return null;
	}

	public Set<Employee> SeleteByFK(int fkid, int pid) {
		Set<Employee> sete = new HashSet<>();
		Set<Employee> seleteAll = SeleteAll(null);
		for (Employee employee : seleteAll) {
			if (employee.getEid() == pid && employee.getDid().getDid() == fkid) {
				sete.add(employee);
			}
		}
		return sete;
	}

	public Responese update(Employee e, int pid, int fkid) {
		edimp.Update(e, pid, fkid);
		return new Responese(Enums.SUCCESS);
	}

	public Responese insert(Employee e) {
		edimp.Insert(e);
		return new Responese(Enums.SUCCESS);
	}

	public Responese delete(Employee t) {
		edimp.Delete(t);
		return new Responese(Enums.SUCCESS);
	}
}
