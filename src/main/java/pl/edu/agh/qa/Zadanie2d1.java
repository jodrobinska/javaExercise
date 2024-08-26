package pl.edu.agh.qa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zadanie2d1 {

    public static void main(String[] args) {

        System.out.println(sprawdz(2,1));
        System.out.println(sprawdz(1,2));
    }

    static boolean sprawdz(int x, int y) {

        return x > y;
    }
}