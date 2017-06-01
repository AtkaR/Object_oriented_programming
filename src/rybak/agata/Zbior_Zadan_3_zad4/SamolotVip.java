package rybak.agata.Zbior_Zadan_3_zad4;

/**
 * Created by asus on 2017-03-15.
 */
public class SamolotVip extends Samolot {
    private int rangaPasazerow;
    private static double maxPredkosc = 900;

    public int getRangaPasazerow() {
        return rangaPasazerow;
    }

    public void setRangaPasazerow(int rangaPasazerow) {
        if(rangaPasazerow == 1 || rangaPasazerow == 2 || rangaPasazerow == 3)
        {
            this.rangaPasazerow = rangaPasazerow;
        }
        else
        {
            this.rangaPasazerow = 3;
        }
    }

    public SamolotVip(String nazwa, double sredniaPredkosc, int rangaPasazerow) {
        super(nazwa, sredniaPredkosc);
        this.rangaPasazerow = rangaPasazerow;
    }

    @Override
    public double obliczSredniCzasPrzelotu() {
        double predkoscPrzelotu = 0;
        if(rangaPasazerow == 1)
        {
            predkoscPrzelotu = maxPredkosc;
        }
        else if(rangaPasazerow == 2)
        {
            predkoscPrzelotu = 0.95 * maxPredkosc;
        }
        else
        {
            predkoscPrzelotu = 0.92 * maxPredkosc;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "SamolotVip{" +
                "rangaPasazerow=" + rangaPasazerow +
                '}';
    }
}
