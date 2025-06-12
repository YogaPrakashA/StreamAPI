package com.stream.collection.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndAllStartingNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(71, 2, 53, 14, 55, 6, 97, 83, 9, 10));

        list.stream().map(String::valueOf)
                .filter(i -> i.startsWith("5"))
                .forEach(System.out::println);
    }
}
