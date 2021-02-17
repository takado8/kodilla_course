package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {
    public static List<Integer> exterminate(List<Integer> numbers){
        List<Integer> list = new LinkedList<>();
        for(var item : numbers) {
            if(item % 2 == 0) list.add(item);
        }
        return list;
    }
}
