package quiz;

public class Test {

	public static void main(String[] args) {
		Employee em = new Employee();
		Employee em2 = new Employee();
		em.setName("bb");
		em.setAge(11);
		em.setGender("��");
		em.setWork("����ʦ");
		em2.setName("bb");
		em2.setAge(11);
		em2.setGender("��");
		em2.setWork("����ʦ");
		
		
		
		System.out.println(em.equals(em2));
		
	}

}
