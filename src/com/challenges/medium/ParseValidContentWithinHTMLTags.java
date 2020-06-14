package com.challenges.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ONLY print out the content within the HTML tags.
 * It will print "None" if there's no matching tags.
 */
public class ParseValidContentWithinHTMLTags {
    public static void main(String[] args) {
        String [] strings = {"<h1>Nayeem loves counseling</h1>",
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
                "<Amee>safat codes like a ninja</amee>",
                "<SA premium>Imtiaz has a secret crush</SA premium>"};

        boolean matchFound;
        for(String str : strings){
            matchFound = false;
            Pattern regex = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = regex.matcher(str);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
    }
}
