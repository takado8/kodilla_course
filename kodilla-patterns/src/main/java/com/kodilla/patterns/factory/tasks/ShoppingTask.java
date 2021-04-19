package com.kodilla.patterns.factory.tasks;

public class ShoppingTask extends TaskAbs {
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        super(taskName);
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println(toString() + " executed");
        setExecuted(true);
    }

    @Override
    public String toString() {
        return "ShoppingTask: Buy " + quantity + " of " + whatToBuy;
    }
}
