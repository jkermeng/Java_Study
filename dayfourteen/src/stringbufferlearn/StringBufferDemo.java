package stringbufferlearn;

public class StringBufferDemo {
	public static void main(String[] args) {
		String str = "���ϵ��£�Ψ�Ҷ���";
		StringBuilder sb = new StringBuilder(3);//20*2+2
		sb.append('a');
		sb.append("b");
//		sb.append(str);
		sb.append("cc",0,2);
		sb.insert(3, "<");
		System.out.println(sb);
		System.out.println("����"+sb.capacity());
		System.out.println("����"+sb.length());
		StringBuilder sb1 = new StringBuilder("���ϵ��£�Ψ�Ҷ���");
		System.out.println(	sb1.reverse());
	}
}
