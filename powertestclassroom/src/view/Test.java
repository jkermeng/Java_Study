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
		System.out.println("��ӭ��½XXXԱ������ϵͳ");
		do {
			System.out.println("�����˺�:");
			String num = sc.next();
			System.out.println("����������");
			String pwd = sc.next();
			if (esimp.Login(num, pwd)) {
				// ��ȡ��ԱȨ��
				Employee e1 = new Employee();
				e1.setEnumber(num);
				e1.setEpassword(pwd);
				Responese userPower = rsimp.getUserPower(e1);
				getPower(userPower);
				do {
					System.out.println("1��employee����\n2��job����\n3��department����\n4��role����\n5���鿴�Ñ�����\n0���뿪���� ");
					int nums = sc.nextInt();
					if (nums == 1) {
						do {
							System.out.println("1���鿴employee 2���޸�employee 3��ɾ��employee 4�����employee 5���˳�");
							System.out.println("������ѡ�� ��");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Employee> seleteAll = esimp.SeleteAllDetailed();
									showEmployee(seleteAll);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else {
								// ��ͨԱ���鿴
							}

							if (choice == 2) {
								String ct = null;
								do {
									System.out.println("�޸�idΪ��");
									int eid = sc.nextInt();
									System.out.println("�޸�nameΪ��");

									String ename = sc.next();
									System.out.println("�޸�numberΪ��");

									String enumber = sc.next();
									System.out.println("�޸�passwordΪ��");

									String epassword = sc.next();
									System.out.println("�޸�egenderΪ��");

									String egender = sc.next();
									System.out.println("�޸�phoneΪ��");

									String ephone = sc.next();
									System.out.println("�޸�eemailΪ��");

									String eemail = sc.next();
									System.out.println("�޸�estattusΪ��");

									String estattus = sc.next();
									System.out.println("�޸�didΪ��");

									int did = sc.nextInt();
									Employee e = new Employee(eid, ename, enumber, epassword, egender, ephone, eemail,
											estattus);
									e.setDid(new Department(did));
									System.out.println("��Ҫ�޸ĵ�id��");
									int pid = sc.nextInt();
									System.out.println("��Ҫ�޸ĵĲ���id��");
									int fkid = sc.nextInt();
									esimp.update(e, pid, fkid);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("ɾ����idΪ��");
									int eid = sc.nextInt();
									System.out.println("��Ҫɾ���Ĳ���id��");
									int did = sc.nextInt();
									Employee employee = new Employee();
									employee.setEid(eid);
									employee.setDid(new Department(did));
									esimp.delete(employee);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("��ӵ�idΪ��");
									int eid = sc.nextInt();
									System.out.println("��ӵ�nameΪ��");

									String ename = sc.next();
									System.out.println("��ӵ�numberΪ��");

									String enumber = sc.next();
									System.out.println("��ӵ�passwordΪ��");

									String epassword = sc.next();
									System.out.println("��ӵ�egenderΪ��");

									String egender = sc.next();
									System.out.println("��ӵ�phoneΪ��");

									String ephone = sc.next();
									System.out.println("��ӵ�eemailΪ��");

									String eemail = sc.next();
									System.out.println("��ӵ�estattusΪ��");

									String estattus = sc.next();
									System.out.println("��ӵ�didΪ��");
									int did = sc.nextInt();
									Employee e = new Employee(eid, ename, enumber, epassword, egender, ephone, eemail,
											estattus);
									e.setDid(new Department(did));
									esimp.insert(e);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 5) {
								break;
							}
						} while (true);
					} else if (nums == 2) {
						// ��Ӧ�Ĺ���
						do {
							System.out.println("1���鿴job 2���޸�job 3��ɾ��job 4�����job 5���˳�");
							System.out.println("������ѡ�� ��");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Job> seleteAllDetailed = jsimp.SeleteAllDetailed();
									showJob(seleteAllDetailed);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 2) {
								String ct = null;
								do {
									System.out.println("�޸�ְλid");
									int jid = sc.nextInt();
									System.out.println("�޸�ְλ����");
									String jname = sc.next();
									System.out.println("�޸�ְλ˵��");
									String jexplain = sc.next();
									System.out.println("�޸�ְλ���");
									String jnumber = sc.next();
									System.out.println("�޸Ĳ���id");
									int department_did = sc.nextInt();
									Job job = new Job(jid, jname, jnumber, jexplain);
									job.setDid(new Department(department_did));
									System.out.println("��Ҫ�޸ĵ�id��");
									int pid = sc.nextInt();
									System.out.println("��Ҫ�޸ĵĲ���id��");
									int fkid = sc.nextInt();
									jsimp.update(job, pid, fkid);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("��Ҫɾ����id��");
									int jid = sc.nextInt();
									System.out.println("��Ҫɾ���Ĳ���id��");
									int did = sc.nextInt();
									Job e = new Job(jid);
									e.setDid(new Department(did));
									jsimp.delete(e);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("�޸�ְλid");
									int jid = sc.nextInt();
									System.out.println("�޸�ְλ����");
									String jname = sc.next();
									System.out.println("�޸�ְλ˵��");
									String jexplain = sc.next();
									System.out.println("�޸�ְλ���");
									String jnumber = sc.next();
									System.out.println("�޸Ĳ���id");
									int did = sc.nextInt();
									Job job = new Job(jid, jname, jnumber, jexplain);
									job.setDid(new Department(did));
									jsimp.insert(job);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 5) {
								break;
							}
						} while (true);
					} else if (nums == 3) {
						do {
							System.out.println("1���鿴department 2���޸�department 3��ɾ��department 4�����department 5���˳�");
							System.out.println("������ѡ�� ��");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Department> seleteAll = dsimp.SeleteAll(null);
									showDepartment(seleteAll);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 2) {
								String ct = null;
								do {
									System.out.println("��Ҫ��Ҫ�޸ĵ�did");
									int pid = sc.nextInt();
									System.out.println("�޸�did:");
									int did = sc.nextInt();
									System.out.println("�޸�dname:");
									String dname = sc.next();
									System.out.println("�޸�dnumber:");
									int dnumber = sc.nextInt();
									System.out.println("�޸�dcreatedatetime:");
									String dcreatdatetime = sc.next();
									System.out.println("�޸�dbrief:");
									String dbrief = sc.next();
									System.out.println("�޸�dremarks:");
									String dremarks = sc.next();
									Department e = new Department(did, dname, dnumber, dcreatdatetime, dbrief,
											dremarks);
									dsimp.update(e, pid);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("ɾ����didΪ��");
									int did = sc.nextInt();
									dsimp.delete(new Department(did));
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("���did:");
									int did = sc.nextInt();
									System.out.println("���dname:");
									String dname = sc.next();
									System.out.println("���dnumber:");
									int dnumber = sc.nextInt();
									System.out.println("���dcreatedatetime:");
									String dcreatdatetime = sc.next();
									System.out.println("���dbrief:");
									String dbrief = sc.next();
									System.out.println("���dremarks:");
									String dremarks = sc.next();
									dsimp.insert(new Department(did, dname, dnumber, dcreatdatetime, dbrief, dremarks));
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 5) {
								break;
							}
						} while (true);
					} else if (nums == 4) {
						do {
							System.out.println("1���鿴role 2���޸�role 3��ɾ��role 4�����role 5���˳�");
							System.out.println("������ѡ�� ��");
							int choice = sc.nextInt();

							if (choice == 1) {
								String ct = null;
								do {
									Set<Role> seleteAllDetailed = rsimp.SeleteAllDetailed();
									shoRole(seleteAllDetailed);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 2) {
								String ct = null;
								do {
									System.out.println("��Ҫ�޸ĵ�Rid: ");
									int pid = sc.nextInt();
									System.out.println("��Ҫ�޸ĵ�jid: ");
									int fkid = sc.nextInt();
									System.out.println("�޸�rid: ");
									int rid = sc.nextInt();
									System.out.println("�޸�rname: ");
									String rname = sc.next();
									System.out.println("�޸�rexplain: ");
									String rexplain = sc.next();
									System.out.println("�޸�jid: ");
									int jid = sc.nextInt();
									rsimp.update(new Role(rid, rname, rexplain, new Job(jid)), pid, fkid);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 3) {
								String ct = null;
								do {
									System.out.println("ɾ��rid��");
									int rid = sc.nextInt();
									System.out.println("ɾ����jid");
									int jid = sc.nextInt();
									Role role = new Role();
									role.setJid(new Job(jid));
									role.setRid(rid);
									rsimp.delete(role);
									System.out.println("�Ƿ����y/n");
									ct = sc.next();
								} while (ct.equals("y"));
							} else if (choice == 4) {
								String ct = null;
								do {
									System.out.println("��Ҫ�޸ĵ�Rid: ");
									int pid = sc.nextInt();
									System.out.println("��Ҫ�޸ĵ�jid: ");
									int fkid = sc.nextInt();
									System.out.println("�޸�rid: ");
									int rid = sc.nextInt();
									System.out.println("�޸�rname: ");
									String rname = sc.next();
									System.out.println("�޸�rexplain: ");
									String rexplain = sc.next();
									System.out.println("�޸�jid: ");
									int jid = sc.nextInt();
									Role e = new Role(rid, rname, rexplain, new Job(jid));
									rsimp.insert(e);
									System.out.println("�Ƿ����y/n");
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
				System.out.println("�˺��������ʣ��" + (l) + "�λ���");

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
