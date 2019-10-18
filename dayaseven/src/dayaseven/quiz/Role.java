package dayaseven.quiz;

public class Role {

	private int id;
	private String name;
	private int source;
	private int hand;

	public Role() {
	}

	public Role(String name) {
		this.name = name;
	}

	public Role(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getHand() {
		return hand;
	}

	public void setHand(int hand) {
		this.hand = hand;
	}

	public String choeseName(int value) {
		String result = null;
		hand =value;
		switch (value) {
		case 1:

			result = "刘备";
			break;
		case 2:
			result = "孙权";
			break;
		case 3:
			result = "曹操";
			break;
		default:
			value = 0;
			break;
		}
		return result;
	}

	public String goPlay(int value) {
		String result = null;
		this.hand = value;
		switch (value) {
		case 1:
			result = "石头";
			break;
		case 2:
			result = "剪刀";
			break;
		case 3:
			result = "布";
			break;
		default:
			value = 0;
			break;
		}
		return result;
	}

}
