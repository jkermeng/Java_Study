package idao;

import java.util.List;

import enmus.RespondRuslt;
import entity.Goods;

public interface Daos<T> {
	//��ѯ���û���
	List<T> selectAll();
	//��ѯid�µĻ���
	List<T> selectById(int id);
	//���ӻ���
	void insert(T tI);
	//���»���
	void update(T tU);
	//ɾ������
	void deleteById(T tD);
	//�����Ƿ����
	boolean isExist(int id);
	void clear();
}
