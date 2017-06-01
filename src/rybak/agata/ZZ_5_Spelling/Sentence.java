package rybak.agata.ZZ_5_Spelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by asus on 2017-03-17.
 */
public class Sentence implements Spelling {
    private StringBuilder string = new StringBuilder();

    public Sentence(String str)
    {
        try {
            File file = new File(str);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                string.append(validation(sc.nextLine()));
            }

            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "string=" + string +
                '}';
    }

    public String validation(String string)
    {
        StringBuilder good = new StringBuilder();

        for (int i = 0; i < string.length(); i++)
        {
            String letter = String.valueOf(string.charAt(i));
            if (letter.matches("[A-Za-z',;.\\s-]"))
            {
                good.append(letter);
            }
        }
        return good.toString();
    }

    @Override
    public boolean check(String[] tab) {
        //System.out.println("_" + string.toString() +"_");
        String[] ntab = string.toString().split("[',;.\\s\\n-]");
        Set<String> set1 = new TreeSet<>(Arrays.asList(ntab));
        System.out.println("SET1: " + set1);
        Set<String> set2 = new TreeSet<>(Arrays.asList(tab));
        System.out.println("SET2: " + set2);
        return set1.equals(set2);
    }
}
