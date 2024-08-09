
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Parse {
    public static void main(String[] args) {
        showParsingInDateTimeMethods();
    }

    static void showParsingInDateTimeMethods() {
        LocalDateTime lcd = LocalDateTime.parse("1999-12-24T14:22");
        System.out.println(lcd);
        System.out.println(LocalDate.parse("1999-12-24"));
        System.out.println(LocalTime.parse("14:56"));
    }
}