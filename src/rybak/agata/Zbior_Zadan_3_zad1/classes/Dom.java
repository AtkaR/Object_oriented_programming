package rybak.agata.Zbior_Zadan_3_zad1.classes;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by asus on 2017-03-14.
 */
public class Dom implements Podatek{
    private Set<Pokoj> pomieszczenia;

    public Set<Pokoj> getPomieszczenia() {
        return pomieszczenia;
    }

    public void setPomieszczenia(Set<Pokoj> pomieszczenia) {
        this.pomieszczenia = null;

        int ileLazienek = 0;
        int ileKuchni = 0;

        for(Pokoj p : pomieszczenia)
        {
            if (p instanceof Kuchnia)
            {
                ileKuchni++;
            }
            else if (p instanceof Lazienka)
            {
                ileLazienek++;
            }
        }

        if (ileKuchni == 1 && ileLazienek == 2) {
            this.pomieszczenia = pomieszczenia;
        }

    }

    public double powierzchniaUzytkowaDomu()
    {
        return pomieszczenia.stream().collect(Collectors.summarizingDouble(Pokoj::getPowierzchnia)).getSum();
    }

    private double powierzchniaKuchnia()
    {
        return pomieszczenia.stream().filter(p -> p instanceof Kuchnia).collect(Collectors.summarizingDouble(Pokoj::getPowierzchnia)).getSum();
    }
    private double powierzchniaLazienka()
    {
        return pomieszczenia.stream().filter(p -> p instanceof Lazienka).collect(Collectors.summarizingDouble(Pokoj::getPowierzchnia)).getSum();
    }

    @Override
    public double obliczPodatek() {
        return Podatek.cenaZaMetr * (powierzchniaUzytkowaDomu() - powierzchniaKuchnia() - powierzchniaLazienka());
    }
}
