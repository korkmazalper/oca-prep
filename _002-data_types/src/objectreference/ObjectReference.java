
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package objectreference;

public class ObjectReference {
}

/*
 * 1-> anothermethod
 * 2-> EJava
 * 3-> somemethod
 * 4-> somemethod
 * */
class EJavaGuruPassObjects1 {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "EJava";
        anotherMethod(p);
        System.out.println(p.name);  //2
        someMethod(p);
        System.out.println(p.name); //4
    }

    // Metoda gecilen referanslarda, referans kopyasi yollanir. Eger metot icinde bu referansa yeni bir nesne atanirsa, bu nesne  ve referansi local kalir.
    static void someMethod(Person p) {  // this reference p is a copy of the reference in main
        p.name = "someMethod";
        System.out.println(p.name); //3
    }

    static void anotherMethod(Person p) {
        p = new Person(); // this reference p is a copy of the reference in main, if a new object is assigned, the scope of both will be in local and the Changes have kein effect on original object in main
        p.name = "anotherMethod";
        System.out.println(p.name); //1
    }
}

class Person {
    public String name;
    public int height;
}
