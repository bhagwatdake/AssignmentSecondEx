package AssignmentSecond;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter  any table number  for the multiplication");
		int num = scn.nextInt();
		
		for (int a = 1; a<=10; a ++) {
			System.out.println("num =" +(num *a));
		}
		scn.close();
	}

}
//7.	WAP to print any multiplication table for a given number.

