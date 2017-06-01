package rybak.agata.Zbior_Zadan_3_zad2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017-03-14.
 */
public class Pokoj {
    private int ilosc_osob;
    private double powierzchnia;
    private double cena_doba;
    private boolean czy_wolny;
    private List<String> wyposazenie;
    private static double cena_osoba = 20;
    private static double cena_powierzchnia = 5;

    public int getIlosc_osob() {
        return ilosc_osob;
    }

    public void setIlosc_osob(int ilosc_osob) {
        this.ilosc_osob = ilosc_osob;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public double getCena_doba() {
        return cena_doba;
    }

    public void setCena_doba(double cena_doba) {
        this.cena_doba = cena_doba;
    }

    public boolean isCzy_wolny() {
        return czy_wolny;
    }

    public void setCzy_wolny(boolean czy_wolny) {
        this.czy_wolny = czy_wolny;
    }

    public List<String> getWyposazenie() {
        return wyposazenie;
    }

    public void setWyposazenie(List<String> wyposazenie) {
        this.wyposazenie = wyposazenie;
    }

    public Pokoj(int ilosc_osob, double powierzchnia, double cena_doba, boolean czy_wolny, List<String> wyposazenie) {
        setIlosc_osob(ilosc_osob);
        setPowierzchnia(powierzchnia);
        setCena_doba(cena_doba);
        setCzy_wolny(czy_wolny);
        wyposazenie = new ArrayList<>();
    }

    public double obliczCenePokoju()
    {
        return cena_powierzchnia * powierzchnia + cena_osoba * ilosc_osob;
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "ilosc_osob=" + ilosc_osob +
                ", powierzchnia=" + powierzchnia +
                ", cena_doba=" + cena_doba +
                ", czy_wolny=" + czy_wolny +
                ", wyposazenie=" + wyposazenie +
                '}';
    }
}
