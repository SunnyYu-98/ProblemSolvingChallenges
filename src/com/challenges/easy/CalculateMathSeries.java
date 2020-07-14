package com.challenges.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * We use the integers a, b, and n to create the following series:
 * (a + 2^0 * b), (a+2^0 * b + 2^1 * b), ... , (a+2^0 * b + 2^1 * b + ... + 2^(n-1) * b)
 *
 * You are given x queries in the form of a, b, and n. For each query, print the series corresponding to the given a,
 * b, and n values as a sinlge line of n spaced-separated integers.
 *
 *
 * Sample Input
 * 2
 * 0 2 10
 * 5 3 5
 *
 * Sample Output
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 *
 * Refer to https://www.hackerrank.com/challenges/java-loops/problem
 */
public class CalculateMathSeries {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            calculateAndPrintSeries(a, b, n);
        }
        in.close();

        BigInteger bigInt = BigInteger.valueOf(30);
        for(int i = 29; i > 0; i--){
            bigInt = bigInt.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigInt);

    }

    public static void calculateAndPrintSeries(int a, int b, int n){
        if(n == 0)
            return;
        //(a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ... , (a+2^0 * b + 2^1 * b + ... + 2^(n-1) * b)
        int exponent = 0;
        int total = a + ((int) Math.pow(2, exponent) * b);
        System.out.print(total);
        exponent++;

        if(n > 1) {
            //start with 2 because the first number is calculated and printed above
            for (int i = 2; i <= n; i++) {
                total += ((int) Math.pow(2, exponent) * b);
                System.out.print(" " + total);
                exponent++;
            }
        }
        System.out.print("\n");
    }

}
