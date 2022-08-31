package com.cursor.HomeTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
public interface Operations {
   Logger LOGGER = LogManager.getLogger(Operations.class);

    int multiplication(int x);

    default void methodDefault1(){
        LOGGER.info("Default method # 1");
    }

    default void methodDefault2(){
        LOGGER.info("Default method # 2");
    }

    static void methodStatic1(){
        LOGGER.info("Static method # 1");
    }

    static void methodStatic2(){
        LOGGER.info("Static method # 2");
    }
}
