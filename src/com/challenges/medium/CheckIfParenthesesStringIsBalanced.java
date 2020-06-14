package com.challenges.medium;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Check if parentheses are balanced.
 *
 * Some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * Some unbalanced strings are: "{}(", "({)}", "[[", "}{"
 */
public class CheckIfParenthesesStringIsBalanced {
    public static void main(String[] args) {
        String [] strings = {"{}[]()", "{}{{", "{}{", "{[()]}",
                                "{{{(())}}}", "&","asd}","asd","23}",
                                "123", "123asd}"};

        for (String str : strings) {
            printIfStringIsBalancedUsingStack(str);
        }

        System.out.println("\n\n");

        for (String str : strings) {
            printIfStringIsBalancedUsingRegex(str);
        }
    }

    private static void printIfStringIsBalancedUsingRegex(String string) {
        while(string.length() != (string = string.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
        System.out.println("[Regex]: " + string.isEmpty());
    }
    private static void printIfStringIsBalancedUsingStack(String string){
        //Pattern regex = Pattern.compile("(?:\\[|\\{|\\(|\\}|\\]|\\))");
        //^ this will return true if a string has one of those characters, even though it contains letters
        //Pattern regex = Pattern.compile("[\\[?\\]?\\(?\\)?{?}?]");
        Pattern regex = Pattern.compile("\\W\\D\\S");
        Matcher matcher = regex.matcher(string);

        Stack<Character> stack = new Stack<Character>();
        if(matcher.find()){
            for (Character paren : string.toCharArray()) {
                if (isOpeningTag(paren)) {
                    stack.push(paren);
                } else {
                    if (!isMatchingClosingTag(stack.peek(), paren)) {
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            System.out.println("[Stack]: " + stack.isEmpty());
        } else {
            System.out.println("[Stack]: " + "not match " + false);
        }
    }

    private static boolean isOpeningTag(char character){
        return character == '{' || character == '[' || character == '(';
    }

    private static boolean isMatchingClosingTag(char openTag, char closingTag){
        if(openTag == '{')
            return closingTag == '}';
        else if(openTag == '[')
            return closingTag == ']';
        else if(openTag == '(')
            return closingTag == ')';
        else
            return false;
    }
}
