package potion;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��16��
 * @Version 1.0.0
 */
public class Porter {
	private Goods[] set;
	private Goods[] addGoods;
	private int num[];

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public Goods[] getAddGoods() {
		return addGoods;
	}

	public void setAddGoods(Goods[] addGoods) {
		this.addGoods = addGoods;
	}

	public Goods[] getSet() {
		return set;
	}

	public void setSet(Goods[] set) {
		this.set = set;
	}

	public Porter(Goods[] goods) {
	
		addGoods = new Goods[0];
		num = new int[0];
		this.set = goods;
		
	}
	


	// �����Ʒ�����ﳵ
	public Goods[] addBukey(int[] id) {
		int i = 1;
		int k =0;
		int j = 0 ;
		int g = addGoods.length;
		if (g != id.length) {
		for (k =0; k < set.length;) {
			Goods goods = set[k];// ��������Ʒ�Ա�
			
				if (goods.getId()==id[j]) {
					//��ʱ�Ļ���ռ�
					Goods temprory[] = new Goods[addGoods.length + 1];
					int int_temprory[] = new int[num.length + 1];
					//��ʱ����ռ���Ӷ�Ӧ����
					temprory[temprory.length - 1] = set[k];
					//����Ļ����ֵ
					int_temprory[int_temprory.length -1] = id[i];
					i+=2;
					//����Ѱ�һ���id
					k = 0;
					// �õ�idֵ
					if (addGoods.length > 0) {
						for (int o = 0; o < addGoods.length; o++) {
							temprory[o] = addGoods[o];
							int_temprory[o] = num[o];
						}
					}
			
					addGoods = temprory;
					num = int_temprory;
					j+=2;
					if (j==id.length) {
						break;
					}
					
				}else {
					k++;
				}
			
			}
					
				
		
		g--;
			
	
		}
		return addGoods;

	}

	// ������Ʒ�ܼ�
	public int sumGoods() {
		int sum = 0;
		System.out.println("�ѹ��� -> ��ƷID\t��Ʒ����\t��Ʒ����\t��Ʒ�۸�\t\n");
		for (int i = 0; i < addGoods.length; i++) {
			Goods goods = addGoods[i];
			
			sum += (this.num[i] * goods.getPrince());
			System.out
					.println("\t"+goods.getId() + "\t" + goods.getName() + "\t" + this.num[i] + "\t" + goods.getPrince());

		}
		return sum;
	}
}
