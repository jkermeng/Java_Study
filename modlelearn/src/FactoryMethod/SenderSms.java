package FactoryMethod;

public class SenderSms implements ISender {

	@Override
	public void send() {
		System.out.println("this is Sms");
	}

}
