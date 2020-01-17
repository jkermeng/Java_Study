package idao;

import java.util.List;

public interface TDaos<T> {
	void insert(T tI);

	List<?> selectAll();

}
