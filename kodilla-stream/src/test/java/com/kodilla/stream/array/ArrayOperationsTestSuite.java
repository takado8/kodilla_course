package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        // given
        int[] arr = {1,2,3,4,5};
        // when
        var actualAverage = ArrayOperations.getAverage(arr);
        // than
        assertEquals(3.0, actualAverage);

    }
}
