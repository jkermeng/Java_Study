package pointPlay;

public class Round extends Figure {
	private Point sX;// ��������ֵ

	@Override
	void onDraw() {

		System.out.println("Բ�ģ� "+this.sX.getX()+","+this.sX.getY()+"�뾶��"+(int)Math.sqrt(Math.pow((this.sX.getX()), 2)+Math.pow(this.sX.getY(), 2)));

	}

	public Round( Point sX) {
		super();
		
		this.sX = sX;
	}

}
