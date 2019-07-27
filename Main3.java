package exam;

import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int size = 10;
        int interval = 100;

        try {
            System.out.println(Arrays.toString(div(size, interval)));
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
            System.out.println("Rozmiar musi być dodatni");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Granica musi być dodatnia");
        }
    }

    static int[] div(int size, int interval) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            do {
                randomNumbers[i] = r.nextInt(interval + 1);
            } while (randomNumbers[i] % 2 != 0 || randomNumbers[i] % 3 == 0);

        }
        return randomNumbers;
    }
}

/* W pliku Main3.java umieść metodę o sygnaturze static int[] div(int size, int interval).

Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu [1 - interval].
Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
Ilość elementów w tablicy ma być równa parametrowi size.
Tablica nie może zawierać pustych elementów. (pamiętaj że domyślna wartość w tablicy dla typu int to 0)
Przykład dla size = 4 oraz interval = 20

        Scanner scan = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wylosować?");
        int number = scan.nextInt();
        int[] randomNumbers = new int[number];
        for (int i = 0; i < randomNumbers.length; i++) {
            Random r = new Random();
            randomNumbers[i] = r.nextInt(101);
        }

        Arrays.sort(randomNumbers);
        return randomNumbers;

 */