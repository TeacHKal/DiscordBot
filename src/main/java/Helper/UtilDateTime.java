package Helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by teach on 4/30/2017.
 * email: teach.inbox@gmail.com
 */
public class UtilDateTime {
    /**
     *
     * Return date style 1
     */
    public static String getDateFormat1(Date date) throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy | EEEE", Locale.ENGLISH);
        String dateString = format.format(date);
        return dateString;
    }
    /**
     *
     * Return time style 1
     */
    public static String getTimeFormat1(Date date) throws ParseException {
        DateFormat format = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        String dateString = format.format(date);
        return dateString;
    }
    /**
     * Return date and time with styles 11.
     * Example#1 getDateTime35 returns Date style 3 and Time style 5
     * Example#2 getTimeDate63 returns Time style 6 and Date style 3
     *
     * @return String
     * example: 11:32 PM | April 30, 2017 | Sunday
     */
    public static String getTimeDate11(Date date) throws ParseException {
        String dateTime = getTimeFormat1(date) + " | " + getDateFormat1(date);

        return dateTime.toString();
    }


    /**
     * Parse String into Date
     * @example "2017-04-30 09:58:19"
     * @param dateString
     * @return Date
     * @throws ParseException
     */
    public static Date parseDateFormat1(String dateString) throws ParseException {
        String format = "yyyy-M-dd hh:mm:ss";
        DateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
        Date date = dateFormat.parse(dateString);
        return date;
    }
}
