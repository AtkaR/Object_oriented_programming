package rybak.agata.Zbior_Zadan_3_zad2;

import java.util.List;

/**
 * Created by asus on 2017-03-14.
 */
public class PokojZwierzeta extends Pokoj{
    private String rodzaj_legowiska;
    private static double cena_male = 5;
    private static double cena_srednie = 10;
    private static double cena_duze = 15;

    public String getRodzaj_legowiska() {
        return rodzaj_legowiska;
    }

    public void setRodzaj_legowiska(String rodzaj_legowiska) {
        if(rodzaj_legowiska.equals("male") || rodzaj_legowiska.equals("srednie") || rodzaj_legowiska.equals("duze"))
        {
            this.rodzaj_legowiska = rodzaj_legowiska;
        }
        else
            this.rodzaj_legowiska = "male";
    }

    public PokojZwierzeta(int ilosc_osob, double powierzchnia, double cena_doba, boolean czy_wolny, List<String> wyposazenie, String rodzaj_legowiska) {
        super(ilosc_osob, powierzchnia, cena_doba, czy_wolny, wyposazenie);
        setRodzaj_legowiska(rodzaj_legowiska);
    }

    @Override
    public double obliczCenePokoju() {
        if(rodzaj_legowiska.equals("male"))
        {
            return super.obliczCenePokoju() + cena_male;
        }
        else if(rodzaj_legowiska.equals("srednie"))
        {
            return super.obliczCenePokoju() + cena_srednie;
        }
        else
            return  super.obliczCenePokoju() + cena_duze;
    }

    @Override
    public String toString() {
        return "PokojZwierzeta{" +
                "rodzaj_legowiska='" + rodzaj_legowiska + '\'' +
                '}';
    }
}
