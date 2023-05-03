package java_tut;

public class Quesiton13 {

	public static void main(String[] args) {
        String numbers = "10 20 30";
		
		String [] reverseNum = numbers.split(" ");
		for(int i=2; i>=0;i--) {
			System.out.print(reverseNum[i]+ " ");

			
		}
	}

}
