
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package starter;

public class Starter {
    public static void run(String... args) {
        forLoopWithMultipleUpdate();
        forLoopInfinite();
    }

    static void forLoopInfinite() {
        int i = 0;
        for (; ; ) {
            System.out.println("InfiniteLoop" + ++i);
            printMethod();
            if (i > 10)
                break;
        }
    }

    public static void forLoopWithMultipleUpdate() {
        String line = "ab";
        for (int i = 0; i < line.length(); ++i, printMethod())
            System.out.println(line.charAt(i));
    }

    private static void printMethod() {
        System.out.println("Method called.");
    }
}

