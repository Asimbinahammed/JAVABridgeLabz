package bridgeLabz;

public class UC5Lessthan100 {
	public static void main(String[] args) {
		int position=0;
		while(position<=100) {
		int snake= (int) Math.floor(Math.random() * 10) %3;
		int check =(int) Math.floor(Math.random() * 10) %7;
		if(snake==1) {
			position =position + check;
			if(position>100) {
				position =position - check;

			}
		}
		else if(snake==2)  {
			position = position - check;
			if(position<0) {
				position=0;
			}
		}
		else {
		position=position+check;
		}
		System.out.println("current postion  is: " + position);
	}}
}



