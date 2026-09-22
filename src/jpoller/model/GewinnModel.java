package jpoller.model;
import java.util.Random;

public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;
    private static final Random RANDOM = new Random();

    public GewinnModel() {
        this.gesamtPunkte = 30;
    }

    public int getGesamtPunkte() {
        return this.gesamtPunkte;
    }

    public int getComputerZahl() {
        return this.computerZahl;
    }

    public int getRundenErgebnis() {
        return this.rundenErgebnis;
    }

    public void berechneComputerZahl() {
        this.computerZahl = RANDOM.nextInt(1,10);
    }

    public void berechneRunde(int sz) {
        this.spielerZahl = sz;
        this.berechneComputerZahl();
        if(sz == this.computerZahl) {
            this.gesamtPunkte += 20;
        } else if(sz == this.computerZahl - 1 || sz == this.computerZahl + 1) {
            this.gesamtPunkte += 5;
        } else {
            this.gesamtPunkte -= 10;
        }
    }
}
