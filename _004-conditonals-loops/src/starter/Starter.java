
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package starter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Starter {
    public static void run(String... args) {
//        forLoopWithMultipleUpdate();
//        forLoopInfinite();
//        nestedLoopHourMinute();
        enhancedLoop();
    }

    private static void enhancedLoop() {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("C++");
        myList.add("Golang");
        myList.add("Javascript");
        System.out.println("========================");
        System.out.println(myList);
        System.out.println("========================");
        System.out.println("-->Iterator<--");
        for (Iterator<String> i = myList.iterator(); i.hasNext(); )
            System.out.println(i.next());
        System.out.println("-->enhanced Loop<--");
        for (String val : myList)
            System.out.println(val);
//        System.out.println("-->HashSet <--");
//        HashSet<String> stringHashSet = new HashSet<>();
//        stringHashSet.addAll(myList);
//        for (String s : stringHashSet) {
//            System.out.println(s);
//        }
    }

    private static void nestedLoopHourMinute() {
        for (int hrs = 0; hrs < 2; hrs++) {
            for (int min = 0; min <= 59; min++) {
                System.out.println(hrs + ":" + min);
            }
        }
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

