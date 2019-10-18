package dayaseven.animal;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019Äê10ÔÂ12ÈÕ
 * @Version 1.0.0
 */
public class Cat {

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
		return "Cat [name=" + name + ", age=" + age + ", calor=" + calor + ", sex=" + sex + ", dollar=" + dollar + "]";
	}

}
