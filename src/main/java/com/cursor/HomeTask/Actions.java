package com.cursor.HomeTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Actions {
    public static final Logger LOGGER = LogManager.getLogger(Actions.class);

    public static List<Integer> alignTheList(List<List<Integer>> inputList) {
        return inputList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
    }

    public static List<Integer> sortList(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> addElementToList(List<Integer> list, Integer e) {
        list.add(e);
        return list;
    }

    public static List<Integer> changeNull(List<Integer> list) {
        return list.stream()
                .map(x -> Optional.ofNullable(x).orElse(55))
                .collect(Collectors.toList());
    }

    public static List<Integer> numberMultiplication(List<Integer> list, int multiplier) {
        Operations p = (int x) -> x * multiplier;
        return list.stream()
                .map(n -> p.multiplication(n))
                .collect(Collectors.toList());
    }
}
