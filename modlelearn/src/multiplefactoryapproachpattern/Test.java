package multiplefactoryapproachpattern;

import simplefactorymode.ISender;

public class Test {
	public static void main(String[] args) {
		SendFactorys sf = new SendFactorys();
		ISender mailSender = sf.mailSender();
		ISender smsSender = sf.smsSender();
		mailSender.send();
		smsSender.send();
	}
}
