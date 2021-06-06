package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskListDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao dao;
    private final String NAME = "testName";

    @Test
    void testFindByListName(){
        //given
        TaskList taskList = new TaskList(NAME, "description");
        // when
        dao.save(taskList);
        //than
        var result = dao.findByListName(NAME);
        assertFalse(result.isEmpty());
        System.out.println(result.get(0));
        //cleanup
        dao.delete(result.get(0));

    }
}
