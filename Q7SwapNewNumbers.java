package bridgeLabz;

import java.util.Scanner;

public class Q7SwapNewNumbers {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter x:");
	    int x = sc.nextInt();
	    
	    Scanner sd = new Scanner(System.in);
	    System.out.print("Enter y:");
	    int y = sd.nextInt();
		
		
		System.out.println("before swap");
		System.out.println("x = "+ x);
		System.out.println("y = "+y);
		
		int temp =x;
		x=y;
		y=temp;
		System.out.println("After swap");
		System.out.println("x = "+ x);
		System.out.println("y = "+y);
		
	}

}
