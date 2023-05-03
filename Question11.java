package java_tut;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int firstNum = 0;
        int secondNum = 1;

        System.out.print("Fibonacci sequence up to " + num + ": " + firstNum + " " + secondNum + " ");

        while (secondNum < num) {
            int nextNum = firstNum + secondNum;
            System.out.print(nextNum + " ");

            firstNum = secondNum;
            secondNum = nextNum;
        }

        input.close();
	}

}
