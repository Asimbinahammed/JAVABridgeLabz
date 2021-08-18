package bridgeLabz;

import java.util.Scanner;

public class Q4PrimeFactorisation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number:");
	    int num = sc.nextInt();
	    int i=2;
	    int s;
	    while(i*i<=num) {
	    	if(num%i==0) {
	    		System.out.println(i);
	    		num=num/i;
	    			
	    		
	    	}else {
	    		i++;
	    	}
	    }
	    System.out.println(num);
	}

}
