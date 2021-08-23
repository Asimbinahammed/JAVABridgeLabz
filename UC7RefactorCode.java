package bridgelabz;
import java.util.Scanner;


public class UC7RefactorCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int x1 = sc.nextInt();

		Scanner scd = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int x2 = scd.nextInt();

		Scanner scs = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int y1 = scs.nextInt();

		Scanner sca = new Scanner(System.in);
	    System.out.print("Enter x1:");
	    int y2 = sca.nextInt();
	    
	    UC7RefactorCode obj=new UC7RefactorCode();
	    obj.calcu(x1,x2,y1,y2);
	}
	
	public void calcu(int x1,int x2,int y1,int y2) {
		double length=(Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2));
		System.out.println("Length is : "+length);
		
	}

}
