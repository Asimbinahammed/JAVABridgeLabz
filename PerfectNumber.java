package bridgeLabz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
	    System.out.print("Enter no:");
	    int num = sd.nextInt();
	    int sum=0;
	    for(int i=1;i<num;i++) {
	    	if(num%i==0) {
	    		sum+=i;
	    	}
	    }
	    if(sum==num) {
	    	System.out.println(num + " is perfect number");
	    }
	    else {
	    	System.out.println("not a perfect number");
	    }
	}

}
