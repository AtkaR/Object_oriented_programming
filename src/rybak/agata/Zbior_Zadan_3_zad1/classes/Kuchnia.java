package rybak.agata.Zbior_Zadan_3_zad1.classes;

import rybak.agata.Zbior_Zadan_3_zad1.enums.KuchniaWyposazenie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by asus on 2017-03-14.
 */
public class Kuchnia extends Pokoj {
    private Set<KuchniaWyposazenie> urzadzenia;

    public Set<KuchniaWyposazenie> getUrzadzenia() {
        return urzadzenia;
    }

    public void setUrzadzenia(Set<KuchniaWyposazenie> urzadzenia) {

        //tak sprawdzisz czy kolekcja items2 ma w sobie tylko te elementy ktore sa w kolekcji items
        //komentujemy to bo odkad mamy kolekcje obiekto KuchniaWyposazenie nie ma mozliwosci dodac czegos innego
        //Set<KuchniaWyposazenie> items = new HashSet<>(Arrays.asList(KuchniaWyposazenie.values()));
        //Set<KuchniaWyposazenie> items2 = new HashSet<>(urzadzenia);
        //items2.retainAll(items); //w items2 zostawic co sie powtarza rowniez w items
        //if (items2.size() == urzadzenia.size())
        //{
            this.urzadzenia = urzadzenia;
        //}
    }

    public Kuchnia(double powierzchnia, String kolor_scian, String rodzaj_podlogi, Set<KuchniaWyposazenie> kuchniaWyposazenie) {
        super(powierzchnia, kolor_scian, rodzaj_podlogi);
        urzadzenia = kuchniaWyposazenie;
    }
}
