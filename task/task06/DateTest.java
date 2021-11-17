package task06;

import java.util.*;
import java.text.*;

public class DateTest {
    Date stringToDate(String arg) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            date = sdf.parse(arg);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
