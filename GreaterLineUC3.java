package employyePackage;

public class GreaterLineUC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=10;
		int x2=10;
		int y1=10;
		int y2=10;
		
		int p1=10;
		int p1=10;
		int q1=10;
		int q2=10;
		
		int line1=0;
		int line2=0;
		
		if(x1>p1) {
		line1++;
		}else {
			line2++;
		}
		
		if(x2>p2) {
			line1++;
			}else {
				line2++;
			}
			
		if(y1>q1) {
			line1++;
			}else {
				line2++;
			}
			
		if(y2>q2) {
			line1++;
			}else {
				line2++;
			}
			
		if(line1 > line2) {
			System.out.println("Line 1 is greater");
		}else {
			System.out.println("line2 is greater");
		}
		
	}

}
