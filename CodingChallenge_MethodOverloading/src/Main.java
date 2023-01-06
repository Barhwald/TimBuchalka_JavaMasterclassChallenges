public class Main {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(8,0));

    }

    public static double convertToCentimeters(int inchesToCentimeters) {
        return inchesToCentimeters * 2.54d;
    }

    public static double convertToCentimeters(int feet, int inches) {

        return convertToCentimeters((feet * 12) + inches);
    }

}
