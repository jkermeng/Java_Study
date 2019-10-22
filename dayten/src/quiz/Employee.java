package quiz;

public class Employee extends Person {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}

	private String work;
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee)obj;
		if(this.getWork()==employee.getWork()&&this.getName()==employee.getName()&&this.getAge()==employee.getAge()&&this.getGender()==employee.getGender()){
			return true;
		}
		return false;
		
		
		
	}
	
	
	
}
