package service.imp;

import java.util.HashSet;
import java.util.Set;

import dao.imp.DepartmentDaoIMP;
import dao.imp.JobDaoIMP;
import entity.Department;
import entity.Employee;
import entity.Job;
import enums.Enums;
import enums.Responese;
import service.IService;

public class JobServiceImp implements IService<Job> {
	private JobDaoIMP jdimp = new JobDaoIMP();
	private DepartmentDaoIMP dpdimp = new DepartmentDaoIMP();

	@Override
	public Set<Job> SeleteAllDetailed() {
		Set<Job> jobs = new HashSet<>();
		Set<Job> job = jdimp.Selete();
		for (Job job2 : job) {
			Integer did = job2.getDid().getDid();
			Department seleteById = dpdimp.SeleteById(did);
			job2.setDid(seleteById);
			jobs.add(job2);
		}
		return jobs;
	}

	@Override
	public Set<Job> SeleteAll(Job e) {
		Set<Job> selete = null;
		if (e == null) {
			selete = jdimp.Selete();
		} else {
			return null;
		}
		return selete;
	}

	@Override
	public Set<Job> SeleteByFK(int pid) {
		Set<Job> seleteById = new HashSet<>();
		Job seleteById2 = jdimp.SeleteById(pid);
		seleteById.add(seleteById2);
		return seleteById;
	}

	@Override
	public Responese update(Job e, int pid) {
		jdimp.Update(e, pid);

		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese insert(Job e) {
		jdimp.Insert(e);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese delete(Job t) {
		jdimp.Delete(t);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese getUserPower(Employee e) {

		return null;
	}

	@Override
	public Responese update(Job e, int pid, int fkid) {
		jdimp.Update(e, pid, fkid);

		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Set<Job> SeleteByFK(int pid, int fkid) {
		Set<Job> seleteByFK = jdimp.SeleteByFK(fkid, pid);
		return seleteByFK;
	}

	@Override
	public boolean Login(String num, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

}
