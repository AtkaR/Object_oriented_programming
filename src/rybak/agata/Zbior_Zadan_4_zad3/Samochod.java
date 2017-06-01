package rybak.agata.Zbior_Zadan_4_zad3;

/**
 * Created by asus on 2017-03-17.
 */
public class Samochod {
    private String nr_rejestracyjny;
    private Bilet bilet;

    public String getNr_rejestracyjny() {
        return nr_rejestracyjny;
    }

    public void setNr_rejestracyjny(String nr_rejestracyjny) {
        if(nr_rejestracyjny.matches("[A-Z]{2,3}\\s[A-Z|0-9]{5}"))
        {
            this.nr_rejestracyjny = nr_rejestracyjny;
        }
    }

    public Samochod(String nr_rejestracyjny, Bilet bilet) {
        setNr_rejestracyjny(nr_rejestracyjny);
        this.bilet = bilet;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "nr_rejestracyjny='" + nr_rejestracyjny + '\'' +
                ", bilet=" + bilet +
                '}';
    }
}
