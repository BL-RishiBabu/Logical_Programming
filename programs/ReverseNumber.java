import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedResult = reverse(number);
        System.out.println("The reversed number is: " + reversedResult);
        
        scanner.close();
    }

    public static int reverse(int num) {
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }

        return reverse;
    }
}