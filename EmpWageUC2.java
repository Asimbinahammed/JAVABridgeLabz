package bridgelabz;

public class EmpWageUC2 {
	
		//checking method
		public double empPresntCheck() {
			double empCheck = Math.floor(Math.random()*10)%2;
			if(empCheck==0) {
				System.out.println("Employee Present");
			}
			else {
				System.out.println("Employee absent");
			}
			return empCheck;
		}
		
		public void dailyWageEmployee(double check) {
			int wage=20;
			int hour=8;
			if(check==0) {
				int dailyWage=wage*hour;
				System.out.println("Daily wage : "+ dailyWage);
			}
		}
				
		//main method
		public static void main(String[] args) {
			EmpWageUC2 obj=new EmpWageUC2();
			double check=obj.empPresntCheck();
			obj.dailyWageEmployee(check);
		
		}
}


