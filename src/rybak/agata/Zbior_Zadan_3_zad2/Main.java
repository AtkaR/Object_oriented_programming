package rybak.agata.Zbior_Zadan_3_zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by asus on 2017-03-14.
 */
public class Main {
    public static void main(String[] args) {
        List<Pokoj> pokoje = new ArrayList<>();
        Collections.addAll(pokoje,
                new Pokoj(10,2300, 50, true, null),
                new Pokoj(20,3300, 50, false, null),
                new PokojNowozency(10,2300, 50, true, null, 3, true),
                new PokojNowozency(10,2300, 50, true, null, 6, true),
                new PokojZwierzeta(10,2300, 50, true, null, "male"),
                new PokojZwierzeta(10,2300, 50, true, null, "srednie")
                );
        Hotel hotel = new Hotel("MOTEL","LONDON", pokoje);

        hotel.getPokoje().entrySet().forEach(System.out::println);
    }
}
