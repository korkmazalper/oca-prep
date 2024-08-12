
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
    
        ArrayList<String> ejg = new ArrayList<>(); // line 4
        System.out.println(ejg.equals(new ArrayList<>()));
        System.out.println(ejg);
        ejg.add("One"); // line 5
        ejg.add("Two"); // line 6
        System.out.println(ejg.contains(new String("One"))); // line 7
        System.out.println(ejg.indexOf("Two")); // line 8
        ejg.clear(); // line 9
        System.out.println(ejg); // line 10
        //System.out.println(ejg.get(1));
    }
}
