package com.brainacad.oop.testgenerics2_14_2;

/**
 * Created by m18 on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Lab 2.14.2
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubles = {1.4, 2.3, 11.2, 66d, 88d, 99.999, 99.9};
        System.out.println(MyTestMethod.calcNum(integers, 5));
        System.out.println(MyTestMethod.calcNum(doubles, 8.));
    }
}
