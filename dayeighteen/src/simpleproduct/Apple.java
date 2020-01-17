package simpleproduct;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	private int id;
	private String kind;
	private boolean flag;

	public int getId() {
		return id;
	}

	public String getKind() {
		return kind;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", kind=" + kind + "]";
	}

	public Apple(int id, String kind, boolean flag) {
		super();
		this.id = id;
		this.kind = kind;
		this.flag = flag;
	}

	public static void main(String[] args) {
		List<Apple> alist = new ArrayList<>();
		
		CreateApple ca = new CreateApple(alist);
		EatApple ea = new EatApple(alist);
		
		Thread create = new Thread(ca);
		Thread eat = new Thread(ea);
		
		create.start();
		eat.start();

	}
}
