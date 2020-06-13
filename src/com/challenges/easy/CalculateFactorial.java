package com.challenges.easy;

public class CalculateFactorial {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,10,20};
        for(int num : numbers) {
            System.out.println("Factorial of " + num + ": " + calculateFactorial(num));
        }
    }

    public static int calculateFactorial(int number){
        int total = number;
        for(int i = number-1; i > 0; i--){
            total *= i;
        }
        return total;
    }
}
