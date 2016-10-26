import java.util.regex.Pattern;

/**
 * Created by TomBrereton on 21/10/2016.
 */
public class Date {

    private int day;
    private String month;
    private int year;

    public static final String[] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December"};

    public static final int[] monthLengths =
            {31, 28, 31, 30, 31,30,31,31,30,31,30,31};

    public Date(int day, String month, int year) {
        if (admissible(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean admissibleYear(int year) {
        return year > 0;
    }

    public static boolean admissibleMonth(String month){
        for (String m : months) {
            if (month.equals(m)){
                return true;
            }
        }
        return false;
    }

    public static boolean leapYear(int year){
        if (year%400 == 0){
            return true;
        } else if (year%100 == 0) {
            return false;
        } else if (year%4 ==0) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxNumberOfDaysPerMonth(String month, int year){
        if (month.equals(months[1]) && leapYear(year)){
            return 29;
        }
        for (int i = 0; i < 12; i++) {
            if (month.equals(months[i])) {
                return monthLengths[i];
            }
        }
        return 0;
    }

    public static boolean admissibleDay(int day, String month, int year) {

        return 1 <= day || day <= maxNumberOfDaysPerMonth(month,year);
    }

    public static boolean admissible(int day, String month, int year){
        return admissibleYear(year) && admissibleMonth(month) && admissibleDay(day,month, year);
    }
}

//    public static void main(String[] args) {
//        Date d1 = new Date(21, "October", 2016);
//        Date d2 = new Date(32, "October", 2016);
//    }
