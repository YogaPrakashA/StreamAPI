package com.stream.collection.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Comparator;

public class FindMostFrequentElement {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hi", "hello", "Hi", "love", "Hi", "hello", "hey");
        findMostFrequentElement(list).ifPresent(System.out::println);

        String input = "malayalam";
        findMostFrequentElement1(input).ifPresent(System.out::println);

    }

    public static Optional<Map.Entry<String, Long>> findMostFrequentElement(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));

    }

    public static Optional<Map.Entry<String, Long>> findMostFrequentElement1(String input) {
        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
    }

}
