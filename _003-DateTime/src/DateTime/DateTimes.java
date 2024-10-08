
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package DateTime;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;


public class DateTimes {
    public static void run(String... args) {
        // LocalDates.defineDate();
        //LocaleDateTimeConversion.convertToDateTime();
        //LocaleDateTimeConversion.convertToEpochTime();
        LocalTimes.showLocalTimes();
        System.out.println("================================");
        Periods.showPeriods();
    }
}

class Periods {
    static void showPeriods() {
        /**
         *
         *      "P2Y"             -- Period.ofYears(2)
         *     "P3M"             -- Period.ofMonths(3)
         *     "P4W"             -- Period.ofWeeks(4)
         *     "P5D"             -- Period.ofDays(5)
         *     "P1Y2M3D"         -- Period.of(1, 2, 3)
         *     "P1Y2M3W4D"       -- Period.of(1, 2, 25)
         *     "P-1Y2M"          -- Period.of(-1, 2, 0)
         *     "-P1Y2M"          -- Period.of(-1, -2, 0)
         *
         */
        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P5Y");
        System.out.println(p5Yrs1 + ":" + p5Yrs2);
        System.out.println(p5Yrs3);
        System.out.println(p5Yrs4);
        System.out.println(p5Yrs5);
        System.out.println(p5Yrs6);

        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("-P5W");
        System.out.println(p5Yrs7);
        System.out.println(p5Yrs8);
        System.out.println(p5Yrs9);
        System.out.println(p5Yrs10);
        LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
        LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
        Period periodBetween = Period.between(carnivalStart, carnivalEnd);
        System.out.println(periodBetween);
    }
}

class LocalTimes {
    static void showLocalTimes() {
        LocalTime lt1 = LocalTime.of(0, 1, 2);
        LocalTime lt2 = LocalTime.of(0, 1);
        //LocalTime lt21 = LocalTime.of(Integer.MIN_VALUE, 1);
        //LocalTime lt22 = LocalTime.of(Integer.MAX_VALUE, 1);
        LocalTime lt3 = LocalTime.of(0, 1, 3, 12222222);
        LocalTime lt4 = LocalTime.of(11, 6, 3, 12222222);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);
        LocalTime localTimeParsed = LocalTime.parse("02:21:12.6655");
        System.out.printf("Parsed Time: %s\n", localTimeParsed);
        System.out.printf("Parsed Time: %s\n", localTimeParsed.getHour());
        System.out.printf("Parsed Time: %s\n", localTimeParsed.getMinute());
        System.out.printf("Parsed Time: %s\n", localTimeParsed.getSecond());
        System.out.printf("Parsed Time: %s\n", localTimeParsed.getNano());
    }


}

class LocaleDateTimeConversion {
    static void convertToDateTime() {
        LocalDate interviewDate = LocalDate.of(2016, 02, 28);
        System.out.println(interviewDate);
        System.out.println(interviewDate.atTime(16, 30));
        System.out.println(interviewDate.atTime(16, 30, 20));
        System.out.println(interviewDate.atTime(16, 30, 20, 300));
        System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));
    }

    static void convertToEpochTime() {
        LocalDate launchBook = LocalDate.of(2016, 2, 8);
        LocalDate aDate = LocalDate.of(1970, 1, 8);
        System.out.println(launchBook.toEpochDay());
        System.out.println(aDate.toEpochDay());
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
        System.out.println(ld4.isLeapYear());
        System.out.println(ld4.withMonth(1));
        //System.out.println(ld5);
        getDetailsOfDate(ld1);
        LocalDate myBirthDay = LocalDate.of(1976, 01, 02);
        findMyAge(myBirthDay);
    }

    private static void findMyAge(LocalDate dt) {
        Period age = Period.between(dt, LocalDate.now());
        System.out.printf("Today is %s\n", LocalDate.now());
        System.out.printf("Years:%d  Months:%d  Days:%d", age.getYears(), age.getMonths(), age.getDays());


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
