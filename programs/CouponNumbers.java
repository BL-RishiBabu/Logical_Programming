import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class CouponNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of distinct coupons (N): ");
        int n = scanner.nextInt();

        int totalRandomNumbers = collectCoupons(n);
        System.out.println("Total random numbers needed to get " + n + " distinct coupons: " + totalRandomNumbers);

        scanner.close();
    }

    public static int generateRandomNumber(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

    public static int collectCoupons(int n) {
        Set<Integer> distinctCoupons = new HashSet<>();
        int count = 0;

        while (distinctCoupons.size() < n) {
            int newCoupon = generateRandomNumber(n * 10); 
            count++;
            distinctCoupons.add(newCoupon);
        }

        return count;
    }
}