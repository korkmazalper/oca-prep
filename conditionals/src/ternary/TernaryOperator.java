
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ternary;

public class TernaryOperator {
    public static void main(String[] args) {
        double x = 1.0;
        double y = -1.0;
        boolean isEqual = (x == y) ? true : false;
        System.out.println(isEqual);
        int bigOne = bringTheBigOne(1, 2);
        System.out.println(bigOne);
        System.out.println(bringTheBigOne(0, 0));
        nestedTernary();
    }

    static int bringTheBigOne(int a, int b) {
        return a > b ? a : b;
    }

    static void nestedTernary() {
        int a = 3;
        int b = 2;
        int c = 0;
        System.out.println(
                (a > b) ?
                        (a > c) ?
                                "a"
                                : "b"
                        : "c"
        );
    }
}
