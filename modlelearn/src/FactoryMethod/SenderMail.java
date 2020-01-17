package FactoryMethod;

public class SenderMail implements ISender {

	@Override
	public void send() {
		System.out.println("this is Mail");
	}

}
