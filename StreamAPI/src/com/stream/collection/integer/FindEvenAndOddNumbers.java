package com.stream.collection.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(71, 2, 53, 14, 55, 6, 97, 83, 9, 10));

        findEvenAndOddNumbers(list);

    }

    private static void findEvenAndOddNumbers(List<Integer> list) {

        // Type-1
        list.stream().filter(x -> x % 2 == 0).forEach(i -> System.out.println("odd number: " + i));
        list.stream().filter(x -> x % 2 == 1).forEach(i -> System.out.println("even number: " + i));

        System.out.println("---------------------");

        // Type-2
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        map.get(true).forEach(even -> System.out.println("even Number : " + even));
        map.get(false).forEach(odd -> System.out.println("odd Number : " + odd));

    }
}
