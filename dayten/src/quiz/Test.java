package quiz;

public class Test {

	public static void main(String[] args) {
		Employee em = new Employee();
		Employee em2 = new Employee();
		em.setName("bb");
		em.setAge(11);
		em.setGender("男");
		em.setWork("工程师");
		em2.setName("bb");
		em2.setAge(11);
		em2.setGender("男");
		em2.setWork("工程师");
		
		
		
		System.out.println(em.equals(em2));
		
	}

}
