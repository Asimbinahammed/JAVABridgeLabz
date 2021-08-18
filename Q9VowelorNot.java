package bridgeLabz;

import java.util.Scanner;

public class Q9VowelorNot {

	static void vowel_or_not(char y) {
		if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || y=='A' || y=='E' || y=='I' || y=='O'|| y=='U' ) {
			System.out.println(y+" is vowel");
		}else {
			System.out.println(y+" is not vowel");
		}
	}
	public static void main(String[] args) {
		vowel_or_not('e');
		vowel_or_not('q');
		 
	}

}
