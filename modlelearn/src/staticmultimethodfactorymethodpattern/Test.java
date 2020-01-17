package staticmultimethodfactorymethodpattern;

import simplefactorymode.ISender;

public class Test {
	public static void main(String[] args) {
		ISender mailSender = SenderFactoryStatic.mailSender();
		ISender smsSender = SenderFactoryStatic.SmsSender();
		mailSender.send();
		smsSender.send();
	}
}
