package phone;

public class test {
	public static void main(String[] args) {
		CommenHandset ch = new CommenHandset("G502c", "����");
		ch.info();
		ch.play("��ѩ");
		ch.sendInfo();
		ch.call();
		System.out.println("\n");
		AptitudeHandst ah = new AptitudeHandst("HTC","I9100");
		ah.info();
		ah.newworkCown();
		ah.takePictare();
		ah.sendInfo();
		ah.call();
	}
}
