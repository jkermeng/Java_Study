package dayaseven.animal;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��12��
 * @Version 1.0.0
 */
public class Dog {
	private String name;
	private int age;
	private String calor;
	private String sex;
	private int dollar;

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setCalor(String calor) {
		this.calor = calor;
	}

	public String getCalor() {
		return calor;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setDollar(int dollar) {
		this.dollar = dollar;
	}

	public int getDollar() {
		return dollar;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name"+name+"sex"+sex+"age"+age+"calor"+calor+"dollar"+dollar;
	}
}
