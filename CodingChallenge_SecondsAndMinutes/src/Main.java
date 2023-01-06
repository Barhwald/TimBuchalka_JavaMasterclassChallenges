public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3345));
        System.out.println(getDurationString(44567, 56));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "wrong value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);


    }

    public static String getDurationString(int minutes, int seconds) {


        if (minutes < 0) {
            return "Minutes must be greater than zero";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds";
        }

        int hours = minutes / 60;
        int days = hours / 24;

        int remainingMinutes = minutes % 60;
        int remainingHours = hours % 24;

        return days + " days, " + remainingHours + " hours, " + remainingMinutes +
                " minutes and " + seconds + " seconds" ;

    }
}
