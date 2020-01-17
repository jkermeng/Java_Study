package FactoryMethod;

public class Test {

	public static void main(String[] args) {
		
		SenderMailFactory senderMailFactory = new SenderMailFactory();
		ISender provider = senderMailFactory.provider();
		provider.send();
		SenderSmsFactory senderSmsFactory = new SenderSmsFactory();
		ISender provider2 = senderSmsFactory.provider();
		provider2.send();
	
	}

}
