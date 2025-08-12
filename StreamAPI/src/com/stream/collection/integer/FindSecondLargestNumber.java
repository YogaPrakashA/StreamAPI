package com.stream.collection.integer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        //Find second larget number from list:
        int[] arr1 = {5, 8, 1, 4, 7};
        int[] arr2 = {12, 45, 2, 41, 31, 10, 45};
        int[] arr3 = {-10, -3, -50, -1, -7};

        List<Integer> list1 = Arrays.asList(5, 8, 1, 4, 7);
        List<Integer> list2 = Arrays.asList(12, 45, 2, 41, 31, 10, 45);
        List<Integer> list3 = Arrays.asList(-10, -3, -50, -1, -7);


        System.out.println("arr1 : " + findSecondLargest(arr1));
        System.out.println("arr2 : " + findSecondLargest(arr2));
        System.out.println("arr3 : " + findSecondLargest(arr3));

        System.out.println("list1 : " + findSecondLargest1(list1));
        System.out.println("list2 : " + findSecondLargest1(list2));
        System.out.println("list3 : " + findSecondLargest1(list3));

    }

    public static int findSecondLargest(int[] arr) {

        return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }

    public static int findSecondLargest1(List<Integer> arr) {

        return arr.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }
}
