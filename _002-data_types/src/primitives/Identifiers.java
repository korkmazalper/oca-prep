
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package primitives;

public class Identifiers {
    // valid identifiers
    int _i = 1;
    char myChar = 'x';
    char myChar1 = 97;
    char myChar2 = (char) -115;

    public void display() {
        System.out.printf("\nchar: %c  intchar:%c negativechar:%c", myChar, myChar1, myChar2);
        System.out.printf("\nUnicodeChar: \u199F");
        System.out.printf("\nJapaneese: \u305A ");
        System.out.printf("\nJapaneese(in string): ず ");
        System.out.printf("\nBitcoin: \u20BF");
    }

    int $myMoney = 10;
}
