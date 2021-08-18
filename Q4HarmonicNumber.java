package bridgeLabz;

import java.util.Scanner;

public class Q4HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number:");
	    int num = sc.nextInt();
	    double sum=0;
	    for(int i=1;i<=num;i++) {
	    	 sum=((float)1 / i )+sum ;
	    	System.out.println(sum);
	    }
	}

}
