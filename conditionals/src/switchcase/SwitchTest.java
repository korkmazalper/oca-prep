
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package switchcase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SwitchTest {
    public static void main(String[] args) {
        simpleCase(20);
        simpleCase(10);
        simpleCase(30);
        simpleCase(32);
        String printDate = LocalDate.parse("2057-08-11").format(DateTimeFormatter.ISO_DATE_TIME);
//        final int a = 10;
//        final int b = 20;
//        final int c;
//        c = 30;
//        switch (a) {
//            case b + c:
//                System.out.println(b + c);
//                break;
//        }

    }

    static void simpleCase(int marks) {

        switch (marks) {
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            case 30:
                System.out.println(30);
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
