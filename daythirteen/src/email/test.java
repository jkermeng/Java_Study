package email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class test {
	public static void main(String[] args) {
		Properties props = new Properties();// key value:配置参数。真正发送邮件时再配置
		props.setProperty("mail.transport.protocol", "smtp");// 指定邮件发送的协议，参数是规范规定的
		props.setProperty("mail.host", "smtp.qq.com");// 指定发件服务器的地址，参数是规范规定的
		// props.setProperty("mail.debug", "true");//邮件发送的调试模式，参数是规范规定的
		props.setProperty("mail.smtp.auth", "true");// 请求服务器进行身份认证。参数与具体的JavaMail实现有关

		Session session = Session.getInstance(props);// 发送邮件时使用的环境配置
		session.setDebug(true);
		MimeMessage message = new MimeMessage(session);

		// 设置邮件的头
		try {
			message.setFrom(new InternetAddress("1171754549@qq.com"));
			message.setRecipients(Message.RecipientType.TO, "1115892648@qq.com");
			message.setSubject("欧总");
			// 设置正文
			message.setContent("<h1>hello</h1>", "text/html");
			for (int i = 98547; i < 98558; i++) {
				message.setText("春科大银欠我"+i+"元钱");// 纯文本
				message.saveChanges();
				// 发送邮件
				Transport ts = session.getTransport();
				ts.connect("1171754549@qq.com", "skmtexyhzrxkifbb"); // 密码为授权码不是邮箱的登录密码
				ts.sendMessage(message, message.getAllRecipients());// 对象，用实例方法}
			}
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
