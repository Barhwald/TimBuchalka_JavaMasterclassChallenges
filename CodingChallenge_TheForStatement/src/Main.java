public class Main {

    public static void main(String[] args) {

//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
//        System.out.println("33 is " + (isPrime(33) ? "" : "NOT ") + "a prime number");
//        System.out.println("34 is " + (isPrime(34) ? "" : "NOT ") + "a prime number");

        int primeCounter = 0;

        for (int j = 10; primeCounter < 3 && j <= 50; j++) {

            if (isPrime(j)) {
                System.out.println(j);
                primeCounter++;
            }
        }
        System.out.println("Total number of prime numbers is " + primeCounter);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
