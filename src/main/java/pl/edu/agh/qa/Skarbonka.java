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

}
