package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updatesCount = 0;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println("Task queue of student " + tasksQueue.getStudentName() + " has been updated.");
        updatesCount++;
    }

    public int getUpdatesCount() {
        return updatesCount;
    }

    public String getName() {
        return name;
    }

}
