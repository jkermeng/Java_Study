package phone;

public class AptitudeHandst extends Handset implements TheakePictures, Network {

	@Override
	public void newworkCown() {
		System.out.println("已开启移动网络");
	}

	@Override
	public void takePictare() {
		System.out.println("咔嚓.....拍照成功");
	}

	@Override
	public void sendInfo() {
		System.out.println("发送带图片与文字的信息");
	}

	@Override
	public void call() {
		System.out.println("開始視頻通話.....");
	}

	@Override
	public void info() {
		System.out.println("型号位" + super.getType() + "的" + super.getBrand() + "手机：");
	}

	public AptitudeHandst(String type, String brand) {
		super(type, brand);
	}

	public AptitudeHandst() {

	}
}
