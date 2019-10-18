public class dataclass
{

	public static void main(String [] args){
		
		int in = 128;
		byte ba = (byte)in;
		System.out.println("溢出后："+ba);
		
		char ca = 'a';
		char cA = 'A';
		int ia = ca;
		int iA = cA;

		System.out.println("a的自动转变int值:"+ ia + "a的自动转变int值:" + iA);

	}
	
}