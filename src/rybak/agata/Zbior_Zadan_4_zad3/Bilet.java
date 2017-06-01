package rybak.agata.Zbior_Zadan_4_zad3;

/**
 * Created by asus on 2017-03-17.
 */
public class Bilet {
    private String wjazd;
    private String wyjazd;
    private boolean czyUlgowy;

    public String getWjazd() {
        return wjazd;
    }

    public void setWjazd(String wjazd) {
        if(wjazd.matches("[0-9]{2}:[0-9]{2}"))
        {
            this.wjazd = wjazd;
        }
        else
        {
            this.wjazd = "00:00";
        }
    }

    public String getWyjazd() {
        return wyjazd;
    }

    public void setWyjazd(String wyjazd) {
        if(wyjazd.matches("[0-9]{2}:[0-9]{2}"))
        {
            this.wyjazd = wyjazd;
        }
        else
        {
            this.wyjazd = "00:30";
        }
    }

    public boolean isCzyUlgowy() {
        return czyUlgowy;
    }

    public void setCzyUlgowy(boolean czyUlgowy) {
        this.czyUlgowy = czyUlgowy;
    }

    public Bilet(String wjazd, String wyjazd, boolean czyUlgowy) {
        setWjazd(wjazd);
        setWyjazd(wyjazd);
        setCzyUlgowy(czyUlgowy);
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "wjazd='" + wjazd + '\'' +
                ", wyjazd='" + wyjazd + '\'' +
                ", czyUlgowy=" + czyUlgowy +
                '}';
    }
}
