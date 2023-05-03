package java_tut;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }

        input.close();
	}

}
