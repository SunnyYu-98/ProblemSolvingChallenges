package com.challenges.easy;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("FibonacciSequence: the next number is the sum of the previous two numbers, starts with 1");
        fibonacciSequence(20);
    }

    public static void fibonacciSequence(int totalToGenerate){
        int first = 1;
        int second = 1;
        int next = 0;
        int counter = 0;
        System.out.print("\n" + first + " " + second + " ");

        while(counter <= totalToGenerate){
            next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
            counter++;
        }
    }
}
