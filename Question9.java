package AssignmentSecond;

public class Question9 {
	public static void main(String[] args) {
     int num = 121;
     int originalNum = num;
     int reverse = 0;
     int remainder;
     
     while (num != 0) {
    	 remainder = num %10;
    	 reverse = reverse * 10 + remainder;
    	 num = num/10;
     }
     if (originalNum == reverse) {
    	 System.out.println("The number is Palindrome =" + originalNum);
     } else {
    	 System.out.println("The number is not palindrome =" + originalNum);
     }
		
	}

}
