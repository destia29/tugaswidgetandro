package com.descull.widgetapp;

/**
 * Created by descull on 15/04/2019.
 */

import java.util.Random;

public class RandomGenerator {
    public static int Generate(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
