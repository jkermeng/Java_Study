package service;

import java.util.HashSet;
import java.util.Set;

import dao.imp.DepartmentDaoIMP;
import entity.Department;
import entity.Employee;
import enums.Enums;
import enums.Responese;

public class DepartmentService {
	DepartmentDaoIMP ddimp = new DepartmentDaoIMP();

	public Set<Department> SeleteAll(Department e) {
		if (e == null) {
			return ddimp.Selete();
		}
		return null;
	}

	public Set<Department> SeleteByFK(int pid) {
		Set<Department> sete = new HashSet<>();
		Set<Department> seleteAll = SeleteAll(null);
		for (Department d : seleteAll) {
			if (d.getDid() == pid) {
				sete.add(d);
			}
		}
		return sete;
	}

	public Responese update(Department e, int pid) {
		ddimp.Update(e, pid);
		return new Responese(Enums.SUCCESS);
	}

	public Responese insert(Department e) {
		ddimp.Insert(e);
		return new Responese(Enums.SUCCESS);
	}

	public Responese delete(Department t) {
		ddimp.Delete(t);
		return new Responese(Enums.SUCCESS);
	}
}
