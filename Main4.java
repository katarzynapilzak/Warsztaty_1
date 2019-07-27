package com.company;

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        String input = "2D10+1";
        kostka(input);
    }

    static void kostka(String input) {

        int liczbaScian;
        int liczbaRzutow;
        int modyfikator;

        String[] arrSplit = input.split("D");
        if (arrSplit[0].length() == 0) {
            liczbaRzutow = 1;
        } else {
            liczbaRzutow = Integer.valueOf(arrSplit[0]);
        }

        String[] rightSide = arrSplit[1].split("[-,+]");
        liczbaScian = Integer.valueOf(rightSide[0]);
        if (rightSide[1].length() == 0) {
            modyfikator = 0;
        } else {
            if (!input.contains("+")) {
                modyfikator = -1 * Integer.valueOf(rightSide[1]);
            } else {
                modyfikator = Integer.valueOf(rightSide[1]);
            }
        }

        System.out.println(losowanie(liczbaScian, liczbaRzutow, modyfikator));
    }

    static int losowanie(int liczbaScian, int liczbaRzutow, int modyfikator) {
        int wynik = 0;
        for (int i = 0; i < liczbaRzutow; i++) {
            Random r = new Random();
            int wynik1 = r.nextInt(liczbaScian);
            int wynik2 = wynik1 + 1; //liczby na kostkach są od 2
            //System.out.println(wynik2);
            wynik = wynik + wynik2;
        }
        wynik = wynik + modyfikator;
        return wynik;
    }

}

/* Kostka do gry
W grach planszowych i papierowych RPG używa się wielu rodzajów kostek do gry, nie tylko tych
dobrze znanych, sześciennych. Jedną z popularniejszych kości jest np. kostka dziesięciościenna, a
nawet stuścienna!
Ponieważ w grach kośćmi rzuca się często, pisanie za każdym razem np. "rzuć dwiema kostkami
dziesięciościennymi, a do wyniku dodaj 20", byłoby żmudne, czasochłonne i marnowałoby ogromne
ilości papieru.
W takich sytuacjach używa się kodu skracającego polecenie np.:
"rzuć 2D10+20".
Kod takiej kostki wygląda następująco:
xDy+z
gdzie:
y – rodzaj kostek, których należy użyć (np. D6, D10),
x – liczba rzutów kośćmi (jeśli rzucamy raz, ten parametr jest pomijalny),
z – (opcjonalnie) liczba, którą należy dodać (lub odjąć) do wyniku rzutów.
Przykłady:
2D10+10 – 2 rzuty D10, do wyniku dodaj 10,
D6 – zwykły rzut kostką sześcienną,
2D3 – rzut dwiema kostkami trójściennymi,
D12-1 – rzut kością D12, od wyniku odejmij 1.

Napisz funkcję, która:
1. przyjmie w parametrze taki kod w postaci String,
2. rozpozna wszystkie dane wejściowe:
rodzaj kostki,
liczbę rzutów,
mody kator,
3. wykona symulację rzutów i zwróci wynik.
Typy kostek występujące w grach:
D3, D4, D6, D8, D10, D12, D20, D100.
 */