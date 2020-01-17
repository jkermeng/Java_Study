package test;

public class test {

	public static void main(String[] args) {
		String str = "abc_我爱你中国_abc";
		String str1 = "这些年一个人，风也过，雨也走，有过泪，有过错,"
				+ " 还记得坚持甚么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中。"
				+ "朋友一生一起走，那些日子不再有，一句话，一辈子，一生情，一杯酒。"
				+ "朋友不曾孤单过，一声朋友你会懂，还有伤，还有痛，还要走，还有我。";
		String s1 = "黄鹤一去不复返，白云千载空悠悠";//截取长度
		String s2 = "abc45abc89a6ab";//输出s1和s2的比较结果
		String s3 = "45050619770258061x";//截取年月日
		//System.out.println(str.substring(0,3)+"~"+str.substring(4,9)+"~"+str.substring(10));
		String str2[] = str.split("_");
		for (String string : str2) {
			System.out.println(string);
		}
		int i = 0;
		System.out.println(str1.indexOf("朋友"));
		while (true) {
			str1 = str1.substring(str1.indexOf("朋友")+1);
			System.out.println(str1);
			i+=1;
			if (str1.indexOf("朋友")==-1) {
			
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
