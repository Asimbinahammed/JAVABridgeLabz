package bridgelabz;

public class UC1PresentOrNot {

	//checking method
		public void empPresntCheck() {
			double empCheck = Math.floor(Math.random()*10)%2;
			if(empCheck==0) {
				System.out.println("Employee Present");
			}
			else {
				System.out.println("Employee absent");
			}
		}
		
		//main method
		public static void main(String[] args) {
			UC1PresentOrNot obj=new UC1PresentOrNot();
			obj.empPresntCheck();
			
		}
}
