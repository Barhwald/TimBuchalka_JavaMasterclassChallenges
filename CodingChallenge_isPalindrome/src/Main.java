public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));



    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int checkedNumber = number;


        while (checkedNumber != 0) {
            reverse += checkedNumber % 10;
            reverse *= 10;
            checkedNumber /= 10;
        }
        reverse /= 10;

        System.out.println(reverse);

        return number == reverse;



    }

}
