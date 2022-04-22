package com.challenges.whynot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Secret Santa thing:
 * Given a list of people, then each person gets another random person.
 *
 * No one can be paired with another person.
 */
public class SecretSantaMatching {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Sunny", "Mariah", "Riley");
//        System.out.println(names);
//
//        Collections.shuffle(names);
//        System.out.println(names);

        String [] names = {"Sunny", "Mariah", "Riley"};

        Random random = new Random();
        int lastIndex = names.length - 1;
        for(int i = lastIndex; i > 0; i--) {
            int j = random.nextInt(i);
            String temp = names[i];
            names[i] = names[j];
            names[j] = temp;
        }

        //System.out.println(Arrays.toString(names));

        for(int i = 0; i < names.length; i++) {
            if (i != names.length -1) {
                System.out.println(names[i] + " -> " + names[i + 1]);
            } else {
                System.out.println(names[i] + " -> " + names[0]);
            }
        }
    }
}
