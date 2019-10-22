package quiztwo;

public abstract class Century extends Person{

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
	public abstract void printer(); 
	public abstract void printer(Person p);
}
