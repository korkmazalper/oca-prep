
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package DateTime;

import java.time.LocalDate;
import java.time.Month;


public class DateTimes {
    public static void run(String... args) {
        LocalDates.defineDate();
    }
}

class LocalDates {
    static void defineDate() {
        LocalDate ld1 = LocalDate.of(2022, 1, 15);
        LocalDate ld2 = LocalDate.of(2022, Month.DECEMBER, 12);
        LocalDate ld3 = LocalDate.now();
        LocalDate ld4 = LocalDate.parse("2028-12-14");  // should be "XXXX-XX-XX" format
        //LocalDate ld5 = LocalDate.parse("2028-1-4");// DatetimeParseException
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld4.isAfter(ld1));
        System.out.println(ld4.isBefore(ld1));
        //System.out.println(ld5);
        getDetailsOfDate(ld1);
    }

    static void getDetailsOfDate(LocalDate ld) {
        System.out.println("==================");
        System.out.println(ld + " Year " + ld.getYear());
        System.out.println(ld + " Day " + ld.getDayOfYear());
        System.out.println("===============");
        System.out.println(ld + "Month " + ld.getMonth());
        System.out.println(ld + "Month " + ld.getMonthValue());
        System.out.println(ld + "Day of the Month " + ld.getDayOfMonth());
        System.out.println("====================");
        System.out.println(ld + "Day of the Week " + ld.getDayOfWeek());
        System.out.println(ld + "Era " + ld.getEra());
        System.out.println(ld + "Ch: " + ld.getChronology());

    }


}
