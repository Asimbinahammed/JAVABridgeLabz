package bridgeLabz;

public class Q1FlipCoinPercentage {

	public static void main(String[] args) {
		int tail=0,head=0,percentageHead=0,percentageTail=0;
		for(int i=0;i<=9;i++) {
		int flip= (int) Math.floor(Math.random() * 10) %2;
		if(flip==0) {
			tail++;
			
		}else {
			head++;
		}
		
		}
		percentageHead=head * 10 ;
		percentageTail=tail * 10;
		System.out.println("Percentage of head appears is : " + percentageHead);
		System.out.println("Percentage of tail appears is : " + percentageTail);
		
		
	}

}
