package staticmultimethodfactorymethodpattern;

import simplefactorymode.ISender;
import simplefactorymode.MailSender;
import simplefactorymode.SmsSender;

public class SenderFactoryStatic {
	public static ISender mailSender(){
		return new MailSender();
	}
	public static ISender SmsSender(){
		return new SmsSender();
	}
}
