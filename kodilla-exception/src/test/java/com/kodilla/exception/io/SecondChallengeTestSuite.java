package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        // given
        var sc = new SecondChallenge();
        // when than
        assertAll(
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(7,7)),
                () -> assertDoesNotThrow(() -> sc.probablyIWillThrowException(1,15))
        );


    }
}
