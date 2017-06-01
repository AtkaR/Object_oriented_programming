package rybak.agata.Zbior_Zadan_3_zad1.classes;

/**
 * Created by asus on 2017-03-14.
 */
public class Dach {
    private String rodzaj_materialu;
    private String kolor;

    public String getRodzaj_materialu() {
        return rodzaj_materialu;
    }

    public void setRodzaj_materialu(String rodzaj_materialu) {
        if(rodzaj_materialu.equals("gont") || rodzaj_materialu.equals("dachowka ceramiczna") || rodzaj_materialu.equals("blacha"))
        {
            this.rodzaj_materialu = rodzaj_materialu;
        }
        else
        {
            this.rodzaj_materialu = "gont";
        }
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        if(kolor.equals("czarny") || kolor.equals("grafitowy") || kolor.equals("czerwony"))
        {
            this.kolor = kolor;
        }
        else
        {
            this.kolor = "czarny";
        }
    }

    public Dach(String rodzaj_materialu, String kolor) {
        setRodzaj_materialu(rodzaj_materialu);
        setKolor(kolor);
    }

    @Override
    public String toString() {
        return "Dach{" +
                "rodzaj_materialu='" + rodzaj_materialu + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dach)) return false;

        Dach dach = (Dach) o;

        if (rodzaj_materialu != null ? !rodzaj_materialu.equals(dach.rodzaj_materialu) : dach.rodzaj_materialu != null)
            return false;
        return kolor != null ? kolor.equals(dach.kolor) : dach.kolor == null;
    }

    @Override
    public int hashCode() {
        int result = rodzaj_materialu != null ? rodzaj_materialu.hashCode() : 0;
        result = 31 * result + (kolor != null ? kolor.hashCode() : 0);
        return result;
    }
}
