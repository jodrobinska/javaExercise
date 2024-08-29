package pl.edu.agh.qa;

import java.math.BigDecimal;

public class Z3d1 {
    public static void main(String[] args) {
        Skarbonka skarbonka = new Skarbonka("Samochod", new BigDecimal(20000));
        skarbonka.dodajKwote(new BigDecimal("10000"));
        skarbonka.dodajKwote(new BigDecimal("15000"));

        Skarbonka skarbonka2 = new Skarbonka(new BigDecimal(300), "Rower", new BigDecimal(2000));
        skarbonka2.dodajKwote(new BigDecimal("1000"));
        skarbonka2.dodajKwote(new BigDecimal("700"));
    }
}
