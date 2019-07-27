package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
            zgaduj();
    }

    static void zgaduj() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Zgadnij liczbę:");
        int guess = 0;

        Random r = new Random();
        int wynikLosowania = r.nextInt(101);

        while (true) {

            try {
                guess = scan.nextInt();
            } catch (NumberFormatException | InputMismatchException ex) {
                System.out.println("To nie jest liczba!");
                scan.next();
            }

            if (guess < wynikLosowania) {
                System.out.println("Za mało!");
            } else if (guess > wynikLosowania) {
                System.out.println("Za dużo!");
            } else {
                System.out.println("Zgadłeś!");
                break;
            }
        }
    }
}

/* Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100.
Następnie:
1. wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
2. sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To
nie jest liczba", po czym wrócić do pkt. 1;
3. jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za
mało!", po czym wrócić do pkt. 1;
4. jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za
dużo!", po czym wrócić do pkt. 1;
5. jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!",
po czym zakończyć działanie programu.

 */