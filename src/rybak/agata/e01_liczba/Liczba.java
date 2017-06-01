package rybak.agata.e01_liczba;

/**
 * Created by asus on 2017-02-10.
 */
public class Liczba {
    private int liczba;

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        if(liczba >= 0 && liczba <= 100)
        {
            this.liczba = liczba;
        }
        else
        {
            //System.out.println("Podano liczbe spoza przedzialu");
            this.liczba = 0;
        }
    }

    public Liczba() {

    };

    public Liczba(int liczba) {
        setLiczba(liczba);
    }

    @Override
    public String toString() {

        String[] jednosci = {"zero","jeden", "dwa", "trzy", "cztery", "piec", "szesc", "siedem", "osiem","dziewiec"};
        String[] nastki = {"dziesiec", "jedenascie", "dwanascie", "trzynascie", "czternascie", "pietnascie", "szesnascie", "siedemnascie", "osiemnascie","dziewietnascie"};
        String[] dziesiatki = {"dwadziescia", "trzydziesci", "czterdziesci", "piecdziesiat", "szescdziesiat", "siedemdziesiat", "osiemdziesiat", "dziewiecdziesiat"};

        if(liczba < 10)
        {
            return jednosci[liczba];
        }
        else if(liczba >= 10 && liczba < 20)
        {
            int nascie = liczba%10;
            return nastki[nascie];
        }
        else if(liczba == 100)
        {
            return "sto";
        }
        else
        {
            int jedno = liczba%10;
            int dzies = liczba/10;
            return dziesiatki[dzies - 2] + " " + jednosci[jedno];
        }
    }
}
