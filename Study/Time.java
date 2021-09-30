public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void printTime () {
        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
    }

    public int minusTime(Time time) {
        int sumSeconds1 = this.hour * 3600 + this.minute * 60 + this.second;
        int sumSeconds2 = time.hour * 3600 + time.minute * 60 + time.second;
        int result = sumSeconds2 - sumSeconds1;
        return result;
    }
}
