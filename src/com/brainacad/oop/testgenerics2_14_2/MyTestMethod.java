package com.brainacad.oop.testgenerics2_14_2;

/**
 * Created by m18 on 14.03.2016.
 */
public class MyTestMethod {
    public static <T extends Comparable> int calcNum(T[] arr, T t) {
        int count = 0;
        for (T el : arr) {
            if (t.compareTo(el) < 0) {
                count++;
            }
        }
        return count;
    }
}
