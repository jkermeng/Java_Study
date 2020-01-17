package service.imp;

import java.util.HashSet;
import java.util.Set;

import dao.imp.DepartmentDaoIMP;
import dao.imp.JobDaoIMP;
import dao.imp.RoleDaoIMP;
import entity.Department;
import entity.Employee;
import entity.FirstPower;
import entity.GetPower;
import entity.Job;
import entity.Role;
import enums.Enums;
import enums.Responese;
import service.IService;

public class RoleServiceImp implements IService<Role> {
	private RoleDaoIMP rdimp = new RoleDaoIMP();
	private JobDaoIMP jdimp = new JobDaoIMP();
	private DepartmentDaoIMP ddimp = new DepartmentDaoIMP();

	@Override
	public Set<Role> SeleteAll(Role e) {
		if (e == null) {
			return rdimp.Selete();
		}
		return null;
	}

	@Override
	public Set<Role> SeleteByFK(int pid) {
		Set<Role> setr = new HashSet<>();
		for (Role r : SeleteAll(null)) {
			if (r.getRid() == pid) {
				setr.add(r);
			}
		}
		return setr;
	}

	@Override
	public Responese update(Role e, int pid) {

		return null;
	}

	@Override
	public Responese insert(Role e) {
		rdimp.Insert(e);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese delete(Role t) {
		rdimp.Delete(t);
		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Responese update(Role e, int pid, int fkid) {

		rdimp.Update(e, pid, fkid);

		return new Responese(Enums.SUCCESS);
	}

	@Override
	public Set<Role> SeleteByFK(int pid, int fkid) {
		Set<Role> setr = new HashSet<>();
		for (Role r : SeleteAll(null)) {
			if (r.getRid() == pid && r.getJid().getJid() == fkid) {
				setr.add(r);
			}
		}
		return setr;
	}

	@Override
	public Set<Role> SeleteAllDetailed() {
		Set<Role> serrole = new HashSet<>();
		Set<Role> role = rdimp.Selete();

		for (Role role2 : role) {
			Integer jid = role2.getJid().getJid();
			Job seleteById = jdimp.SeleteById(jid);
			Department seleteById2 = ddimp.SeleteById(seleteById.getDid().getDid());
			seleteById.setDid(seleteById2);
			role2.setJid(seleteById);
			serrole.add(role2);
		}
		return serrole;

	}

	@Override
	public Responese getUserPower(Employee e) {
		Responese responese = new Responese(Enums.SUCCESS);
		Set<GetPower> seleteByUserenumber = rdimp.SeleteByUserenumber(e);
		responese.setObj(seleteByUserenumber);
		return responese;
	}

	@Override
	public boolean Login(String num, String pwd) {
		return false;
	}

	public Responese showAllUserPower() {
		Responese responese = new Responese(Enums.SUCCESS);
		Set<Role> selectPower = rdimp.SelectPower();
		for (Role role2 : selectPower) {
			Integer jid = role2.getJid().getJid();
			Job seleteById = jdimp.SeleteById(jid);
			Department seleteById2 = ddimp.SeleteById(seleteById.getDid().getDid());
			seleteById.setDid(seleteById2);
			role2.setJid(seleteById);
			responese.setObj(selectPower);
		}

		return responese;
	}

	public Responese changePower(int fpid, int rid) {
		Responese responese = new Responese(Enums.SUCCESS);
		rdimp.changePower(fpid, rid);
		return responese;
	}

	public Responese insertPower(FirstPower f, int rid) {
		Responese responese = new Responese(Enums.SUCCESS);
		rdimp.insertPower(f, rid);
		return responese;
	}

	public Responese deletePower(int fpid, int rid) {
		Responese responese = new Responese(Enums.SUCCESS);
		rdimp.deletePower(fpid, rid);
		return responese;

	}

	public static void main(String[] args) {
		Set<Role> seleteAllDetailed = new RoleServiceImp().SeleteAllDetailed();
		for (Role role : seleteAllDetailed) {
			System.out.println(role);
		}

	}
}
