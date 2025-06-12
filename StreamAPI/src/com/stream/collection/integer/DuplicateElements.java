package com.stream.collection.integer;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(71, 12, 12, 53, 14, 55, 6, 97, 53, 97, 10));
        Set<Integer> set = new HashSet<>();

        // Type-1
        List<Integer> setValue = list.stream().filter(i -> !set.add(i)).toList();

        System.out.println(setValue);

        // Type-2
        Map<Integer, Long> duplicate = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        duplicate.entrySet().stream().filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }
}
