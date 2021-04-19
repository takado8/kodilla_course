package com.kodilla.patterns.factory.tasks;

public abstract class TaskAbs implements Task {
    private final String taskName;
    private boolean isExecuted;

    public TaskAbs(String taskName) {
        this.taskName = taskName;
        this.isExecuted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isExecuted;
    }

    protected void setExecuted(boolean executed) {
        isExecuted = executed;
    }
}
