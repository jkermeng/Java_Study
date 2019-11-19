package view;

import java.util.Scanner;
import java.util.Set;

import entity.Department;
import entity.Employee;
import entity.GetPower;
import entity.Job;
import entity.Role;
import enums.Responese;
import jdbcUtil.MySqlConnection;
import service.imp.DepartmentServiceImp;
import service.imp.EmployeeServiceImp;
import service.imp.JobServiceImp;
import service.imp.RoleServiceImp;

public class Test {
	public static void main(String[] args) {
		DepartmentServiceImp dsimp = new DepartmentServiceImp();
		RoleServiceImp rsimp = new RoleServiceImp();
		JobServiceImp jsimp = new JobServiceImp();
		EmployeeServiceImp esimp = new EmployeeServiceImp();
		Scanner sc = new Scanner(System.in);
		int l = 3;
		System.out.println("欢迎登陆XXX员工管理系统");
		do {
			System.out.println("输入账号:");
			String num = sc.next();
			System.out.println("亲输入密码");
			String pwd = sc.next();
			if (esimp.Login(num, pwd)) {
				// 获取人员权限
				Employee e1 = new Employee();
				e1.setEnumber(num);
				e1.setEpassword(pwd);
				Responese userPower = rsimp.getUserPower(e1);
				getPower(userPower);
				do {
					System.out.println("1、employee管理\n2、job管理\n3、department管理\n4、role管理\n5、查看用戶權限\n0、离开管理 ");
					int nums = sc.nextInt();
					if (nums == 1) {
						do {
							System.out.println("1、查看employee 2、修改employee 3、删除employee 4、添加employee 5、退出");
							System.out.println("请输入选项 ：");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Employee> seleteAll = esimp.SeleteAllDetailed();
									showEmployee(seleteAll);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else {
								// 普通员工查看
							}

							if (choice == 2) {
								String ct = null;
								do {
									System.out.println("修改id为：");
									int eid = sc.nextInt();
									System.out.println("修改name为：");

									String ename = sc.next();
									System.out.println("修改number为：");

									String enumber = sc.next();
									System.out.println("修改password为：");

									String epassword = sc.next();
									System.out.println("修改egender为：");

									String egender = sc.next();
									System.out.println("修改phone为：");

									String ephone = sc.next();
									System.out.println("修改eemail为：");

									String eemail = sc.next();
									System.out.println("修改estattus为：");

									String estattus = sc.next();
									System.out.println("修改did为：");

									int did = sc.nextInt();
									Employee e = new Employee(eid, ename, enumber, epassword, egender, ephone, eemail,
											estattus);
									e.setDid(new Department(did));
									System.out.println("需要修改的id：");
									int pid = sc.nextInt();
									System.out.println("需要修改的部门id：");
									int fkid = sc.nextInt();
									esimp.update(e, pid, fkid);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("删除的id为：");
									int eid = sc.nextInt();
									System.out.println("需要删除的部门id：");
									int did = sc.nextInt();
									Employee employee = new Employee();
									employee.setEid(eid);
									employee.setDid(new Department(did));
									esimp.delete(employee);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("添加的id为：");
									int eid = sc.nextInt();
									System.out.println("添加的name为：");

									String ename = sc.next();
									System.out.println("添加的number为：");

									String enumber = sc.next();
									System.out.println("添加的password为：");

									String epassword = sc.next();
									System.out.println("添加的egender为：");

									String egender = sc.next();
									System.out.println("添加的phone为：");

									String ephone = sc.next();
									System.out.println("添加的eemail为：");

									String eemail = sc.next();
									System.out.println("添加的estattus为：");

									String estattus = sc.next();
									System.out.println("添加的did为：");
									int did = sc.nextInt();
									Employee e = new Employee(eid, ename, enumber, epassword, egender, ephone, eemail,
											estattus);
									e.setDid(new Department(did));
									esimp.insert(e);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 5) {
								break;
							}
						} while (true);
					} else if (nums == 2) {
						// 对应的管理
						do {
							System.out.println("1、查看job 2、修改job 3、删除job 4、添加job 5、退出");
							System.out.println("请输入选项 ：");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Job> seleteAllDetailed = jsimp.SeleteAllDetailed();
									showJob(seleteAllDetailed);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 2) {
								String ct = null;
								do {
									System.out.println("修改职位id");
									int jid = sc.nextInt();
									System.out.println("修改职位名称");
									String jname = sc.next();
									System.out.println("修改职位说明");
									String jexplain = sc.next();
									System.out.println("修改职位编号");
									String jnumber = sc.next();
									System.out.println("修改部门id");
									int department_did = sc.nextInt();
									Job job = new Job(jid, jname, jnumber, jexplain);
									job.setDid(new Department(department_did));
									System.out.println("需要修改的id：");
									int pid = sc.nextInt();
									System.out.println("需要修改的部门id：");
									int fkid = sc.nextInt();
									jsimp.update(job, pid, fkid);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("需要删除的id：");
									int jid = sc.nextInt();
									System.out.println("需要删除的部门id：");
									int did = sc.nextInt();
									Job e = new Job(jid);
									e.setDid(new Department(did));
									jsimp.delete(e);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("修改职位id");
									int jid = sc.nextInt();
									System.out.println("修改职位名称");
									String jname = sc.next();
									System.out.println("修改职位说明");
									String jexplain = sc.next();
									System.out.println("修改职位编号");
									String jnumber = sc.next();
									System.out.println("修改部门id");
									int did = sc.nextInt();
									Job job = new Job(jid, jname, jnumber, jexplain);
									job.setDid(new Department(did));
									jsimp.insert(job);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 5) {
								break;
							}
						} while (true);
					} else if (nums == 3) {
						do {
							System.out.println("1、查看department 2、修改department 3、删除department 4、添加department 5、退出");
							System.out.println("请输入选项 ：");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Department> seleteAll = dsimp.SeleteAll(null);
									showDepartment(seleteAll);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 2) {
								String ct = null;
								do {
									System.out.println("休要需要修改的did");
									int pid = sc.nextInt();
									System.out.println("修改did:");
									int did = sc.nextInt();
									System.out.println("修改dname:");
									String dname = sc.next();
									System.out.println("修改dnumber:");
									int dnumber = sc.nextInt();
									System.out.println("修改dcreatedatetime:");
									String dcreatdatetime = sc.next();
									System.out.println("修改dbrief:");
									String dbrief = sc.next();
									System.out.println("修改dremarks:");
									String dremarks = sc.next();
									Department e = new Department(did, dname, dnumber, dcreatdatetime, dbrief,
											dremarks);
									dsimp.update(e, pid);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("删除的did为：");
									int did = sc.nextInt();
									dsimp.delete(new Department(did));
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("添加did:");
									int did = sc.nextInt();
									System.out.println("添加dname:");
									String dname = sc.next();
									System.out.println("添加dnumber:");
									int dnumber = sc.nextInt();
									System.out.println("添加dcreatedatetime:");
									String dcreatdatetime = sc.next();
									System.out.println("添加dbrief:");
									String dbrief = sc.next();
									System.out.println("添加dremarks:");
									String dremarks = sc.next();
									dsimp.insert(new Department(did, dname, dnumber, dcreatdatetime, dbrief, dremarks));
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 5) {
								break;
							}
						} while (true);
					} else if (nums == 4) {
						do {
							System.out.println("1、查看role 2、修改role 3、删除role 4、添加role 5、退出");
							System.out.println("请输入选项 ：");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Role> seleteAllDetailed = rsimp.SeleteAllDetailed();
									shoRole(seleteAllDetailed);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 2) {
								String ct = null;
								do {
									System.out.println("需要修改的Rid: ");
									int pid = sc.nextInt();
									System.out.println("需要修改的jid: ");
									int fkid = sc.nextInt();
									System.out.println("修改rid: ");
									int rid = sc.nextInt();
									System.out.println("修改rname: ");
									String rname = sc.next();
									System.out.println("修改rexplain: ");
									String rexplain = sc.next();
									System.out.println("修改jid: ");
									int jid = sc.nextInt();
									rsimp.update(new Role(rid, rname, rexplain, new Job(jid)), pid, fkid);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("删除rid：");
									int rid = sc.nextInt();
									System.out.println("删除的jid");
									int jid = sc.nextInt();
									Role role = new Role();
									role.setJid(new Job(jid));
									role.setRid(rid);
									rsimp.delete(role);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("需要修改的Rid: ");
									int pid = sc.nextInt();
									System.out.println("需要修改的jid: ");
									int fkid = sc.nextInt();
									System.out.println("修改rid: ");
									int rid = sc.nextInt();
									System.out.println("修改rname: ");
									String rname = sc.next();
									System.out.println("修改rexplain: ");
									String rexplain = sc.next();
									System.out.println("修改jid: ");
									int jid = sc.nextInt();
									Role e = new Role(rid, rname, rexplain, new Job(jid));
									rsimp.insert(e);
									System.out.println("是否继续y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 5) {
								break;
							}
						} while (true);
					} else if (nums == 5) {

					} else if (nums == 0) {
						System.exit(0);
					}

				} while (true);

			} else {
				l--;
				System.out.println("账号密码错误剩余" + (l) + "次机会");

				if (l == 0) {
					break;
				}
			}
		} while (true);
		sc.close();
		MySqlConnection.closeAll();

	}

	private static void shoRole(Set<Role> se) {
		for (Role role : se) {
			System.out.println(role);
		}
	}

	private static void showDepartment(Set<Department> se) {
		for (Department department : se) {

			System.out.println(department);
		}
	}

	private static void showJob(Set<Job> se) {
		for (Job job : se) {

			System.out.println(job);
		}
	}

	private static void showEmployee(Set<Employee> se) {
		for (Employee employee : se) {
			System.out.println(employee);
		}
	}

	private static String getPower(Responese rs) {
		Set<GetPower> GetPower = (Set<GetPower>) rs.getObj();
		for (GetPower getPower2 : GetPower) {
			System.out.println(getPower2);
		}
		return null;
	}
}
