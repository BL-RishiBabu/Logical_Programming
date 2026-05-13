import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 'START' to begin the stopwatch:");
        String startInput = scanner.next();
        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started...");

        // Capture End Time
        System.out.println("\nType 'STOP' to end the stopwatch:");
        String stopInput = scanner.next();
        long endTime = System.currentTimeMillis();

        long elapsedTime = calculateElapsedTime(startTime, endTime);
        printTime(elapsedTime);

        scanner.close();
    }

    public static long calculateElapsedTime(long start, long end) {
        return end - start;
    }

    public static void printTime(long timeInMillis) {
        double seconds = timeInMillis / 1000.0;
        System.out.println("\n----------------------------");
        System.out.println("Elapsed Time: " + timeInMillis + " milliseconds");
        System.out.println("Elapsed Time: " + seconds + " seconds");
        System.out.println("----------------------------");
    }
}