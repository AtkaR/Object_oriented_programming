package rybak.agata.Zbior_Zadan_4_zad2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by asus on 2017-03-16.
 */
public class Globus {
    private Set<Miejscowosc> miejscowosci = new HashSet<>();

    public Set<Miejscowosc> getMiejscowosci() {
        return miejscowosci;
    }

    public Globus(Set<Miejscowosc> miejscowosci) {
        this.miejscowosci = miejscowosci;
    }

    public void znajdzNajdalejNa()
    {
        for (int i = 0; i < miejscowosci.size(); i++)
        {

        }
    }

    @Override
    public String toString() {
        return "Globus{" +
                "miejscowosci=" + miejscowosci +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Globus)) return false;

        Globus globus = (Globus) o;

        return miejscowosci != null ? miejscowosci.equals(globus.miejscowosci) : globus.miejscowosci == null;
    }

    @Override
    public int hashCode() {
        return miejscowosci != null ? miejscowosci.hashCode() : 0;
    }
}
