package rybak.agata.ZZ_5_Number;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by asus on 2017-03-17.
 */
public class Overview {
    private Set<Number> overviewSet;

    public Overview()
    {
        overviewSet = new TreeSet<>((k1,k2) -> (k2.numberOf1() - k1.numberOf1()));
        overviewSet.add(new Number(24));
        overviewSet.add(new Number(13));
        overviewSet.add(new Number(5));
        overviewSet.add(new Number(15));
        overviewSet.add(new Number(7));
        //overviewSet.forEach(o -> {System.out.println(o);});
    }

    public int total0()
    {
        //double sum = overviewSet.stream().reduce((acc, d) -> (acc + d)).get();
        int sum = overviewSet.stream().map(x -> x.numberOf0()).reduce((acc, d)-> (acc + d)).get();
        return sum;
    }

    /*public void toMap()
    {
        Map<Number, Integer> map = overviewSet.stream().collect(Collectors.toMap(d -> d.get(), d -> d.getWysokosc()));
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        String sep = "";
        for (Number n : overviewSet) {
            sep = "   ";
            sb.append(n.toString()).append(sep);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Overview)) return false;

        Overview overview = (Overview) o;

        return overviewSet != null ? overviewSet.equals(overview.overviewSet) : overview.overviewSet == null;
    }

    @Override
    public int hashCode() {
        return overviewSet != null ? overviewSet.hashCode() : 0;
    }
}
