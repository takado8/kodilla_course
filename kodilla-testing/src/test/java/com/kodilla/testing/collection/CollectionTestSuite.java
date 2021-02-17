package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;


public class CollectionTestSuite {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Testing class OddNumbersExterminator:");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finished testing class OddNumbersExterminator.");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("test for empty list.")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new LinkedList<>();
        //When
        var filteredList = OddNumbersExterminator.exterminate(list);
        //Then
        Assertions.assertEquals(list, filteredList);
    }
    @DisplayName("test for odd numbers filtering.")
    @Test
    void testOddNumbersExterminatorNormalList () {
        //Given
        Random rand = new Random();
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<100000; i++) {
            list.add(rand.nextInt());
        }
        //When
        var filteredList = OddNumbersExterminator.exterminate(list);
        //Then
        for(var value : filteredList){
            Assertions.assertEquals(0, value % 2);
        }  // InteliJ poprawia assertTrue na assertEquals, jaka różnica?
    }
}
