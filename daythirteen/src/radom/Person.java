package radom;

public class Person {
	private String value;
	private Integer key;

	public String getValue() {
		return value;
	}

	public Integer getKey() {
		return key;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Person() {
		super();
	}

	public Person(String value, Integer key) {
		super();
		this.value = value;
		this.key = key;
	}
	
	
}
