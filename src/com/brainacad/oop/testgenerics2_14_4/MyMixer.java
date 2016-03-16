package com.brainacad.oop.testgenerics2_14_4;

import java.util.Arrays;

/**
 * Created by R2-D2 on 16.03.2016.
 */
public class MyMixer<T> {
    private T[] arrayT;

    public MyMixer(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public void shuffle() {
        int length = arrayT.length;
        int[] indexes = new int[length];
        Arrays.fill(indexes, -1);
        for (int i = 0; i < length; i++) {
            boolean checking = false;
//            do{
//
//            }
        }
    }
}
