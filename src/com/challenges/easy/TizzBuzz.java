package com.challenges.easy;

public class TizzBuzz {
    public static void main(String[] args) {
        tizzBuzz(100);
    }

    public static void tizzBuzz(int max){
        StringBuilder output = new StringBuilder();
        for(int i = 1; i <= max; i++){
            if(i % 3 != 0 && i % 5 != 0)
                output.append(i);
            if(i % 3 == 0)
                output.append("tizz");
            if(i % 5 == 0)
                output.append("buzz");
            output.append(" ");
        }
        System.out.println(output);
    }
}
