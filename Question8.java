package AssignmentSecond;

public class Question8 {
	public static void main(String[] args) {
		int a = 1234;
		int rev = 0;
		
		while(a !=0) {
			int digit = a % 10;
			rev = rev * 10 +digit;
			a = a/10;
		}
		System.out.println("Reversed Number =" + rev);
	}

}

//8.	WAP to print the reverse of 1234.

