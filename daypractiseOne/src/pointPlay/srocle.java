package pointPlay;

public class srocle extends Figure {
	private Point sO, sY, sX;// ��������ֵ
	// x,y�����ꣻ

	@Override
	public void onDraw() {

		System.out.println("��һ�������Σ�����λ��  " + "(" + this.sO.getX() + "," + this.sO.getY() + ")" + "(" + this.sX.getX()
				+ "," + this.sX.getY() + ")" + "(" + this.sY.getX() + "," + this.sY.getY() + ")");

	}

	public srocle(Point sO, Point sY, Point sX) {
		super();
		this.sO = sO;
		this.sY = sY;
		this.sX = sX;
	}

}
