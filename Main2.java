package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        try {
            lotto();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("to ten wyjątek");
        }
    }

    static void lotto() {

        Scanner scan = new Scanner(System.in);
        int[] guesses = new int[6];
        for (int i = 0; i < guesses.length; i++) {
            System.out.println("Zgadnij liczbę " + (i + 1) + ":");
            while (true) {
                int a = scan.nextInt();
                if (czyLiczbaJuzByla(a, guesses)) {
                    System.out.println("Ta liczba już była! Podaj inną:");
                } else if (a < 1 || a > 49) {
                    System.out.println("Niewłaściwa liczba! Podaj liczbę od 1 do 49:");
                } else {
                    guesses[i] = a;
                    break;
                }
            }
        }
        Arrays.sort(guesses);
        System.out.println("Twoje liczby: " + Arrays.toString(guesses));

        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        Collections.shuffle(Arrays.asList(arr));

        Integer[] liczbyLotto = Arrays.copyOfRange(arr, 0, 6);
        Arrays.sort(liczbyLotto);

        System.out.println("Liczby wylosowane przez Lotto: " + Arrays.toString(liczbyLotto));

        int counter = 0;
        for (int i = 0; i < guesses.length; i++) {
            for (int j = 0; j < liczbyLotto.length; j++) {
                if (guesses[i] == liczbyLotto[j]) {
                    counter++;
                }
            }
        }

        if (counter < 3) {
            System.out.println("Tym razem nie wygrałeś.");
        } else {
            System.out.println("Trafiłeś " + counter + " liczb.");
        }


    }

    static boolean czyLiczbaJuzByla(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }
}

/* Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49.
Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest tra enie 3, 4, 5 lub 6
poprawnych liczb.
Napisz program, który:
zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
czy wprowadzony ciąg znaków jest poprawną liczbą,
czy użytkownik nie wpisał tej liczby już poprzednio,
czy liczba należy do zakresu 1-49,
po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
poinformuje gracza, czy tra ł przynajmniej "trójkę".

 */