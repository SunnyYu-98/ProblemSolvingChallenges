package com.challenges.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Solution is definitely NOT optimized
 */
public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> passedIn = new ArrayList<>();
//        passedIn.add(5);
//        passedIn.add(1);
//        passedIn.add(1);
//        passedIn.add(4);
//        passedIn.add(5);
//        passedIn.add(2);
//        passedIn.add(2);
//        passedIn.add(4);
//        passedIn.add(5);

        passedIn.add(1);
        passedIn.add(1);
        passedIn.add(2);
        passedIn.add(2);
        passedIn.add(3);
        passedIn.add(3);
        passedIn.add(3);
        passedIn.add(4);
        passedIn.add(4);
        passedIn.add(4);
        passedIn.add(5);
        passedIn.add(5);
        passedIn.add(6);
        passedIn.add(6);



        System.out.println(pickingNumbers(passedIn));
    }

    public static int pickingNumbers(List<Integer> a) {
        //***** First Approach *****
        Collections.sort(a);
        System.out.println(Arrays.toString(a.toArray()));
        int lowestIndex = 0;
        int lowest;

        ArrayList<Integer> completed = new ArrayList<>();

        ArrayList<List<Integer>> pickedArrays = new ArrayList<>();

        while(lowestIndex < a.size()){
            lowest = a.get(lowestIndex);
            int finalLowest = lowest;
            pickedArrays.add(a.stream().filter(num -> (num == finalLowest || num == finalLowest + 1) && !completed.contains(num)).collect(Collectors.toList()));
            completed.add(lowest);

            lowestIndex++;
        }

        pickedArrays.removeIf(List::isEmpty);
        List<Integer> listSizes = pickedArrays.stream().map(list -> list.size()).collect(Collectors.toList());
        Collections.sort(listSizes);

        return (listSizes.get(listSizes.size()-1));

        //***** Second Approach *****
//        Collections.sort(a);
//        int count = 0;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        for(int i=0; i < a.size(); i++){
//            if(a.get(i).equals(a.get(i + 1)) || a.get(i).equals(a.get(i + 1)+1)){
//
//            }
//        }

    }
}
