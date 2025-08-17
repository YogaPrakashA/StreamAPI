package com.stream.collection.integer;

import java.util.*;

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

        int[] arr4 = {45, 45, 2, 45, 44, 10, 45};
        findSecondLargestNumber(arr4);

    }

    public static int findSecondLargest(int[] arr) {

        return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }

    public static int findSecondLargest1(List<Integer> arr) {

        return arr.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }

    public static void findSecondLargestNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        int secondLargeElement = arr[arr.length - 1];
        for (int k = arr.length - 1; k >= 0; k--) {
            if (arr[k] < secondLargeElement) {
                System.err.println(arr[k]);
                break;
            }
        }

    }
}
