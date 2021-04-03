package LeapYear;

public class LeapYear {
    public static Boolean isLeapYear(int year) {
        if (year <= 0) return false;
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(-2020));
    }
}
