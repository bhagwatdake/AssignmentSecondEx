package AssignmentSecond;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter  a number =");
		int a  = scn.nextInt();
		int count = 0;
		
		for (int i = 1; i <= a; a++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime number is =" +a);
		} else {
			System.out.println("Not a prime numbber =" +a);
		}
		scn.close();
	}

}
//1.	WAP to check if a number is even or odd.

