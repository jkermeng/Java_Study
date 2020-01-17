package pointPlay;

public class srocle extends Figure {
	private Point sO, sY, sX;// 三角形数值
	// x,y点坐标；

	@Override
	public void onDraw() {

		System.out.println("画一个三角形，坐标位：  " + "(" + this.sO.getX() + "," + this.sO.getY() + ")" + "(" + this.sX.getX()
				+ "," + this.sX.getY() + ")" + "(" + this.sY.getX() + "," + this.sY.getY() + ")");

	}

	public srocle(Point sO, Point sY, Point sX) {
		super();
		this.sO = sO;
		this.sY = sY;
		this.sX = sX;
	}

}
