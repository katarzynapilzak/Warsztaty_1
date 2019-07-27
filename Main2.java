package exam;

public class Main2 {

    public static void main(String[] args) {
        String str = "Siała baba mak, nie wiedziała jak";
        int length = 3;
        try {
            System.out.println(shorten(str, length));
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Brak napisu");
        }

    }

    static String shorten(String str, int length) {
        String subText = str.substring(0, length);
        return subText;
    }
}



/* W pliku Main2.java umieść metodę o sygnaturze static String shorten(String str, int length).

Uzupełnij ciało metody tak, by dla otrzymanego napisu zwracała jego skrót o ilości znaków podanych w parametrze length.
Przykład dla napisu Naucz się programować od podstaw oraz ilości znaków 2 otrzymamy Na.

 */