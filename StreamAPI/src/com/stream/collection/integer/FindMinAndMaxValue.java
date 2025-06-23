package com.stream.collection.integer;

import java.util.*;

public class FindMinAndMaxValue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(71, 2, 53, 14, 55, 6, 97, 83, 9, 10));

        int[] li = new int[]{71, 2, 53, 14, 55, 6, 97, 83, 9, 10};

        // Type-1
        OptionalInt minInt = Arrays.stream(li).min();
        OptionalInt maxInt = Arrays.stream(li).max();

        System.out.println("minInt : "+minInt);
        System.out.println("maxInt : "+maxInt);

        // Type-2
        OptionalInt minIntReduce = Arrays.stream(li).reduce(Integer::min);
        OptionalInt maxIntReduce = Arrays.stream(li).reduce(Integer::max);

        System.out.println("minIntReduce : "+minIntReduce);
        System.out.println("maxIntReduce : "+maxIntReduce);

        // Type-3
        Arrays.stream(li).min().ifPresent(System.out::println);
        Arrays.stream(li).max().ifPresent(System.out::println);

        // Type-4
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());

        System.out.println("min : "+min);
        System.out.println("max : "+max);
    }
}
