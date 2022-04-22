package com.challenges.easy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberOfHighestNumber {
    public static void main(String[] args) {
        System.out.println(getNumberOfHighestNumber(Arrays.asList(3, 2, 3, 1, 3)));
    }

    public static int getNumberOfHighestNumber(List<Integer> listOfInt) {
        AtomicInteger count = new AtomicInteger();
        listOfInt.stream().max(Integer::compare).ifPresent(max -> {
            count.set((int) listOfInt.stream().filter(num -> num.equals(max)).count());
        });

        return count.get();
    }
}
