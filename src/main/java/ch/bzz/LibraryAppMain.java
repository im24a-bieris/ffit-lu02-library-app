package ch.bzz;

import java.util.Scanner;

public class LibraryAppMain {

    private static final Book BOOK_1 = new Book(1, "978-3-8362-9544-4", "Java ist auch eine Insel", "Christian Ullenboom", 2023);
    private static final Book BOOK_2 = new Book(2, "978-3-658-43573-8", "Grundkurs Java", "Dietmar Abts", 2024);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String eingabe = scanner.nextLine();

            if (eingabe.equals("quit")) {
                break;
            } else if (eingabe.equals("help")) {
                System.out.println("Verfügbare Befehle: help, quit, listBooks");
            } else if (eingabe.equals("listBooks")) {
                System.out.println(BOOK_1.getTitle());
                System.out.println(BOOK_2.getTitle());
            } else {
                System.out.println("Befehl nicht erkannt: " + eingabe);
            }
        }
    }
}