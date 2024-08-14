
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package starter;

import java.util.Arrays;

public class EnhancedLoop {
    public static void main(String[] args) {
        int[] a = new int[5];
        forLoopToModifyArray(a);
        enhancedLoopToModifyArray(a);
    }

    private static void enhancedLoopToModifyArray(int[] x) {
        // To initialize an array element, it is not a good idea to use enhanced for loop.
        System.out.println(Arrays.toString(x));
        int count = 0;
        for (int i : x) {
            i = ++count;
            if (i % 2 == 0) i = 0;
        }
        System.out.println(Arrays.toString(x));
    }

    static void forLoopToModifyArray(int[] x) {
        System.out.println(Arrays.toString(x));
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
            if (i % 2 == 0) {
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
