package phone;

public class AptitudeHandst extends Handset implements TheakePictures, Network {

	@Override
	public void newworkCown() {
		System.out.println("�ѿ����ƶ�����");
	}

	@Override
	public void takePictare() {
		System.out.println("����.....���ճɹ�");
	}

	@Override
	public void sendInfo() {
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ");
	}

	@Override
	public void call() {
		System.out.println("�_ʼҕ�lͨԒ.....");
	}

	@Override
	public void info() {
		System.out.println("�ͺ�λ" + super.getType() + "��" + super.getBrand() + "�ֻ���");
	}

	public AptitudeHandst(String type, String brand) {
		super(type, brand);
	}

	public AptitudeHandst() {

	}
}
