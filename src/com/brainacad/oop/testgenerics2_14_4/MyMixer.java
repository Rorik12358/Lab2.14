package com.brainacad.oop.testgenerics2_14_4;

import java.util.Random;

/**
 * Created by R2-D2 on 16.03.2016.
 */
public class MyMixer<T> {
    private T[] arrayT;

    public MyMixer(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public T[] shuffle() {
        int length = arrayT.length;
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int index = random.nextInt(length);
            T el = arrayT[i];
            arrayT[i] = arrayT[index];
            arrayT[index] = el;
        }
        return arrayT;
    }
}
