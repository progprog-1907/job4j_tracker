package ru.job4j.tracker;

public class StartUI {

    public void init(Input scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = scanner.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(scanner, tracker);
            } else if (select == 1) {
                StartUI.showItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(scanner, tracker);
            } else if (select == 3){
                StartUI.deleteItem(scanner, tracker);
            }else if (select == 4) {
                StartUI.findItemById(scanner, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(scanner, tracker);
            } else if (select == 6){
                System.out.println("Exit Program");
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    public static void showItem(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (tracker.findAll().length > 0) {
            for (Item item: items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void replaceItem(Input scanner, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int mutableId = scanner.askInt("Enter id: ");
        String newName = scanner.askStr("Enter new name: ");
        Item item = new Item(newName);
        if (tracker.replace(mutableId, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void deleteItem(Input scanner, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = scanner.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
    }

    public static void findItemById(Input scanner, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        int id = scanner.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void findItemByName(Input scanner, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = scanner.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        /*Вызов не статического метода. Необходимо обратиться через объект. */
        new StartUI().init(input, tracker);
    }
}