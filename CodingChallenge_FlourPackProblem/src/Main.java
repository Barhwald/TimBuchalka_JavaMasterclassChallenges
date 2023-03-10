public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 8));
        System.out.println(canPack(2, 4, 9));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if ((bigCount * 5) + smallCount >= goal && goal % 5 <= smallCount) {
            return true;
        }
        return false;
    }
}
