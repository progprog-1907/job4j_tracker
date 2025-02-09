package ru.job4j.oop;

public class Local {
    private String name = "Petr";

    public void getFullName() {
        final String surname = "Arsentev";

        class FullName {
            public static final String PATRONYMIC = "Empty";

            public void printFullName() {
                System.out.println(name + " " + surname);
                System.out.println(PATRONYMIC);
            }
        }

        FullName fullName = new FullName();
        fullName.printFullName();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.getFullName();
    }
}
