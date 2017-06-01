package rybak.agata.ZZ_8_Encryption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by asus on 2017-04-14.
 */
public class Main {
    public static String getPassword()
    {
        String password = "";
        try {
            File file = new File("password.txt");
            Scanner sc = new Scanner(file);

            password = sc.nextLine();
            System.out.println(password);

            sc.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return password;
    }

    public static String getUpperKey()
    {
        StringBuilder upperKey = new StringBuilder();
        try {
            File file = new File("UpperKey.txt");
            Scanner sc = new Scanner(file);

            String word = sc.nextLine();
            System.out.println(word);
            for (int i = 0; i < word.length(); i++)
            {
                //System.out.println(word.charAt(i));
                if (Character.isUpperCase(word.charAt(i)) && onlyOnce(word, word.charAt(i)) )
                {
                    upperKey.append(word.charAt(i));
                    System.out.println(upperKey.toString());
                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return upperKey.toString();
    }

    public static boolean onlyOnce(String word, char letter)
    {
        int counter = 0;
        for (int i = 0; i < word.length(); i++)
        {
            if(letter == word.charAt(i))
            {
                counter++;
            }
        }
        if(counter == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String password = getPassword();
        String upperKey = getUpperKey();
        System.out.println(upperKey);

    }
}
