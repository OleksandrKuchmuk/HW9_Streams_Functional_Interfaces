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

        List<Integer> result = alignTheList(values);
        LOGGER.info(result);

        List<Integer> sortedResult = sortList(result);
        LOGGER.info(sortedResult);

        List<Integer> resultWithNull = addElementToList(sortedResult, null);
        LOGGER.info(resultWithNull);

        List<Integer> numbersNotNull = changeNull(resultWithNull);
        LOGGER.info(numbersNotNull);
    }

    private static List<Integer> alignTheList(List<List<Integer>> inputList) {
        return inputList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
    }

    private static List<Integer> sortList(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    private static List<Integer> addElementToList(List<Integer> list, Integer e) {
        list.add(e);
        return list;
    }

    private static List<Integer> changeNull(List<Integer> list) {
        return list.stream()
                .map(x -> Optional.ofNullable(x).orElse(55))
                .collect(Collectors.toList());
    }
}