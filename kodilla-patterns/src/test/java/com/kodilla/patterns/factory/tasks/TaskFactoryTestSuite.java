package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        var task = factory.makeTask(TaskType.DRIVING);
        task.executeTask();
        //then
        assertTrue(task.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        var task = factory.makeTask(TaskType.PAINTING);
        task.executeTask();
        //then
        assertTrue(task.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        var task = factory.makeTask(TaskType.SHOPPING);
        task.executeTask();
        //then
        assertTrue(task.isTaskExecuted());
    }
}
