package email;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class emailTrail {
	public static void main(String[] args) throws GeneralSecurityException {
		String to = "919773813@qq.com";
		String from = "1171754549@qq.com";
		String server = "smtp.qq.com";
		String username = "1171754549@qq.com";
		String password = "skmtexyhzrxkifbb";

		Properties properties = System.getProperties();
		properties.setProperty("mail.stmp.host", "smtp.qq.com");
		properties.put("mail.smpt.auth", "true");
	    properties.put("mail.stmp.host", 25);
	    properties.put("mail.smtp.ssl.enable", "true");
		MailSSLSocketFactory sf = new MailSSLSocketFactory();
		sf.setTrustAllHosts(true);
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.ssl.socketFactory", sf);
		properties.setProperty("mail.smtp.auth", "true");//������֤
	    properties.setProperty("mail.debug", "true");//���õ���
	    properties.setProperty("mail.smtp.timeout", "1000");//�������ӳ�ʱ
	    properties.setProperty("mail.smtp.port", "465");//���ö˿�
	    properties.setProperty("mail.smtp.socketFactory.port", "465");//����ssl�˿�
	    properties.setProperty("mail.smtp.socketFactory.fallback", "false");
	    properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	
	    Session session = Session.getDefaultInstance(properties, new Authenticator() {
			
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, "skmtexyhzrxkifbb");

			}

		});

		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Jvm���͵��ʼ�");
			message.setText("һ������Jvm����Ϣ..1.");
			Transport transport = session.getTransport();
			transport.connect(server, username, password);
			transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
			transport.close();
			Transport.send(message);
			System.out.println("���ͳɹ�");

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
