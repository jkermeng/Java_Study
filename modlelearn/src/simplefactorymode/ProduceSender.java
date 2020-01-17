package simplefactorymode;

public class ProduceSender {
	public ISender sent(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}
		return null;
	}
}
