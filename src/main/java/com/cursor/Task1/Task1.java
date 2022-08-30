package com.cursor.Task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task1 {
    public static final Logger LOGGER = LogManager.getLogger(Task1.class);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(8, 5, 6));
        List<Integer> numbers2 = new ArrayList<>(List.of(2, 7, 4, 8, 0, 1, 76, 16));
        List<List<Integer>> values = new ArrayList<>(List.of(numbers, numbers2));
        LOGGER.info(values);

        List<Integer> result = values.stream().flatMap(x -> x.stream()).sorted().collect(Collectors.toList());
        LOGGER.info(result);

        result.add(null);
        LOGGER.info(result);

        List<Integer> numbersNotNull = result.stream()
                .map(x -> Optional.ofNullable(x).orElse(55))
                .collect(Collectors.toList());
        LOGGER.info(numbersNotNull);
    }
}