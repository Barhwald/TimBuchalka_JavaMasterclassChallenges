import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        // double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number #" + i + ":");
            String numAsString = myScanner.nextLine();
            try {
                int numAsInt = Integer.parseInt(numAsString);
                // double numAsInt = Double.parseDouble(numAsString);
                sum += numAsInt;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number");
                i--;
            }
        }
        System.out.println(sum);
    }
}
