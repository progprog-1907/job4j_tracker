package ru.job4j.tracker;

public class ShowAllAction implements UserAction {

    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show All items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show All items ===");
        Item[] items = tracker.findAll();
        if (tracker.findAll().length > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
