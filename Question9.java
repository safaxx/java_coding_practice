package java_tut;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is " + factorial);

        input.close();
	}

}
