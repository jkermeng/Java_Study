package dayaseven.quiz;

public class JianShiBu {

	public String compare(Role r, Role r2) {
		String result = null;
		int hand = r.getHand();
		int hand2 = r2.getHand();

		if (hand != 0 && hand2 != 0) {
			if (hand == 1 && hand2 == 1) {
				result = "ƽ��";
			}else if(hand ==1 && hand2 ==2){
				result = "Ӯ��";
				
			}else if(hand ==1 && hand2 ==3){
				result = "����";
			}else if(hand ==2 && hand2 ==1){
				result = "����";
			}else if(hand ==2 && hand2 ==2){
				result = "ƽ��";
			}else if(hand ==2 && hand2 ==3){
				result = "Ӯ��";
			}else if(hand ==3 && hand2 ==1){
				result = "Ӯ��";
			}else if(hand ==3 && hand2 ==2){
				result = "����";
			}else if(hand ==3 && hand2 ==3){
				result = "ƽ��";
			}
		} else {
			result = "��������";
		}

		return result;
	}

}
