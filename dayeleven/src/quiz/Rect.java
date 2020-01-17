package quiz;

public class Rect {
	protected int width;
	protected int height;

	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rect() {
		super();
		width = 10;
		height = 10;
	}

	public int getArea() {
		
		return (height+width)*2;

	}

	public int getPerimeter() {
		
		return height*width;
	}
	
}
