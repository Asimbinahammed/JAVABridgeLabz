package bridgeLabz;

import java.util.Scanner;

public class Q10Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 1st num:");
	    int x = sc.nextInt();
	    
	    Scanner sd = new Scanner(System.in);
	    System.out.print("Enter 2nd num:");
	    int y = sd.nextInt();
	    
	    Scanner sr = new Scanner(System.in);
	    System.out.print("Enter 3rd num:");
	    int z = sr.nextInt();
	    
	    if(x>y && x>z) {
	    	System.out.println(x+" is largest");
	    }else if(y>x && y>z) {
	    	System.out.println(y+" is largest");
	    }
	    else {
	    	System.out.println(z+" is largest");
	    }
	    
	}

}
