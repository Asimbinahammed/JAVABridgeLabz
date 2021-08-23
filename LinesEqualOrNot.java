package bridgelabz;

import java.util.Scanner;

public class LinesEqualOrNot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int x1 = sc.nextInt();

		Scanner scd = new Scanner(System.in);
	    System.out.print("Enter x2:");
	    int x2 = scd.nextInt();

		Scanner scs = new Scanner(System.in);
	    System.out.print("Enter y1:");
	    int y1 = scs.nextInt();

		Scanner sca = new Scanner(System.in);
	    System.out.print("Enter y2:");
	    int y2 = sca.nextInt();
	    
	    //2nd line inputs
	    Scanner scq = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int p1 = scq.nextInt();

		Scanner scdq = new Scanner(System.in);
	    System.out.print("Enter x2:");
	    int p2 = scdq.nextInt();

		Scanner scsq = new Scanner(System.in);
	    System.out.print("Enter y1:");
	    int q1 = scsq.nextInt();

		Scanner scaq = new Scanner(System.in);
	    System.out.print("Enter y2:");
	    int q2 = scaq.nextInt();
	    
	    LinesEqualOrNot obj=new LinesEqualOrNot();
	    double length1=obj.calcu(x1,x2,y1,y2);
	    double length2=obj.calcu(p1,p2,q1,q2);
	    obj.compare(length1,length2);
	}
	
	public double calcu(int x1,int x2,int y1,int y2) {
		double length=(Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2));
		System.out.println("Length is : "+length);
		return length;
	}
	
	public void compare(double length1, double length2) {
		if(length1 > length2) {
			System.out.println("1st line is greater");
		}else if(length1==length2) {
			System.out.println("both lines are equal");
		}else {
			System.out.println("2nd line is greater");
		}
	}

}
