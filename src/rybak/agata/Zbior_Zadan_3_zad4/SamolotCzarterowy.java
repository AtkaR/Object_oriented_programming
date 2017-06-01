package rybak.agata.Zbior_Zadan_3_zad4;

/**
 * Created by asus on 2017-03-15.
 */
public class SamolotCzarterowy extends Samolot{
    private int aktualnaLiczbaPasazerow;
    private static int maxLiczbaPasazerow = 500;

    public int getAktualnaLiczbaPasazerow() {
        return aktualnaLiczbaPasazerow;
    }

    public void setAktualnaLiczbaPasazerow(int aktualnaLiczbaPasazerow) {
        this.aktualnaLiczbaPasazerow = aktualnaLiczbaPasazerow;
    }

    public static int getMaxLiczbaPasazerow() {
        return maxLiczbaPasazerow;
    }

    public SamolotCzarterowy(String nazwa, double sredniaPredkosc, int aktualnaLiczbaPasazerow) {
        super(nazwa, sredniaPredkosc);
        this.aktualnaLiczbaPasazerow = aktualnaLiczbaPasazerow;
    }

    @Override
    public double obliczSredniCzasPrzelotu() {
        if(aktualnaLiczbaPasazerow > (0.75 * maxLiczbaPasazerow))
        {
            double nowaPredkosc = 0.9 * getSredniaPredkosc();
            //setSredniaPredkosc(nowaPredkosc);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "SamolotCzarterowy{" +
                "aktualnaLiczbaPasazerow=" + aktualnaLiczbaPasazerow +
                '}';
    }
}
