package bridgelabz;

import java.util.Scanner;

public class UC4LinesEquals {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int x1 = sc.nextInt();

	    System.out.print("Enter x2:");
	    int x2 = sc.nextInt();

	    System.out.print("Enter y1:");
	    int y1 = sc.nextInt();

	    System.out.print("Enter y2:");
	    int y2 = sc.nextInt();
	    
	    //2nd line inputs
	    System.out.print("Enter x1:");
	    int p1 = sc.nextInt();

	    System.out.print("Enter x2:");
	    int p2 = sc.nextInt();

	    System.out.print("Enter y1:");
	    int q1 = sc.nextInt(); 

	    System.out.print("Enter y2:");
	    int q2 = sc.nextInt();
	    
	    UC4LinesEquals obj=new UC4LinesEquals();
	    Double length1=obj.calcu(x1,x2,y1,y2);
	    Double length2=obj.calcu(p1,p2,q1,q2);
	    
	    if (length1.equals(length2)) {
	    	System.out.println("Equal lines");
	    }
	    else if (length1.compareTo(length2)<0) {
        	System.out.println("2nd line is greater");        
	     }else {
	    	 System.out.println("1st line is greater");
	        }
	    	
	    }
	
	
	public double calcu(int x1,int x2,int y1,int y2) {
		double length=(Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2));
		System.out.println("Length is : "+length);
		return length;
	}
}
