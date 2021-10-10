public class Test {

    public static double abs(double value) {
        return Double.longBitsToDouble(
            Double.doubleToRawLongBits(value) & 0x7fffffffffffffffL);
    }
    public static void main(String[] args) {

        double x = -0.0;
        if (1 / abs(x) < 0) {
            System.out.println("oops!");
        }
        System.out.println("oops");

        /*
        Time time1 = new Time();
        Time time2 = new Time();

        time1.setHour(10);
        time1.setMinute(0);
        time1.setSecond(0);
        time2.setHour(14);
        time2.setMinute(30);
        time2.setSecond(0);
        time1.printTime();
        time2.printTime();
        System.out.println(time1.minusTime(time2));
        */
    }
}
