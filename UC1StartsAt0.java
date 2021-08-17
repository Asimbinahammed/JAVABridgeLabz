package bridgeLabz;

public class UC1StartsAt0 {

	public static void main(String[] args) {
		int position=0;
		int check =(int) Math.floor(Math.random() * 10) %6 +1;
		position=position + check;
		System.out.println("Current position is :" + position);
	}

}
