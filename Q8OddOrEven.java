package bridgeLabz;

import java.util.Scanner;

public class Q8OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter num:");
	    int x = sc.nextInt();
	    
	    if(x%2==0) {
	    	System.out.println(x+" is even");
	    }else {
	    	System.out.println(x+" is odd");
	    	
	    }
	}

}
