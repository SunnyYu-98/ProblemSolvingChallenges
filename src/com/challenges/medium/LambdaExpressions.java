package com.challenges.medium;

import java.util.function.Function;

@FunctionalInterface
interface PerformOperation {
    boolean check(int a);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        System.out.println(isOdd().check(5));
        System.out.println(isPrime().check(2));
        System.out.println(isPrime().check(1));
        System.out.println(isPrime().check(13));
        System.out.println(isPrime().check(4));
        System.out.println(isPrime().check(15));
        System.out.println(isPrimeWithFunction().andThen(param -> {
            System.out.println("param: " + param);
            return param == null;
        }).apply(6));

        System.out.println("\n\n\n878: " + isPalindrome().check(878));
        System.out.println("78: " + isPalindrome().check(78));
        System.out.println("1110111: " + isPalindrome().check(1110111));
    }

    public static PerformOperation isOdd(){
        return (int number) -> number % 2 != 0;
    }

    public static Function<Integer, Boolean> isPrimeWithFunction(){
        return number -> java.math.BigInteger.valueOf((int) number).isProbablePrime(1);
    }

    public static PerformOperation isPrime(){
        //without the library:
//        return (int number) -> {
//            for(int i=2; i <= number/2; i++){
//                if(number % i == 0){
//                    return false;
//                }
//            }
//            return true;
//        };

        //shorter version:
//      return number -> IntStream.range(2, (int) Math.sqrt(number+1)).noneMatch(i -> number%i == 0);

        return (int number) -> java.math.BigInteger.valueOf(number).isProbablePrime(1);
    }

    public static PerformOperation isPalindrome(){
//        return (number) -> {
//            String numStringToCheck = ((Integer) number).toString();
//            if(numStringToCheck.length() % 2 == 0)
//                return false;
//
//            for(int start=0, end=numStringToCheck.length() - 1; start < numStringToCheck.length(); start++, end--){
//                if(numStringToCheck.charAt(start) != numStringToCheck.charAt(end))
//                    return false;
//            }
//            return true;
//        };

        //shorter way:
        return (int number) ->  Integer.toString(number).equals( new StringBuilder(Integer.toString(number)).reverse().toString() );
    }
}
