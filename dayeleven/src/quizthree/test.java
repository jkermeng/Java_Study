package quizthree;

public class test {
	public static void main(String[] args) {
		Undergraduate st = new Undergraduate("����", 23, "����","��ҵ�Զ���");
		System.out.println("���� "+st.getName());
		System.out.println("���� "+st.getAge());
		System.out.println("ѧλ "+st.getDegree());
		System.out.println("רҵ "+st.getSpecialty());
		System.out.println("---------------------");
		Graduate st2 = new Graduate("����", 27, "˶ʿ","���缼��");
		System.out.println("���� "+st2.getName());
		System.out.println("���� "+st2.getAge());
		System.out.println("ѧλ "+st2.getDegree());
		System.out.println("�о����� "+st2.getStudyDrection());
		System.out.println("---------------------");


	}
}
