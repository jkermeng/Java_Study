package quizthree;

abstract  class Pet {
	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
