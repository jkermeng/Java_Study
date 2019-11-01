package enmus;

public class RespondRuslt {
	private int code;
	private String msg;
	private Object obj;

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public RespondRuslt() {
		super();
	}

	public RespondRuslt(Status s) {
		super();
		this.code = s.getCode();
		this.msg = s.getMsg();

	}

	public RespondRuslt(Status s, Object obj) {
		super();
		this.code = s.getCode();
		this.msg = s.getMsg();
		this.obj = obj;
	}

	public RespondRuslt(int code, String msg, Object obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}

}
