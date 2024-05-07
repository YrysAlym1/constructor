public class Main {
    public static void main(String[] args) {

        /**MyClass деген класс тузунуз

         Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)

         Параметри эки башка болгон эки конструктор тузунуз

         MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз

         Эки объектке эки башка конструктор иштесин.

         Объекттердин маанилерин консольго чыгарыныз.**/

        MyClass myClass = new MyClass();
        myClass.name = "Yryskeldi";
        myClass.lastName = "Alymbekov";
        myClass.age = 18;
        String [] less = {"java"};
        myClass.lessons = less;
        myClass.food = "Plow";
        myClass.info();

        System.out.println();
        MyClass myClass1 = new MyClass("Joomart","KS",18,less,"apple");
        myClass1.info();

    }
}