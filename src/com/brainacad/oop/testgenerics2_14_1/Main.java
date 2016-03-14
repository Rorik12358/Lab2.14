package com.brainacad.oop.testgenerics2_14_1;

/**
 * Created by m18 on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer,Long> myTuple1 = new MyTuple<>("MyTuple1", Integer.valueOf(1), Long.valueOf(11));
        MyTuple<Double,String,String> myTuple2 = new MyTuple<>(Double.valueOf("99.5"),"MyTuple2","MyTuple2");
    }
}
