package com.cursor.HomeTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);


    public static void main(String[] args) {
        Actions actions = new Actions();
        List<Integer> numbers = new ArrayList<>(List.of(8, 5, 6));
        List<Integer> numbers2 = new ArrayList<>(List.of(2, 7, 4, 8, 0, 1, 76, 16));
        List<List<Integer>> values = new ArrayList<>(List.of(numbers, numbers2));
        LOGGER.info(values);

        List<Integer> result = actions.alignTheList(values);
        LOGGER.info(result);

        List<Integer> sortedResult = actions.sortList(result);
        LOGGER.info(sortedResult);

        List<Integer> resultWithNull = actions.addElementToList(sortedResult, null);
        LOGGER.info(resultWithNull);

        List<Integer> numbersNotNull = actions.changeNull(resultWithNull);
        LOGGER.info(numbersNotNull);

        List<Integer> numbersMultiplied = actions.numberMultiplication(numbersNotNull, 2);
        LOGGER.info(numbersMultiplied);
    }
}