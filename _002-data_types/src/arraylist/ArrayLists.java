
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package arraylist;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(); // after J7, it is also possible to remove the type on the right. Here String.
        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<Animal> arrayList2 = new ArrayList<>();
        Animal animal = new Animal("animal1");
        Cat cat = new Cat("Kitty");

        arrayList2.add(animal);
        arrayList2.add(cat);
        System.out.println(arrayList2);
        System.out.println("==========================================");
        testOfEqualsMethodForStringBuilder();
        testOfEqualsMethodForSpecifiedClassThatOverridesEqualsMethod();
    }

    public static void testOfEqualsMethodForStringBuilder() {
        ArrayList<StringBuilder> sbArray = new ArrayList<>();
        sbArray.add(new StringBuilder("A"));
        sbArray.add(new StringBuilder("B"));
        sbArray.add(new StringBuilder("C"));
        sbArray.add(new StringBuilder("D"));
        sbArray.add(new StringBuilder("D"));
        sbArray.remove(1);
        System.out.println(sbArray);
        sbArray.remove(new StringBuilder("D")); //removes only new created Object, the other SB objects with value "D" are not removed.
        // StringBuilder Class does not override equals() of Object Class.
        System.out.println(sbArray);
    }

    static void testOfEqualsMethodForSpecifiedClassThatOverridesEqualsMethod() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("SnakeJoe"));
        animals.add(new Animal("DogJoe"));
        animals.add(new Animal("CatJoe"));
        System.out.println(animals);
        animals.remove(new Animal("DogJoe")); //this removes all Animal Objects having name "DogJoe", because equals method is overridden and accepts the
        // animal objects are equal if their names are the same.
        System.out.println(animals);
    }
}


class Animal {
    String name;
    int weight;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            Animal a = (Animal) obj;
            boolean isEqual = a.name.equals(this.name);
            return isEqual;
        } else
            return false;
    }

    @Override
    public String
    toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }
}