package bridgeLabz;
import java.util.Scanner;

public class Q2LeapYear {

	public static void main(String[] args) {
	int count=0;
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter any year:");
    int year = sc.nextInt();
   int newYear=year;
    //boolean flag=false;
    for (; year != 0; year /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
    
      	if (count >= 4) {
    		System.out.println("Contain 4 digits or more");
    		if((newYear%400==0)||((newYear%4==0)&&(newYear%100!=0))) {
    			System.out.println(newYear + " is leap year");
    		}else {
    			System.out.println("Not leap year");
    		}
    	}
    	else {
    		System.out.println("not having 4 digits");
    	}


      	
	}
    
}