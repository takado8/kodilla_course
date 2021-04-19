package com.kodilla.patterns.factory.tasks;

public class DrivingTask extends TaskAbs {
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using){
        super(taskName);
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println(toString() + " executed");
        setExecuted(true);
    }

    @Override
    public String toString() {
        return "DrivingTask: driving " + where + " using " + using;
    }
}
