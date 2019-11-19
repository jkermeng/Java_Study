package service;

import java.util.Set;

import entity.Department;
import entity.Employee;
import enums.Responese;

public interface IService<T> {
	Set<T> SeleteAllDetailed();

	Set<T> SeleteAll(T e);

	Set<T> SeleteByFK(int pid);

	Responese update(T e, int pid);

	Responese insert(T e);

	Responese delete(T t);

	Responese getUserPower(Employee e);

	Responese update(T e, int pid, int fkid);

	Set<T> SeleteByFK(int pid, int fkid);

	boolean Login(String num, String pwd);

}
