package phone;

public class CommenHandset extends Handset implements IPlayWiring {

	@Override
	public void play(String content) {

		System.out.println("��ʼ��������"+"��"+content+"��......");
	}

	@Override
	public void sendInfo() {
		super.sendInfo();
		System.out.println("����������Ϣ..... ");
	}

	@Override
	public void call() {
		System.out.println("��ʼ����ͨ��......");
		super.call();
	}

	@Override
	public void info() {
		System.out.println("�ͺ�Ϊ�� " + super.getType() + "��" + super.getBrand() + "�ֻ���");
	}

	public CommenHandset(String type, String brand) {
		super(type, brand);
	}

	public CommenHandset() {
	}
}
