package AssignmentSecond;

public class Question11 {
    public static void main(String[] args) {
        int number = 153;
        int a = number;
        int result = 0;

        // Count the number of digits
        int digit = 0;
        int temp = number;
        while (temp > 0) {
            digit++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = number;
        while (temp > 0) {
            int rem = temp % 10;
            result += Math.pow(rem, digit);
            temp /= 10;
        }

        // Check if Armstrong
        if (a == result) {
            System.out.println("Armstrong number = " + a);
        } else {
            System.out.println("Not an Armstrong number = " + a);
        }
    }
}


//11.	WAP to check if 153 is an Armstrong number.
