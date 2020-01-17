package phone;

public abstract class Handset {
	private String brand;
	private String type;

	public void sendInfo() {

	}

	public void call() {

	}

	public void info() {

	}
	
	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Handset(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	}

	public Handset() {
		super();
	}
	
}
