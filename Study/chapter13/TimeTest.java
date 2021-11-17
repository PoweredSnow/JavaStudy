import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimeTest {
    public static void main(String[] args) {
        // JDK1.8 新增的日期类型
        // 时间戳
        Instant now1 = Instant.now(); // 当前时间，同北京时间相差 8 小时
        System.out.println(now1);
        //获取当前时间的毫秒数
        long milli = System.currentTimeMillis();
        Instant someTime = Instant.ofEpochMilli(milli);
        System.out.println(someTime);

        // 时间的加减
        Instant beijing = now1.plus(8, ChronoUnit.HOURS);
        System.out.println(beijing);

        // LocalDate
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate anyDate = LocalDate.of(2020, 9, 11);
        System.out.println(anyDate);

        // with
        // 月份的第一天
        LocalDate firstDay = anyDate.with(
                TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDay);
        // 月份的最后一天
        LocalDate lastDay = anyDate.with(
                TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay);

        // 计算两个时间相差的天数
        long days = ChronoUnit.DAYS.between(anyDate, date);
        System.out.println("相差的天数：" + days);

        // 返回两个时间的先后顺序
        System.out.println(firstDay.isAfter(anyDate));

        // 时间的加减
        // 下周一
        LocalDate nextWeek = date.plusDays(7);
        System.out.println(nextWeek);

        // LocalTime
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime anyTime = LocalTime.of(8, 8);

        LocalTime time1 = time.plusMinutes(30);
        System.out.println(time1);

        LocalTime time2 = time.minusMinutes(30);
        System.out.println(time2);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String str = nextWeek.format(dtf);
        System.out.println(str);
        String str1 = "2020年10月01日";
        LocalDate dateone = LocalDate.parse(str1, dtf);
        System.out.println(dateone);
    }
}
