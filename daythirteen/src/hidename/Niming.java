package hidename;

class InterImp extends ABSTest implements ITest {

	@Override
	public void showInters() {
		System.out.println("匿名内部类");

	}

	@Override
	public void showABSTest() {

		System.out.println("继承ABSTest方法");
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
		// System.out.println("匿名内部类");
		// }
		// };
		// it.showInter();
		new ABSTest() {

			@Override
			public void showABSTest() {
				System.out.println("已重寫ABSTest");
			}
		}.showABSTest();

		new InterImp() {
			private void sysout() {
				System.out.println("这个是什么方法");
			}
		}.sysout();
		new ITest() {
			@Override
			public void showInters() {
				System.out.println("简化匿名内部类");

			}
		}.showInters();
		Exception exception = new Exception() {
//			只能重写后可以在分号外 对象调用，新定义只能在分后前大括号后点出方法
			public String getMessages() {
				return "Message";
			}
		};
//		exception.
		System.out.println(exception.getMessage());
		Exception exception2 = new Exception();
		
	}

}
