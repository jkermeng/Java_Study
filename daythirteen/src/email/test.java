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
		Properties props = new Properties();// key value:���ò��������������ʼ�ʱ������
		props.setProperty("mail.transport.protocol", "smtp");// ָ���ʼ����͵�Э�飬�����ǹ淶�涨��
		props.setProperty("mail.host", "smtp.qq.com");// ָ�������������ĵ�ַ�������ǹ淶�涨��
		// props.setProperty("mail.debug", "true");//�ʼ����͵ĵ���ģʽ�������ǹ淶�涨��
		props.setProperty("mail.smtp.auth", "true");// ������������������֤������������JavaMailʵ���й�

		Session session = Session.getInstance(props);// �����ʼ�ʱʹ�õĻ�������
		session.setDebug(true);
		MimeMessage message = new MimeMessage(session);

		// �����ʼ���ͷ
		try {
			message.setFrom(new InternetAddress("1171754549@qq.com"));
			message.setRecipients(Message.RecipientType.TO, "1115892648@qq.com");
			message.setSubject("ŷ��");
			// ��������
			message.setContent("<h1>hello</h1>", "text/html");
			for (int i = 98547; i < 98558; i++) {
				message.setText("���ƴ���Ƿ��"+i+"ԪǮ");// ���ı�
				message.saveChanges();
				// �����ʼ�
				Transport ts = session.getTransport();
				ts.connect("1171754549@qq.com", "skmtexyhzrxkifbb"); // ����Ϊ��Ȩ�벻������ĵ�¼����
				ts.sendMessage(message, message.getAllRecipients());// ������ʵ������}
			}
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
