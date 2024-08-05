
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package concatenation;

public class Concatenation {
    public static void main(String[] args) {
        String s = null;
        s += "concatenated";

        System.out.println(s); //-> nullconcatenated
        System.out.println("Methodcall:" + giveMeAnInteger(1) + giveMeAnInteger(2) + giveMeAnInteger(3));
        System.out.println("Methodcall:" + (giveMeAnInteger(1) + giveMeAnInteger(2) + giveMeAnInteger(3)));

        StringBuilder sb1 = new StringBuilder();

    }

    static int giveMeAnInteger(int x) {
        Object o = new Object();
        System.out.println(o.toString());
        return x % 3;
    }

}
