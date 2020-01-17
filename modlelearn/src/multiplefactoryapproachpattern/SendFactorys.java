package multiplefactoryapproachpattern;

import simplefactorymode.ISender;
import simplefactorymode.MailSender;
import simplefactorymode.SmsSender;

public class SendFactorys {
	public ISender mailSender() {
		return new MailSender();
	}

	public ISender smsSender() {
		return new SmsSender();
	}
}
