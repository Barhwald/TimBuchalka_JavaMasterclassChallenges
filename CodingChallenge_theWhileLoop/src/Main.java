public class Main {

    public static void main(String[] args) {

        int i = 5;
        int evenNumbersFound = 0;
        int loops = 0;

        while (i <= 20) {
            loops++;
            if (isEvenNumber(i)) {
                System.out.println(i);
                evenNumbersFound++;
                if (evenNumbersFound == 5) {
                    break;
                }
            }
            i++;
        }
        System.out.println(evenNumbersFound + " even number found");
        System.out.println(loops - evenNumbersFound + " odd numbers were found");

    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }

}
