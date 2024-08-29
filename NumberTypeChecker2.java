import java.util.Scanner;

public class NumberTypeChecker2 {

    // Function to calculate the sum of factors of a number
    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Function to determine if the number is abundant, perfect, or deficient
    public static String checkNumberType(int number) {
        int sum = sumOfFactors(number);
        if (sum > number) {
            return "Abundant";
        } else if (sum < number) {
            return "Deficient";
        } else {
            return "Perfect";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is abundant, perfect, or deficient:");
        int number = scanner.nextInt();

        String result = checkNumberType(number);
        System.out.println("The number " + number + " is " + result + ".");
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
