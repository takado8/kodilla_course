package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
   @Test
    void testTaskAdd(){
       ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
       Board board = context.getBean(Board.class);

       var doneList = board.getDoneList();
       var toDoList = board.getToDoList();
       var inProgressList = board.getInProgressList();

       doneList.getTasks().add("task1");
       toDoList.getTasks().add("task2");
       inProgressList.getTasks().add("task3");

       assertEquals("task1",doneList.getTasks().get(0));
       assertEquals("task2",toDoList.getTasks().get(0));
       assertEquals("task3",inProgressList.getTasks().get(0));
   }
}
