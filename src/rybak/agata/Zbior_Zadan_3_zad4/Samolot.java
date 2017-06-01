package rybak.agata.Zbior_Zadan_3_zad4;

/**
 * Created by asus on 2017-03-15.
 */
public abstract class Samolot {
    private String nazwa;
    private double sredniaPredkosc;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getSredniaPredkosc() {
        return sredniaPredkosc;
    }

    public void setSredniaPredkosc(double sredniaPredkosc) {
        this.sredniaPredkosc = sredniaPredkosc;
    }

    public Samolot(String nazwa, double sredniaPredkosc) {
        this.nazwa = nazwa;
        this.sredniaPredkosc = sredniaPredkosc;
    }

    public abstract double obliczSredniCzasPrzelotu();

    @Override
    public String toString() {
        return "Samolot{" +
                "nazwa='" + nazwa + '\'' +
                ", sredniaPredkosc=" + sredniaPredkosc +
                '}';
    }
}
