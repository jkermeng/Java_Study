package hidename;

class InterImp extends ABSTest implements ITest {

	@Override
	public void showInters() {
		System.out.println("�����ڲ���");

	}

	@Override
	public void showABSTest() {

		System.out.println("�̳�ABSTest����");
	}

}

abstract class ABSTest {
	public abstract void showABSTest();
}

public class Niming {
	public static void main(String[] args) {
		// Itests it = new Itests() {
		// @Override
		// public void showInter() {
		// System.out.println("�����ڲ���");
		// }
		// };
		// it.showInter();
		new ABSTest() {

			@Override
			public void showABSTest() {
				System.out.println("���،�ABSTest");
			}
		}.showABSTest();

		new InterImp() {
			private void sysout() {
				System.out.println("�����ʲô����");
			}
		}.sysout();
		new ITest() {
			@Override
			public void showInters() {
				System.out.println("�������ڲ���");

			}
		}.showInters();
		Exception exception = new Exception() {
//			ֻ����д������ڷֺ��� ������ã��¶���ֻ���ڷֺ�ǰ�����ź�������
			public String getMessages() {
				return "Message";
			}
		};
//		exception.
		System.out.println(exception.getMessage());
		Exception exception2 = new Exception();
		
	}

}
