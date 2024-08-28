package pl.edu.agh.qa;

import java.math.BigDecimal;

public class Skarbonka {
    BigDecimal zaoszczedzonaKwota = new BigDecimal(0);
    String celOszczedzania;
    BigDecimal kwotaDoCelu;

    public Skarbonka(String celOszczedzania, BigDecimal kwotaDoCelu) {
        this.celOszczedzania = celOszczedzania;
        this.kwotaDoCelu = kwotaDoCelu;
    }

    public Skarbonka(BigDecimal zaoszczedzonaKwota, String celOszczedzania, BigDecimal kwotaDoCelu) {
        this.zaoszczedzonaKwota = zaoszczedzonaKwota;
        this.celOszczedzania = celOszczedzania;
        this.kwotaDoCelu = kwotaDoCelu;
    }

    public void dodajKwote(BigDecimal kwota) {
        zaoszczedzonaKwota = zaoszczedzonaKwota.add(kwota);
        if (zaoszczedzonaKwota.compareTo(kwotaDoCelu) >= 0) {
            System.out.println("Udało się zrealizować cel oszczedzania: " + celOszczedzania);
        }
    }

}
