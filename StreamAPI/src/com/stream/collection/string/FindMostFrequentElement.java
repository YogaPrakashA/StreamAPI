package com.stream.collection.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMostFrequentElement {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hi", "hello", "Hi", "love", "Hi", "hello", "hey");
        findMostFrequentElement(list).ifPresent(System.out::println);

        String input = "abc";
        findMostFrequentCharacterFromString(input).ifPresent(System.out::println);

        char[] n = {'m', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm'};
        findMostFrequentCharacter(n).ifPresent(System.out::println);

    }

    public static Optional<Map.Entry<String, Long>> findMostFrequentElement(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));

    }

    public static Optional<Map.Entry<String, Long>> findMostFrequentCharacterFromString(String input) {
        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
    }

    public static Optional<Map.Entry<Character, Long>> findMostFrequentCharacter(char[] listOfChar) {
        return new String(listOfChar).chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));


    }

}
