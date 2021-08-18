package bridgeLabz;

import java.util.Scanner;

public class Q6QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Divisor:");
	    int divident = sc.nextInt();
	    
	    Scanner dc = new Scanner(System.in);
	    System.out.print("Enter Divident:");
	    int divisor = dc.nextInt();
	    int quotient = divident / divisor;
	    System.out.println("Quotient when "+ divident +" * "+ divisor+ " is " +quotient );
	    
	    int remainder = divident % divisor;
	    System.out.println("remainder when "+ divident +" * "+ divisor+ " is " +remainder );
	    
	    
	}

}
