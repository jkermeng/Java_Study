package test;

public class test {

	public static void main(String[] args) {
		String str = "abc_�Ұ����й�_abc";
		String str1 = "��Щ��һ���ˣ���Ҳ������Ҳ�ߣ��й��ᣬ�й���,"
				+ " ���ǵü����ô���氮���Żᶮ�����į����ף������������������С�"
				+ "����һ��һ���ߣ���Щ���Ӳ����У�һ�仰��һ���ӣ�һ���飬һ���ơ�"
				+ "���Ѳ����µ�����һ��������ᶮ�������ˣ�����ʹ����Ҫ�ߣ������ҡ�";
		String s1 = "�ƺ�һȥ������������ǧ�ؿ�����";//��ȡ����
		String s2 = "abc45abc89a6ab";//���s1��s2�ıȽϽ��
		String s3 = "45050619770258061x";//��ȡ������
		//System.out.println(str.substring(0,3)+"~"+str.substring(4,9)+"~"+str.substring(10));
		String str2[] = str.split("_");
		for (String string : str2) {
			System.out.println(string);
		}
		int i = 0;
		System.out.println(str1.indexOf("����"));
		while (true) {
			str1 = str1.substring(str1.indexOf("����")+1);
			System.out.println(str1);
			i+=1;
			if (str1.indexOf("����")==-1) {
			
				break;
			}
		}
		
		System.out.println(i);
		System.out.println(str1.toCharArray());
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
		System.out.println(s3.substring(6, 14));
	
	}

}
