package rybak.agata.Zbior_Zadan_3_zad2;

import java.util.List;

/**
 * Created by asus on 2017-03-14.
 */
public class PokojNowozency extends Pokoj {
    private int butelki_szampana;
    private boolean czy_sniadanie_do_lozka;
    private static double cena_szampan = 200;
    private static double cena_serwis = 20;

    public int getButelki_szampana() {
        return butelki_szampana;
    }

    public void setButelki_szampana(int butelki_szampana) {
        this.butelki_szampana = butelki_szampana;
    }

    public boolean isCzy_sniadanie_do_lozka() {
        return czy_sniadanie_do_lozka;
    }

    public void setCzy_sniadanie_do_lozka(boolean czy_sniadanie_do_lozka) {
        this.czy_sniadanie_do_lozka = czy_sniadanie_do_lozka;
    }

    public PokojNowozency(int ilosc_osob, double powierzchnia, double cena_doba, boolean czy_wolny, List<String> wyposazenie, int butelki_szampana, boolean czy_sniadanie_do_lozka) {
        super(ilosc_osob, powierzchnia, cena_doba, czy_wolny, wyposazenie);
        setButelki_szampana(butelki_szampana);
        setCzy_sniadanie_do_lozka(czy_sniadanie_do_lozka);
    }

    @Override
    public double obliczCenePokoju() {
        if(czy_sniadanie_do_lozka == true)
            return super.obliczCenePokoju() + cena_szampan * butelki_szampana + cena_serwis;
        else
            return super.obliczCenePokoju() + cena_szampan * butelki_szampana;
    }

    @Override
    public String toString() {
        return "PokojNowozency{" +
                "butelki_szampana=" + butelki_szampana +
                ", czy_sniadanie_do_lozka=" + czy_sniadanie_do_lozka +
                '}';
    }
}
