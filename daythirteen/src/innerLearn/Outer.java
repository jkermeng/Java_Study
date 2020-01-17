package innerLearn;

public class Outer {
	public int age = 11;
	private String name = "JimKean";
	protected String address = "天机";
//	Inner inner = new Outer().new Inner();
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}
	public int getAge() {
	
		return this.age;
	}
	public void takeInfo(){
		Inner inner = new Inner();
	
		System.err.println(inner.getOuterName());
		System.err.println(inner.getOuterAddress());
		System.err.println(inner.getOuterAge());
//		inner.getInfo();
	}

	
	private static class Inner extends A implements B {
		
		// static int age; 不能静态变量
		public String getOuterName() {
//			return this=.name;
			
			return null;
		}

		public String getOuterAddress() {
			return this.address;
		}

		public int getOuterAge() {
			return this.age;
		}

		@Override
		public void getInfo() {
			Outer out = new Outer();
			
			System.out.println(out.getAddress());
			System.out.println(out.getName());
			System.out.println(out.getAge());
			out.takeInfo();
		}
	
	}
	public Inner getInner(){
		return new Inner();
//		return inner;
	}

	public static void main(String[] args) {
				
		 Outer outer = new Outer();
		 outer.takeInfo();
		 outer.getInner();
		 Inner inner = new Outer.Inner();
		 inner.getInfo();
		 
		 

		


	}
}
