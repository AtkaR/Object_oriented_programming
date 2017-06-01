package rybak.agata.Zbior_Zadan_3_zad3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by asus on 2017-03-15.
 */
public class Liczba implements Konwersja {
    private String liczba;

    public String getLiczba() {
        return liczba;
    }

    public void setLiczba(String liczba) {
        this.liczba = liczba;
    }

    public Liczba(String liczba) {
        this.liczba = liczba;
    }

    @Override
    public String napis() {
        double a = Double.parseDouble(liczba);
        /*NumberFormat formatter = new DecimalFormat("0.######E0");
        return formatter.format(a);*/
        return String.format("%6.5e",a);
    }

    @Override
    public int rzeczywista() {
        if(liczba.contains("."))
        {
            String[] nap = liczba.split("\\.", -1);
            String nap2 = nap[1];
            return Integer.parseInt(nap[1]);
        }
        else
        {
            System.out.println("Liczba nie posiada czesci ulamkowej!");
            return 0;
        }
    }

    @Override
    public double rzeczywista2() {
        double calosc = Double.parseDouble(liczba);
        double calkowite = (int)calosc;
        return calosc - calkowite;
    }
}
