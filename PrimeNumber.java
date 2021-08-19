package bridgeLabz;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
	    System.out.print("Enter no:");
	    int num = sd.nextInt();
	    int count=0;
	    
	    for(int i=2;i<=num-1;i++) {
	    	if(num%i==0) {
	    		 count++;
	    	}
	    	
	    }
	    if(count==0) {
	    	System.out.println(num+ " is prime");
	    }else {
	    	System.out.println("not prime");
	    }
	}

}
