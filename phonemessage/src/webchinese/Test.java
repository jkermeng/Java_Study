package webchinese;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
/**
 * ���÷�������û�ж���ʹ��Ȩ�ޣ���Ҫ��ֵ
 * @author admin
 *
 */
public class Test {
	public static void main(String[] args) throws Exception{
		HttpClient httpClient = new HttpClient();
		PostMethod postMethod = new PostMethod("http://gbk.api.smschinese.cn");
		postMethod.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");
		NameValuePair[] data = {new NameValuePair("Uid","jkermeng"),new NameValuePair("Key", "d41d8cd98f00b204e980"),new NameValuePair("smsMob", "18776774185"),new NameValuePair("smsText","are you ok?������У��б���˳�����ߴ�绰���ң�������li chun ��")};
		postMethod.setRequestBody(data);
		
		httpClient.executeMethod(postMethod);
		Header[] requestHeaders = postMethod.getRequestHeaders();
		int statusCode = postMethod.getStatusCode();
		System.out.println("statusCode: "+statusCode);
		for (Header header : requestHeaders) {
			System.out.println(header.toString());
			
		}
		String string = new String(postMethod.getResponseBodyAsString().getBytes("gbk"));
		System.out.println(string);
	
	}
}
