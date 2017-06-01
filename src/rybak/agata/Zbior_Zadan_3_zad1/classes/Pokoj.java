package rybak.agata.Zbior_Zadan_3_zad1.classes;

/**
 * Created by asus on 2017-03-14.
 */
public class Pokoj {
    private double powierzchnia;
    private String kolor_scian;
    private String rodzaj_podlogi;

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        if(powierzchnia > 4)
        {
            this.powierzchnia = powierzchnia;
        }
        else
        {
            this.powierzchnia = 5;
        }
    }

    public String getKolor_scian() {
        return kolor_scian;
    }

    public void setKolor_scian(String kolor_scian) {
        if(kolor_scian.equals("bialy") || kolor_scian.equals("bezowy") || kolor_scian.equals("rozowy"))
        {
            this.kolor_scian = kolor_scian;
        }
        else
        {
            this.kolor_scian = "bialy";
        }
    }

    public String getRodzaj_podlogi() {
        return rodzaj_podlogi;
    }

    public void setRodzaj_podlogi(String rodzaj_podlogi) {
        if(rodzaj_podlogi.equals("drewniana") || rodzaj_podlogi.equals("panele") || rodzaj_podlogi.equals("gres"))
        {
            this.rodzaj_podlogi = rodzaj_podlogi;
        }
        else
        {
            this.rodzaj_podlogi = "drewniana";
        }
    }

    public Pokoj(double powierzchnia, String kolor_scian, String rodzaj_podlogi) {
        setPowierzchnia(powierzchnia);
        setKolor_scian(kolor_scian);
        setRodzaj_podlogi(rodzaj_podlogi);
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "powierzchnia=" + powierzchnia +
                ", kolor_scian='" + kolor_scian + '\'' +
                ", rodzaj_podlogi='" + rodzaj_podlogi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokoj)) return false;

        Pokoj pokoj = (Pokoj) o;

        if (Double.compare(pokoj.powierzchnia, powierzchnia) != 0) return false;
        if (!kolor_scian.equals(pokoj.kolor_scian)) return false;
        return rodzaj_podlogi.equals(pokoj.rodzaj_podlogi);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(powierzchnia);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + kolor_scian.hashCode();
        result = 31 * result + rodzaj_podlogi.hashCode();
        return result;
    }
}
