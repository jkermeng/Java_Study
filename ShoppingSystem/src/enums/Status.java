package enums;

public enum Status {
	SUCCESS(1000, "成功"), NULL(1001, "NULL"), FAIL(1002, "失败"),HAVASAME(1003,"已有相同的商品");
	private int code;
	private String msg;

	private Status(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
