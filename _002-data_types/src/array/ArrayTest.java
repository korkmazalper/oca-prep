
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package array;

public class ArrayTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book book1 = new Book();
        Magazine magazine = new Magazine();
        Book book = new Magazine();
        books[0] = book1;
        books[1] = book;
        books[2] = magazine;
        Literatur literatur = new Magazine();
        Calculations calculations = new Book();

        books[3] = (Book) calculations;
        books[4] = (Book) literatur;
        for (Book b : books) {
            System.out.println(b);
        }

    }


}

abstract class Literatur {
    void show() {

    }
}

interface Calculations {
    void calculate();
}

class Book extends Literatur implements Calculations {
    String name;
    int pages;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void calculate() {

    }
}

class Magazine extends Book {
    void find() {
        //new Literatur(); // abstract classes can not be used to create instance
        // in the following code, c is the type of reference. the created object is anonym and is the not accessible without its reference.
        Calculations c = new Calculations() {
            @Override
            public void calculate() {

            }
        };
    }
}
