package dayaseven.charater;
/**
*
*
*@Author JKermeng
*@Date 2019��10��12��
*@Version 1.0.0
*/
public class charater {

	private String sfz = null;

	public String getSfz() {
		return sfz;
	}

	public void setSfz(String sfz) {
		this.sfz = sfz;
	}
	
	public void brithday(){
		String b = sfz.substring(6,14);
		System.out.println(b);
	}

	public static void main(String[] args) {
		charater charater= new charater();
		charater.setSfz("444444198010101111");
		charater.brithday();
	}
}
