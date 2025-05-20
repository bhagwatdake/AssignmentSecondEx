package AssignmentSecond;

import java.util.Scanner;

public class Question10 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	//input from user
	System.out.println("Enter a number");
	int number = scn.nextInt();
	
	int original = number;
	int reversed = 0;
	
    //reversed the number
	while(number > 0) {
		int digit = number % 10;
		reversed = reversed* 10 +digit;
		number = number/10;
	}
	//check if originall is equal to reversed
	if(original == reversed) {
		System.out.println("The number is a palindrome");
	} else {
		System.out.println("The number is not a palindrome");
	}
	scn.close();
	
}


}

//10.	WAP to check if a given number is a palindrome.