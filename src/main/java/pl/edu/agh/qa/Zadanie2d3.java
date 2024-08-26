package pl.edu.agh.qa;

public class Zadanie2d3 {

    public static void main(String[] args) {

        wyswietlFor(10);
        wyswietlWhile(10);
        wyswietlDoWhile(10);
    }

    static void wyswietlFor(int zmienna) {
        for (int i = zmienna; i < 20; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void wyswietlWhile(int zmienna) {
        while (zmienna < 20) {
            System.out.println(zmienna);
            zmienna ++;
        }
        System.out.println();
    }

    static void wyswietlDoWhile(int zmienna) {
        if (zmienna >= 20) {
            return;
        }
        do {
            System.out.println(zmienna);
            zmienna++;
        } while (zmienna < 20);
    }
}
