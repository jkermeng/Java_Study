package dayseven.quiz;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019��10��14��
 * @Version 1.0.0
 */
public class Calulate {
	private int a = 0;
	private int b = 0;
	
	public Calulate() {
		super();
	}
	public Calulate(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int jia() {
		
		return this.a + this.b;
	}
	public int jian() {
		
		return this.a - this.b;
	}
	public int cheng() {
		
		return this.a * this.b;
	}
	public int chu() {
		
		return this.a / this.b;
	}

}
