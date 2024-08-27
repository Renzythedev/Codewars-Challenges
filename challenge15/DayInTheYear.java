package challenge15;

public final class DayInTheYear {

    public static int getDays(int day) {
        return (day % 4 == 0) && (day % 100 == 0) && (day % 400 == 0) ? 366 : 365;
    }

    public static void main(String[] args) {
        System.out.println(getDays(2000));
        System.out.println(getDays(1974));
        System.out.println(getDays(-64));
        System.out.println(getDays(666));
        System.out.println(getDays(100));
    }
}
