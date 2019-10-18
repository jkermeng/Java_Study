class frushjuice
{
	enum frushjuicesize{small,middle,biggest}
	frushjuicesize size;
}

public class juicetest
{
	public static void main(String [] args){
	frushjuice juice = new frushjuice();
	juice.size = frushjuice.frushjuicesize.small;
	}
}