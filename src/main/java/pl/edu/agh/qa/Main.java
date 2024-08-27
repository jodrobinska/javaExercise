package pl.edu.agh.qa;

import animals.Orangutan;

public class Main {

    public static void main(String[] args) {

        Orangutan czarnyOrangutan = new Orangutan();
        System.out.println("Przed zmianą: " + czarnyOrangutan.getKolor());
        czarnyOrangutan.setKolor("biały");
        System.out.println("Po zmianie: " + czarnyOrangutan.getKolor());

        Orangutan brazowyOrangutan = new Orangutan(2, "brazowy");
        czarnyOrangutan.skacz();
        brazowyOrangutan.skacz();
    }
}
