package com.challenges.easy;

public class FindLongestWordFromSentence {
    public static void main(String[] args) {
        String [] strings = {"Hello my name is sakk akfkqeqwe qwe. I dont know which word is the longesttttttttt",
                "one big long wordss",
                "manys manys words"};
        for(String str : strings){
            System.out.println(str + " :\n" + getLongestWord(str) + "\n");
        }
    }

    public static String getLongestWord(String sentence){
        String [] array = sentence.split(" ");
        String longest = "";
        for (String str: array) {
            if(str.length() > longest.length())
                longest = str;
        }
        return longest;
    }
}
