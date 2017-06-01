package rybak.agata.Zbior_Zadan_3_zad2;

import java.util.*;

/**
 * Created by asus on 2017-03-14.
 */
public class Hotel {
    private String nazwa;
    private String miejscwosc;
    private Map<String, List<Pokoj>> pokoje = new HashMap<>();

  public Hotel() {
  }

    public Hotel(String nazwa, String miejscwosc, List<Pokoj> pokojeLista) {
        setNazwa(nazwa);
        setMiejscwosc(miejscwosc);
        setPokoje(pokojeLista);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiejscwosc() {
        return miejscwosc;
    }

    public void setMiejscwosc(String miejscwosc) {
        this.miejscwosc = miejscwosc;
    }

    public Map<String, List<Pokoj>> getPokoje() {
        return pokoje;
    }

    //utrudniamy nam sprawe a ulatwiamy zycie osobie, ktora bedzie wprowadzac dane
    public void setPokoje(List<Pokoj> pokojeLista) {
        pokojeLista.forEach(p -> {
            if (pokoje.containsKey(p.getClass().getCanonicalName()))
            {
                pokoje.get(p.getClass().getCanonicalName()).add(p);
            }
            else
            {
                //nie ma jeszcze klucza - trzeba dodac klucz i pierwszy element do listy dla tego klucza
                pokoje.put(p.getClass().getCanonicalName(), new ArrayList<>(Arrays.asList(new Pokoj[]{p})));
            }
        });
    }
}
