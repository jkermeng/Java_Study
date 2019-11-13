package idao;

import java.sql.SQLException;
import java.util.Set;

public interface IDao<T> {
	public Set<T> select(T t) throws SQLException;

	public T selectById(int id) throws SQLException;

	public void update();

	public void delete();

	public void isExist();

}
