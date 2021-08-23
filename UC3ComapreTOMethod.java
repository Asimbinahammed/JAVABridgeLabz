package bridgelabz;

import java.util.Scanner;

public class UC3ComapreTOMethod {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int x1 = sc.nextInt();
	    sc.close();  

		Scanner scd = new Scanner(System.in);
	    System.out.print("Enter x2:");
	    int x2 = scd.nextInt();
	    scd.close();  

		Scanner scs = new Scanner(System.in);
	    System.out.print("Enter y1:");
	    int y1 = scs.nextInt();
	    scs.close();  

		Scanner sca = new Scanner(System.in);
	    System.out.print("Enter y2:");
	    int y2 = sca.nextInt();
	    sca.close();  
	    
	    //2nd line inputs
	    Scanner scq = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int p1 = scq.nextInt();
	    scq.close();  

		Scanner scdq = new Scanner(System.in);
	    System.out.print("Enter x2:");
	    int p2 = scdq.nextInt();
	    scdq.close();  

		Scanner scsq = new Scanner(System.in);
	    System.out.print("Enter y1:");
	    int q1 = scsq.nextInt(); 
	    scsq.close();  

		Scanner scaq = new Scanner(System.in);
	    System.out.print("Enter y2:");
	    int q2 = scaq.nextInt();
	    scaq.close();  
	    
	    UC3ComapreTOMethod obj=new UC3ComapreTOMethod();
	    int length1=(int)obj.calcu(x1,x2,y1,y2);
	    int length2=(int)obj.calcu(p1,p2,q1,q2);
	    int res = length1.compareTo(length2);
	    obj.compare(length1,length2);
	}
	
	public double calcu(int x1,int x2,int y1,int y2) {
		double length=(Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2));
		System.out.println("Length is : "+length);
		return length;
	}
	
	public void compare(float num1, float num2) {
		
        System.out.println(num1.compareTo(num2));          

		 num1.compareTo(num2);
		if(comp1<0) {
        	System.out.println("2nd line is greater");
        }else if(comp1>0) {
        	System.out.println("1st line is greater");        	
        }else {
        	System.out.println("Equal lines");
        }

	}

}

