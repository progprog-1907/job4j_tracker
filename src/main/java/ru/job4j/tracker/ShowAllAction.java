package ru.job4j.tracker;

public class ShowAllAction implements UserAction {

    private final Output output;

    public ShowAllAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Show All items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show All items ===");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        return true;
    }
}
