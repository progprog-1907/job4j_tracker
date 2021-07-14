package ru.job4j.tracker;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("The current date: " + currentDate);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("The current date: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Current date and time after formatting: " + currentDateTimeFormat);
    }
}
