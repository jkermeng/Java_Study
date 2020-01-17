package simplefactorymode;

public class Test {
	public static void main(String[] args) {
		ProduceSender ps = new ProduceSender();
		ISender sent = ps.sent("sms");
		sent.send();
	}
}
