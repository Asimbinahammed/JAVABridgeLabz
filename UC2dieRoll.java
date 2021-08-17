package bridgeLabz;

public class UC2dieRoll {
	public static void main(String[] args) {
		
		int check =(int) Math.floor(Math.random() * 10) %6 +1;
		
		System.out.println("Current position is :" + check);
	}
}
