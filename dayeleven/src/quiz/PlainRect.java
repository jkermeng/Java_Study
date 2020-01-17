package quiz;

public class PlainRect extends Rect {
	// ¾ØĞÎÀà
	private int startX, startY;

	public PlainRect(int width, int height, int startX, int startY) {
		super(width, height);
		this.startX = startX;
		this.startY = startY;

	}

	public PlainRect(int width, int height) {
		super(width, height);
		width = 0;
		height = 0;
		startX = 0;
		startY = 0;

	}

	public boolean isInside(double x, double y) {
		if (x >= startX && x <= (startX + width) && y >= (startY - height) && y <= startY) {
			return true;
		}

		return false;

	}
}
