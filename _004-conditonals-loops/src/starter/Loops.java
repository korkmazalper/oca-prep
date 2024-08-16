
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package starter;

import java.util.*;

public class Loops {
    public static void main(String[] args) {
        useArrayList();
    }

    static void useArrayList() {
        Collection<String> collections = new ArrayList<>();
        collections.add("Python");
        collections.add("Java");
        System.out.println(collections.size());
        Collection<String> set = new HashSet<>();
        set.add("One");
        System.out.println(set.size());
        Map<String, String> landsCapitals = new HashMap<>();
        landsCapitals.put("Berlin", "Germany");
        landsCapitals.put("Paris", "France");

        for (Map.Entry<String, String> map : landsCapitals.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }
}
