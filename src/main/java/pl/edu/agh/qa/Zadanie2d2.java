package pl.edu.agh.qa;

public class Zadanie2d2 {
    public static void main(String[] args) {

        System.out.println(podajPozycjeSwitch('c'));
        System.out.println(podajPozycjeIf('a'));
    }

    static int podajPozycjeSwitch(char litera) {
        switch (litera) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            default:
                return 0;
        }
    }

    static int podajPozycjeIf(char literka) {
        if (literka == 'a') {
            return 1;
        } else if (literka == 'b') {
            return 2;
        } else if (literka == 'c') {
            return 3;
        } else {
            return 0;
        }
    }
}
