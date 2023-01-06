public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));

    }

    public static boolean isOdd(int number) {

        return number > 0 && number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {

        int sumOfOdd = 0;

        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sumOfOdd += i;
                }
            }
            return sumOfOdd;
        }
        return -1;
    }

}
