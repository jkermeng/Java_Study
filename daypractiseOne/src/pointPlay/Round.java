package pointPlay;

public class Round extends Figure {
	private Point sX;// 三角形数值

	@Override
	void onDraw() {

		System.out.println("圆心： "+this.sX.getX()+","+this.sX.getY()+"半径："+(int)Math.sqrt(Math.pow((this.sX.getX()), 2)+Math.pow(this.sX.getY(), 2)));

	}

	public Round( Point sX) {
		super();
		
		this.sX = sX;
	}

}
