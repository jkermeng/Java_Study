package daythree.BanLiang;

import java.util.Scanner;

public class test {	

	public static void main(String[] args) {

		int a = 1;
		int b = 10;
		//int g = (--a)+(a++)+(b--)+(b--)+(--b)+(a+b)+(++a)+(b--)-(a++);
				//0    0     10     9     7     8     2     7      2
		
		System.out.println(a);//3
		System.out.println(b);//6
		//System.out.println(g);//41
		
		int d = a--;
		System.out.println("d"+d);
		System.out.println("/*************************");
		
		int i1 = 10;
		i1 += 10;//20
		System.out.println(i1);
		i1*= 10;//200
		System.out.println(i1);
		i1 %=3; //i1 = i1 %3 ;  200/3 =2
		System.out.println(i1);
		
		
		int qw = 10;
		int wq = 30;
		System.out.println(qw == wq);
		System.out.println(qw!=wq);
		System.out.println(qw>wq);
		System.out.println(qw<wq);
		System.out.println(qw>=wq);
		System.out.println(qw<=wq);
		System.out.println();
		System.out.println("********************************");
		System.out.println(true==false);
		System.out.println(true!=false);
		System.out.println(true ^ false);
		System.out.println(true != false);
		System.out.println(false|true);
		System.out.println(true||false);
		System.out.println(true&false);
		System.out.println(true&&false);

		System.out.println("------------------------------------");
		System.out.println("------------------------------------");

		int xy =1;
		int yx = 0;
		while(true)
		{
			xy =xy+1;
			if(xy==100){
			break;
			}
			yx = yx+xy;
		}
		
		System.out.println(yx+"sss"+xy);
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");

		System.out.println("------------------------------------");
		
		
		int x =300;
		int y = 500;
		
		int i = (x>y)?qw:wq;
		System.out.println(i);

		if (x > y)
		{
			System.out.println("x大于y成立");
			
		}
		else
		{
			System.out.println("x小于y成立");
		}
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
		
		System.out.println(a+"."+b);
		String str = (a>b)?"a小于b":"a大于b";				
		
		System.out.println(str);
		
		System.out.println("-*+++++++++++++++++++++++++++++++++++");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("A.A/nB.B/nC.C/n5.5");
		String sm = sc.next();
		switch (sm) {
		case "A":
			System.out.println("A来了");
			break;
		 case "B":
			 System.out.println("B来了");
			break;
		default:
			break;
		}
		System.out.println("-*+++++++++++++++++++++++++++++++++++");
		System.out.println("输入分数");
		int number = sc.nextInt();
		if (number != 0 )
		{
			if (number >= 90 && number <= 100)
			{
				System.out.println("优秀");
				
			}else if (number >= 80 && number <= 89)
			{
				System.out.println("良好");

			}else if (number >= 70 && number <= 79)
				{
				System.out.println("中等");

				}
			else if (number >= 60 && number <= 69)
			{
				System.out.println("合格");
			}
			else 
				System.out.println("不合格");
		}
			
		
		
		System.out.println("-*+++++++++++++++++++++++++++++++++++");

		Scanner ssc = new Scanner(System.in);
		
		
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("输入账号");
		int number2 = ssc.nextInt();
		System.out.println("输入密码");

		int password = ssc.nextInt();
		int n_comfirm = 123;
		int p_comfirm = 123;
		while(true)
		{
		if (number2 != n_comfirm || password != p_comfirm)
		{
				
					System.out.println("请重新输入账号");
					
					return;
		}
		else
		{
				System.out.println("登入成功");
				break;
			}
		
		}

}
}
