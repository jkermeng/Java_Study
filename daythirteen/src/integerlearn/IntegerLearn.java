package integerlearn;

public class IntegerLearn {
	public static void main(String[] args) {
		//װ��
		Integer i1 = new Integer(1);
		System.out.println(i1+1);
		//����
		int i2 =i1;
		System.out.println(i2+1);
		//String װ��
		String str = new String ("123");
		System.out.println(str+1);
		//����
		String str1 = str;
		System.out.println(str1+1);
		System.out.println("===============");
		//װ��
		Integer i3 = 123;
		System.out.println(i3+1);
		//����
		int i4 = i3;
		System.out.println(i4+1);
		//String װ��int����
		String valueOf = String.valueOf(i3);
		System.out.println(valueOf+1);
		//����
		String str2 ="123";
		System.out.println(str2+1);
		//�ַ���ת��Ϊ ����
		int parseInt = Integer.parseInt(str2);
		System.out.println(parseInt+1);
		double parseDouble = Double.parseDouble(str2);
		System.out.println(parseDouble);
		
	}
}
