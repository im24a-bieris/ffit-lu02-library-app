package ch.bzz;

import java.util.Scanner;

public class LibraryAppMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String eingabe = scanner.nextLine();

            if (eingabe.equals("quit")) {
                break;
            } else if (eingabe.equals("help")) {
                System.out.println("Verfügbare Befehle: help, quit");
            } else {
                System.out.println("Befehl nicht erkannt: " + eingabe);
            }
        }
    }
}