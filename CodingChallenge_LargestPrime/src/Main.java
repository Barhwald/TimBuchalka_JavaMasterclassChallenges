public class Main {

    public static void main(String[] args) {

//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(16));

    }

    public static int getLargestPrime(int number) {

        int primeDivisor = 0;
        if (number < 2) {
            return -1;
        }

        int i = 2;
        while (i <= number) {

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && number % i == 0) {
                primeDivisor = i;
            }
            i++;
        }
        return primeDivisor;
    }

//    public static boolean isPrime(int num) {
//        if (num >= 2) {
//            for (int i = 2; i < num / 2; i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }
}
