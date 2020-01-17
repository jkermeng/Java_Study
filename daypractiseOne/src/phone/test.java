package phone;

public class test {
	public static void main(String[] args) {
		CommenHandset ch = new CommenHandset("G502c", "Ë÷Äá");
		ch.info();
		ch.play("ÈÈÑ©");
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
