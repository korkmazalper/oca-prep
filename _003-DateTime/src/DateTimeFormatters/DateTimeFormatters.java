
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package DateTimeFormatters;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatters {
    public static void main(String[] args) {
        showDateTimeFormatterDefine();
        showDateTimeFormatterAlternative();
    }

    static void showDateTimeFormatterDefine() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
        System.out.println(formatter1);
        System.out.println(formatter2);
        System.out.println(formatter3);
        System.out.println(formatter4);
        LocalDateTime datetime = LocalDateTime.now();
        datetime.format(formatter1);
        System.out.println(datetime);
    }

    static void showDateTimeFormatterAlternative() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(dateTimeFormatter));
        System.out.println(ldt.format(dateTimeFormatter1));
    }
}
