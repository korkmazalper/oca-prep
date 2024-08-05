
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package arraylist;

import java.util.ArrayList;

public class CloneTest {
    public static void main(String args[]) {
        ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb2);
        ArrayList<StringBuilder> assignedArrList = myArrList;
        ArrayList<StringBuilder> clonedArrList =
                (ArrayList<StringBuilder>) myArrList.clone();
        System.out.println(myArrList == assignedArrList); // atama da referanslar ayni neneyi göstermektedir.
        System.out.println(myArrList == clonedArrList); // clone'lanan nesne farkli bir nesnedir.
        StringBuilder myArrVal = myArrList.get(0);
        StringBuilder assignedArrVal = assignedArrList.get(0);
        StringBuilder clonedArrVal = clonedArrList.get(0);
        System.out.println(myArrVal == assignedArrVal);
        System.out.println(myArrVal == clonedArrVal);
    }
}
