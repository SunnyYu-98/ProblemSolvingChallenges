package com.challenges.easy;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        System.out.println("tacocat: " + checkIfPalindrome("tacocat"));
        System.out.println("caca: " + checkIfPalindrome("caca"));
        System.out.println("madam: " + checkIfPalindrome("madam"));
    }

    public static boolean checkIfPalindrome(String word){
        for(int start=0,end = word.length()-1; start < end; start++,end--){
            if(word.charAt(end) != word.charAt(start)) {
                return false;
            }
        }
        return true;
    }
}
