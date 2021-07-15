package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student andrey = new Student();
        andrey.setSurname("Yarmolenko");
        andrey.setName("Andrey");
        andrey.setPatronymic("Aleksandrovich");
        andrey.setGroup("511-e");
        andrey.setDateOfAdmission("01-09-2019");
        System.out.println(andrey.getSurname());
        System.out.println(andrey.getName());
        System.out.println(andrey.getPatronymic());
        System.out.println(andrey.getGroup());
        System.out.println(andrey.getDateOfAdmission());
    }
}
