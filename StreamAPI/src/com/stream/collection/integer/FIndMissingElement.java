package com.stream.collection.integer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FIndMissingElement {
    public static void main(String[] args) {
        int[] n = {1, 2, 6, 4, 7, 8, 9, 9};
        List<Integer> list = Arrays.asList(1, 2, 6, 4, 7, 8, 9, 9);

        System.out.println(findMissingElement(n));
        findMissingElement(list);

    }


    private static List<Integer> findMissingElement(int[] n) {

        Set<Integer> set = Arrays.stream(n).boxed().collect(Collectors.toSet());

        return IntStream.rangeClosed(1, n.length).boxed()
                .filter(i -> !set.contains(i))
                .collect(Collectors.toList());
    }


    private static void findMissingElement(List<Integer> s) {


        Set<Integer> set1 = new HashSet<>(s);

        System.out.println(IntStream.rangeClosed(1, s.size()).boxed().filter(i -> !set1.contains(i))
                .collect(Collectors.toList()));

    }
    

}
