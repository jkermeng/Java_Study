package enmus;

public enum Status {
	SUSSECE(1000,"�ɹ�"),FAIL(1001,"ʧ��"),NULL(1002,"NULL"),GOODSSAME(1003,"��Ʒ��ͬ");
	private int code;
	private String msg;
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private Status(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
}
