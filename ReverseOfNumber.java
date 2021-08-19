package bridgeLabz;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
	    System.out.print("Enter no:");
	    int num = sd.nextInt();
	    int digits=0;
	    int length = String.valueOf(num).length();
	    
	    for(int i=1;i<=length;i++) {
	    	int temp=num%10;
	    	digits=digits*10+temp;
	    	num=num/10;
	    }
	    System.out.println(digits);
	}

}
