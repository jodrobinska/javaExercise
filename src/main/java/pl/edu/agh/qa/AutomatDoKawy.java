package pl.edu.agh.qa;

public class AutomatDoKawy {
    public void sprzedajKawe() {
        TerminalPlatnosci terminalPlatnosci = new TerminalPlatnosci();
        terminalPlatnosci.przyjmijPlatnosc();
        System.out.println("Wydano kawę");
    }
}
