package phone;

public class CommenHandset extends Handset implements IPlayWiring {

	@Override
	public void play(String content) {

		System.out.println("开始播放音乐"+"《"+content+"》......");
	}

	@Override
	public void sendInfo() {
		super.sendInfo();
		System.out.println("发送文字信息..... ");
	}

	@Override
	public void call() {
		System.out.println("开始语音通话......");
		super.call();
	}

	@Override
	public void info() {
		System.out.println("型号为： " + super.getType() + "的" + super.getBrand() + "手机：");
	}

	public CommenHandset(String type, String brand) {
		super(type, brand);
	}

	public CommenHandset() {
	}
}
