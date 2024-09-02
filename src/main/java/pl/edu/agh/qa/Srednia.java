package pl.edu.agh.qa;

import java.math.BigDecimal;
import java.math.MathContext;

public class Srednia {
    public BigDecimal obliczSrednia (BigDecimal pierwsza, BigDecimal druga, BigDecimal trzecia, int liczbaMiejscPoPrzecinku) {
        BigDecimal suma = pierwsza;
        suma = suma.add(druga);
        suma = suma.add(trzecia);
        int precyzja = liczbaMiejscPoPrzecinku + 1;
        BigDecimal liczbaLiczb = new BigDecimal(3);
        return suma.divide(liczbaLiczb, new MathContext(precyzja));
    }
    }
