package quizthree;

public class test {
	public static void main(String[] args) {
		Undergraduate st = new Undergraduate("王军", 23, "本科","工业自动化");
		System.out.println("姓名 "+st.getName());
		System.out.println("年龄 "+st.getAge());
		System.out.println("学位 "+st.getDegree());
		System.out.println("专业 "+st.getSpecialty());
		System.out.println("---------------------");
		Graduate st2 = new Graduate("刘君", 27, "硕士","网络技术");
		System.out.println("姓名 "+st2.getName());
		System.out.println("年龄 "+st2.getAge());
		System.out.println("学位 "+st2.getDegree());
		System.out.println("研究方向 "+st2.getStudyDrection());
		System.out.println("---------------------");


	}
}
