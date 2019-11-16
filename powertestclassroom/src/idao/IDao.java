package idao;

import java.sql.SQLException;
import java.util.Set;

public interface IDao<T> {
	void Insert(T t);

	void Delete(T t);

	void Update(T t,int pid,int fkid);

	Set<T> Selete();

	Set<T> SeleteByFK(int fkid, int pid);
}
