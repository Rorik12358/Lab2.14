package com.brainacad.oop.testgenerics2_14_4;

import java.util.Arrays;

/**
 * Created by R2-D2 on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        MyMixer<Integer> myMixer = new MyMixer<>(integers);
        MyMixer<String> myMixer1 = new MyMixer<>(strings);
        System.out.println(Arrays.toString(myMixer.shuffle()));
        System.out.println(Arrays.toString(myMixer1.shuffle()));


    }
}
