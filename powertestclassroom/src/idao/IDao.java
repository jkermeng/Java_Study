package idao;

import java.sql.SQLException;
import java.util.Set;

import entity.Department;
import entity.Employee;
import entity.GetPower;

public interface IDao<T> {
	void Insert(T t);

	void Delete(T t);

	void Update(T t, int pid, int fkid);

	void Update(T t, int pid);

	Set<T> Selete();

	T SeleteById(int id);

	Set<T> SeleteByFK(int fkid, int pid);

	Set<GetPower> SeleteByUserenumber(Employee e);

	T login(String number, String pwd);

}
