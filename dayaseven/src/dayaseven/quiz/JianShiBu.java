package dayaseven.quiz;

public class JianShiBu {

	public String compare(Role r, Role r2) {
		String result = null;
		int hand = r.getHand();
		int hand2 = r2.getHand();

		if (hand != 0 && hand2 != 0) {
			if (hand == 1 && hand2 == 1) {
				result = "平局";
			}else if(hand ==1 && hand2 ==2){
				result = "赢了";
				
			}else if(hand ==1 && hand2 ==3){
				result = "输了";
			}else if(hand ==2 && hand2 ==1){
				result = "输了";
			}else if(hand ==2 && hand2 ==2){
				result = "平局";
			}else if(hand ==2 && hand2 ==3){
				result = "赢了";
			}else if(hand ==3 && hand2 ==1){
				result = "赢了";
			}else if(hand ==3 && hand2 ==2){
				result = "输了";
			}else if(hand ==3 && hand2 ==3){
				result = "平局";
			}
		} else {
			result = "有误输入";
		}

		return result;
	}

}
