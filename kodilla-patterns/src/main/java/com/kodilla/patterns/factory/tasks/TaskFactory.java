package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final Task makeTask(TaskType taskType) {
        switch (taskType) {
            case DRIVING:
                return new DrivingTask("drive", "office", "car01");
            case PAINTING:
                return new PaintingTask("paint", "blue", "fence");
            case SHOPPING:
                return new ShoppingTask("buy", "pc", 10.0);
            default:
                return null;
        }
    }
}
