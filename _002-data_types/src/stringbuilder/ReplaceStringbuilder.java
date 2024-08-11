
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package stringbuilder;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReplaceStringbuilder {
}

class ReplaceStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.replace(2, 4, "ABCD");
        System.out.println(sb1);
        System.out.println(sb1.append("endOfStringBuilder"));
        System.out.println(sb1.delete(2, 3));
        System.out.println(sb1.deleteCharAt(0));
        System.out.println(sb1.reverse());
        System.out.println(sb1.reverse());
        System.out.println(sb1.substring(2, 4));
        System.out.println(sb1);
        System.out.println(sb1.insert(1, "INSERTED_TEXT"));
        System.out.println(sb1.delete(sb1.indexOf("I"), sb1.lastIndexOf("T") + 1));
        System.out.println(sb1.insert(1, "INSERTED_TEXT"));
        System.out.println(sb1.insert(1, "INSERTED_TEXT"));
        System.out.println(removeSubstring(sb1, "INSERTED_TEXT"));
    }

    public static StringBuilder removeSubstring(StringBuilder sb, String toRemove) {
        int index;
        while ((index = sb.indexOf(toRemove)) != -1) {
            sb.delete(index, index + toRemove.length());
        }
        return sb;
    }


}
