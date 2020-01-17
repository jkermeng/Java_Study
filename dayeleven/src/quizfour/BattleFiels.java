package quizfour;

public class BattleFiels {
	private Plane bigPlane;
	private Plane smallPlane;
	private Plane biggestPlane;

	public BattleFiels() {
		bigPlane = new BigPlane("��ɻ�", 1, 99, -2);
		smallPlane = new SmallPlane("С�ɻ�", 2, 98, -1);
		biggestPlane = new BiggestPlane("����ɻ�", 3, 97, -3);
	}
/**
 * ����ʱ��������һ��Player����because�̳���Plane
 * @param p ����һ��Plane����
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
