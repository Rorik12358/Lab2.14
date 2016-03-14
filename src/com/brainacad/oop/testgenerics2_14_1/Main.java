package com.brainacad.oop.testgenerics2_14_1;

/**
 * Created by m18 on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("MyTuple1", 9, 234522324324L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(99.5, "MyTuple2", "MyTuple2");
        System.out.print(myTuple1.getA() + " ");
        System.out.print(myTuple1.getB() + " ");
        System.out.println(myTuple1.getC());
        System.out.print(myTuple2.getA() + " ");
        System.out.print(myTuple2.getB() + " ");
        System.out.println(myTuple2.getC());
    }
}
