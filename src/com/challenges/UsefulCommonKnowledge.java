package com.challenges;

public class UsefulCommonKnowledge {
    public static void main(String[] args) {
        convertIntToStringArrays(125);
        convertIntToStringArrays(92810);
    }

    public static void convertIntToStringArrays(int number){
        String [] strArr = Integer.toString(number).split("");
        for(String str : strArr) {
            System.out.print(str + " ");
        }
        System.out.print("\n");
    }
}

