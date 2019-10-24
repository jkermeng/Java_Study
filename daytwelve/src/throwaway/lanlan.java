package throwaway;

public class lanlan {

	private static lanlan ll;
	public static lanlan getlanlan (){
		if(ll==null){
			ll = new lanlan();
		}
		return ll;
	}
	private lanlan(){	
	}

}