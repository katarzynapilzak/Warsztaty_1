package exam;

public class Main1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        try {
            System.out.println(rectangle(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static int rectangle(int a, int b) throws Exception {
        int pole = a * b;
        if (a <= 0 || b <= 0) {
            throw new Exception("Boki muszą być większe od 0");
        }
        return pole;
    }
}

/* W pliku Main1.java umieść metodę o sygnaturze static int rectangle(int a, int b).

Uzupełnij ciało metody tak, by obliczyła i zwróciła pole prostokąta.

 */