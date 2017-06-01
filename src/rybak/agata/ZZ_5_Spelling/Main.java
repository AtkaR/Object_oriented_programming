package rybak.agata.ZZ_5_Spelling;

/**
 * Created by asus on 2017-03-17.
 */
public class Main {
    public static void main(String[] args) {
        Sentence s = new Sentence("nap.txt");
        if (s.check(new String[]{"agata","krzysiek"}))
        {
            System.out.println("OK");
        }
        System.out.println(s);
    }
}
