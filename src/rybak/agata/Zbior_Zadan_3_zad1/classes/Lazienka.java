package rybak.agata.Zbior_Zadan_3_zad1.classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by asus on 2017-03-14.
 */
public class Lazienka extends Pokoj {
    private double pow_lustra;
    private double dl_wanny;
    private Set<String> akcesoria;

    public double getPow_lustra() {
        return pow_lustra;
    }

    public void setPow_lustra(double pow_lustra) {
        this.pow_lustra = pow_lustra;
    }

    public double getDl_wanny() {
        return dl_wanny;
    }

    public void setDl_wanny(double dl_wanny) {
        this.dl_wanny = dl_wanny;
    }

    public Set<String> getAkcesoria() {
        return akcesoria;
    }

    public void setAkcesoria(Set<String> akcesoria) {
        this.akcesoria = akcesoria;
    }

    public Lazienka(double powierzchnia, String kolor_scian, String rodzaj_podlogi, double pow_lustra, double dl_wanny, Set<String> akcesoria) {
        super(powierzchnia, kolor_scian, rodzaj_podlogi);
        setPow_lustra(pow_lustra);
        setDl_wanny(dl_wanny);
        akcesoria = new HashSet<String>();
    }

}
