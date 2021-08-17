package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HomeworkTestSuite {
    @Test
    public void testNotifyMentors() {
        // given
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        TasksQueue tasksQueue1 = new TasksQueue("student1");
        TasksQueue tasksQueue2 = new TasksQueue("student2");
        TasksQueue tasksQueue3 = new TasksQueue("student3");

        tasksQueue1.registerObserver(mentor1);
        tasksQueue2.registerObserver(mentor1);
        tasksQueue3.registerObserver(mentor2);

        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        // when
        tasksQueue1.addTask(task1);
        tasksQueue2.addTask(task2);
        tasksQueue3.addTask(task2);

        // then
        assertEquals(2, mentor1.getUpdatesCount());
        assertEquals(1, mentor2.getUpdatesCount());
    }
}
