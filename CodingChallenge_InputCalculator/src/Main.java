import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            try {
                int userInput = myScanner.nextInt();
                sum += userInput;
                count++;
            } catch (InputMismatchException badUserData) {
                double average = (double)sum/count;
                long outputAverage = Math.round(average);
                System.out.println("SUM = " + sum + " AVG = " + outputAverage);
                break;
            }
        }
    }
}
