package com.zatsando.learnjava;

public class MyClass {

    public static void main(String[] args) {

//        System.out.println(showBio("zats", "i was born in athens", 32));
       divideNumbers(3, 5);
//        item += 1;
//
//        System.out.println("Result: " + item);
//        addNumbers(12, 12);
//        anotherMethod("Hello", 91);
//        showName();
    }


//    public static void showName() {
//        for (int i = 0; i < 20; i++) {
//
//            if (i % 3 == 0) {
//                System.out.println(i + " is multiple of 3");
//                System.out.println("from showname");
//            }
//        }
//    }

//    public static void addNumbers(int a, int b) {
//        System.out.println("sum is: " + (a + b));
//    }
//
//    public static void anotherMethod(String something, int age) {
//        if (age > 90) {
//            System.out.println("i am still young");
//        }
//        System.out.println("an other method " + something + " " + age);
//    }

    public static void divideNumberss(double first, int second) {
        System.out.println("Result: " + first / second);
    }

    public static void multiplyNumbers(int first, int second) {
        System.out.println("Result:" + first * second);
    }

    public static void divideNumbers(double first, int second) {

        System.out.println("Result is "+first / second);
    }

    public static String showBio(String name, String bio, int age) {
        String description = " My name is "
                + name + bio+
                " and I am "
                + age +
                " old.";
        return description;
    }
}
