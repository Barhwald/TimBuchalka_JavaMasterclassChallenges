import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int maxNumber = 0;
        int minNumber = 0;
        int track = 1;

        do {
            System.out.println("Enter a number or any character to quit");
            String numAsString = myScanner.nextLine();
            try {
                int numAsInt = Integer.parseInt(numAsString);
                if (track == 1 || numAsInt > maxNumber) {
                    maxNumber = numAsInt;
                }
                if (track == 1 || numAsInt < minNumber)
                    minNumber = numAsInt;
                track++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number");
                break;
            }
        } while (track <= 5);
        System.out.println("Your minimum number is " + minNumber);
        System.out.println("Your maximum number is " + maxNumber);
    }
}
