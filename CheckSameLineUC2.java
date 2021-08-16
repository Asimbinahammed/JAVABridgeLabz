package employyePackage;

public class CheckSameLineUC2 {
	public static void main(String[] args) {
		int x1=10;
		int x2=20;
		int y1=30;
		int y2=40;
		
		int p1=10;
		int p2=20;
		int q1=30;
		int q2=40;
		
		if(x1==p1 && x2==p2 && y1==q1 && y2==q2) {
			System.out.println("Lines are equal");
		}else
			System.out.println("lines are not equal");

	}
}
