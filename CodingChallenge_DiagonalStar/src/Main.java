public class Main {

    public static void main(String[] args) {

        printSquareStar(2);

    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            if (row == 1) {
                for (int i = 1; i <= number; i++) {
                    System.out.print("*");
                    if (i == number)
                        System.out.println();
                }
            } else if (row == number) {
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
            } else {
                for (int col = 1; col <= number; col++) {
                    if (col == 1) {
                        System.out.print("*");
                    } else if (col == number) {
                        System.out.print("*");
                    } else if (col == row) {
                        System.out.print("*");
                    } else if (col == number - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    if (col == number)
                        System.out.println();
                }
            }
        }
    }
}
