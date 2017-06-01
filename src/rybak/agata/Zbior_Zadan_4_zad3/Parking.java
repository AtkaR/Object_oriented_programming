package rybak.agata.Zbior_Zadan_4_zad3;

import rybak.agata.Zbior_Zadan_3_zad4.Samolot;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by asus on 2017-03-17.
 */
public class Parking {
    private Set<Samochod> samochod = new HashSet<>();
    private static int maxIloscMiejsc = 10;
    private static double cenaZaGodzine = 3.5;

    public Set<Samochod> getSamochod() {
        return samochod;
    }

    public void setSamochod(Set<Samochod> samochod) {
        this.samochod = samochod;
    }

    public Parking(Set<Samochod> samochod) {
        this.samochod = samochod;
    }
}
