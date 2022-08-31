package com.cursor.HomeTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(8, 5, 6));
        List<Integer> numbers2 = new ArrayList<>(List.of(2, 7, 4, 8, 0, 1, 76, 16));
        List<List<Integer>> values = new ArrayList<>(List.of(numbers, numbers2));
        LOGGER.info(values);

        List<Integer> result = Actions.alignTheList(values);
        LOGGER.info(result);

        List<Integer> sortedResult = Actions.sortList(result);
        LOGGER.info(sortedResult);

        List<Integer> resultWithNull = Actions.addElementToList(sortedResult, null);
        LOGGER.info(resultWithNull);

        List<Integer> numbersNotNull = Actions.changeNull(resultWithNull);
        LOGGER.info(numbersNotNull);

        List<Integer> numbersMultiplied = Actions.numberMultiplication(numbersNotNull, 2);
        LOGGER.info(numbersMultiplied);
    }
}