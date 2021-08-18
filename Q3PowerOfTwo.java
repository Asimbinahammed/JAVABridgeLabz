package bridgeLabz;

import java.util.Scanner;

public class Q3PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number:");
	    int num = sc.nextInt();
		
	    for(int i=0;i<=num;i++) {
	    	double result=Math.pow(2,i);
	    	System.out.println("2^"+i + " = "+result);

	    }
	}

}
