package dayseven.quiz;

/**
 *
 *
 * @Author JKermeng
 * @Date 2019年10月14日
 * @Version 1.0.0
 */
public class test {

	public static void main(String[] args) {
		/**
		 * 4、编写一个类，包含一个排序的静态方法Sort(), 当传入的是一个整形数组，按照从小到大的顺序输出，
		 * 如果传入的是一个字符串，就将字符串反序输出。 PS：考虑下函数重载
		 */
		int num[] = { 1, 3, 4, 5, 6, 72, 2, 11, 10 };
		String a = "abcd";
		ArrarySry arrarySry = new ArrarySry(num);
		arrarySry.sorts();
		arrarySry.sorts(a);

		/**
		 * 定义长方形类，含： 属性：宽、高（整型）； 方法：求周长、面积； 构造方法3个： （1）无参——宽、高默认值为1；
		 * （2）1个参数——宽、高均为参数值； （3）2个参数——宽、高各为参数值。 要求：建立测试类进行测试。
		 */

		SquareMath zhouchang = new SquareMath(3);
		SquareMath mianji = new SquareMath(3, 2);
		System.out.println(zhouchang.mmath());
		System.out.println(zhouchang.rmath());
		System.out.println(mianji.rmath());
		System.out.println(mianji.mmath());
		/**
		 * 5、定义一个计算器类
			要求：
				a.	计算器类里有两个整数私有属性a和b，属性通过构造函数去赋值。
				b.	计算器类里定义4个方法：加、减、乘、除，分别返回计算后的结果。
		 */
			Calulate calulate = new Calulate(4,5);
			System.out.println(calulate.jia());
			System.out.println(calulate.jian());
			System.out.println(calulate.cheng());
			System.out.println(calulate.chu());
		
	}

}
