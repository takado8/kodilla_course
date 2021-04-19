package com.kodilla.patterns.factory.tasks;

public class PaintingTask extends TaskAbs {
    private final String  color;
    private final String  whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint){
        super(taskName);
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println(toString() + " executed");
        setExecuted(true);
    }

    @Override
    public String toString() {
        return "PaintingTask: paint " + whatToPaint + " " + color;
    }
}
