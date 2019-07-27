package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        try {
            zgaduj();
        } catch (InputMismatchException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void zgaduj() throws Exception {
        int min = 0;
        int max = 1000;
        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max. 10 próbach");
        Scanner scan = new Scanner(System.in);
        int mojaLiczba = scan.nextInt();
        if (mojaLiczba < min || mojaLiczba > max) {
            throw new Exception ("Podaj liczbę między 0 a 1000!");
        }

        int i = 0;
        while (i < 10) {
            int guess = (max - min) / 2 + min;
            System.out.println("Zgaduję:" + guess);
            if (guess < mojaLiczba) {
                System.out.println("Za mało!");
                min = guess;
            } else if (guess > mojaLiczba) {
                System.out.println("Za dużo!");
                max = guess;
            } else if (guess == mojaLiczba) {
                System.out.println("Wygrałem!");
                break;
            } else {
                System.out.println("Nie oszukuj!");
                break;
            }
        }

    }

}

/* Odwróćmy teraz sytuację z warsztatu "Gra w zgadywanie liczb": to użytkownik pomyśli sobie liczbę z
zakresu 1-1000, a komputer będzie zgadywał i zrobi to maksymalnie w 10 ruchach (pod warunkiem,
że gracz nie będzie oszukiwał).
Zadaniem gracza będzie udzielanie odpowiedzi "więcej", "mniej", "tra łeś".

 */