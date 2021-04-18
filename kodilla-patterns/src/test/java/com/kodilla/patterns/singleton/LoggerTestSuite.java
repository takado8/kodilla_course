package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        Logger logger = Logger.INSTANCE;
        logger.log("hello there");

        assertEquals("hello there", logger.getLastLog());
    }
}
