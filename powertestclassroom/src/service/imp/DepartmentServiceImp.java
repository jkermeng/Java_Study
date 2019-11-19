package service.imp;

import java.util.HashSet;
import java.util.Set;

import dao.imp.DepartmentDaoIMP;
import entity.Department;
import entity.Employee;
import enums.Enums;
import enums.Responese;
import service.IService;

public class DepartmentServiceImp implements IService<Department> {
	DepartmentDaoIMP ddimp = new DepartmentDaoIMP();

	@Override
	public Set<Department> SeleteAll(Department e) {
		if (e == null) {
			return ddimp.Selete();
		}
		return null;
	}

	@Override
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

	@Override
	public Responese update(Department e, int pid) {
		ddimp.Update(e, pid);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese insert(Department e) {
		ddimp.Insert(e);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese delete(Department t) {
		ddimp.Delete(t);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese update(Department e, int pid, int fkid) {
		return null;
	}

	@Override
	public Set<Department> SeleteByFK(int pid, int fkid) {
		return null;
	}

	@Override
	public Set<Department> SeleteAllDetailed() {

		return null;
	}

	@Override
	public Responese getUserPower(Employee e) {
		return null;
	}

	@Override
	public boolean Login(String num, String pwd) {
		return false;
	}
}
