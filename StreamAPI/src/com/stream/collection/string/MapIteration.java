package com.stream.collection.string;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 8);
        map.put("Spring", 6);
        map.put("lambda", 2);

        map.forEach((key, value) ->  System.out.println(key + value));

    }

}
