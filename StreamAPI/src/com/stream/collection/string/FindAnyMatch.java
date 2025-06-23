package com.stream.collection.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnyMatch {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("dhoni","virat","laptop");

        list.stream().filter(s -> s.equals("virat")).findAny().ifPresent(System.out::println);
    }
}
