package stringbufferlearn;

public class StringBufferDemo {
	public static void main(String[] args) {
		String str = "天上地下，唯我独尊";
		StringBuilder sb = new StringBuilder(3);//20*2+2
		sb.append('a');
		sb.append("b");
//		sb.append(str);
		sb.append("cc",0,2);
		sb.insert(3, "<");
		System.out.println(sb);
		System.out.println("容量"+sb.capacity());
		System.out.println("长度"+sb.length());
		StringBuilder sb1 = new StringBuilder("天上地下，唯我独尊");
		System.out.println(	sb1.reverse());
	}
}
