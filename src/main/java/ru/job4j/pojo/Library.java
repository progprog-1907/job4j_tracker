package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 466);
        Book book2 = new Book("The Complete Reference", 1500);
        Book book3 = new Book("Head first java", 749);
        Book book4 = new Book("Effective java", 413);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            System.out.println("Title of the " + (index + 1) + " book " + books[index].getName()
                    + ", pages in this book " + books[index].getNumberOfPages());
        }

        Book empty = books[0];
        books[0] = books[3];
        books[3] = empty;

        for (int index = 0; index < books.length; index++) {
            System.out.println("Title of the " + (index + 1) + " book " + books[index].getName()
                    + ", pages in this book " + books[index].getNumberOfPages());
        }

        for (Book book : books) {
            if (book.getName().equals("Clean Code")) {
                System.out.println("A book titled " + book.getName());
            }
        }
    }
}
