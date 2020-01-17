package quizfour;

public class BattleFiels {
	private Plane bigPlane;
	private Plane smallPlane;
	private Plane biggestPlane;

	public BattleFiels() {
		bigPlane = new BigPlane("大飞机", 1, 99, -2);
		smallPlane = new SmallPlane("小飞机", 2, 98, -1);
		biggestPlane = new BiggestPlane("超大飞机", 3, 97, -3);
	}
/**
 * 操作时可以输入一个Player对象，because继承了Plane
 * @param p 传入一个Plane对象
 * @return
 */	
	public Plane beFight(Plane p) {
		int pBlood = p.getBlood();
		pBlood += bigPlane.attact() + smallPlane.attact() + biggestPlane.attact();
		p.setBlood(pBlood);
		return p;
	}

	public static void main(String[] args) {
		BattleFiels battleFiels = new BattleFiels();
		Player p1 = Player.getPlayer();
		battleFiels.beFight(p1);
		System.out.println(p1.getBlood());

	}

}
