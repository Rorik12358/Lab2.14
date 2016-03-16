package com.brainacad.oop.testgenerics2_14_2_and_3;

/**
 * Created by m18 on 14.03.2016.
 */
public class MyTestMethod {
    //Lab 2.14.2
    public static <T extends Comparable> int calcNum(T[] arr, T t) {
        int count = 0;
        for (T el : arr) {
            if (t.compareTo(el) < 0) {
                count++;
            }
        }
        return count;
    }

    //Lab 2.14.3
    public static <T extends Number & Comparable> double calcSum(T[] arr, T maxval) {
        double summ = 0;
        for (T el : arr) {
            if (el.compareTo(maxval) > 0) {
                summ += el.doubleValue();
            }
        }
        return summ;
    }
}
