package rybak.agata.e01_Tablica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asus on 2017-02-24.
 */
public class Tablica {
    private double[][] tab;

    public double[][] getTab() {
        return tab;
    }

    public void setTab(double[][] tab) {
        this.tab = tab;
    }

    public Tablica(String plik1, String plik2) {

        try {
            File tab1 = new File(plik1);
            Scanner sc1 = new Scanner(tab1);

            File tab2 = new File(plik2);
            Scanner sc2 = new Scanner(tab2);

            String[] linia1 = sc1.nextLine().split(" ");
            int w1 = Integer.parseInt(linia1[0]);
            int k1 = Integer.parseInt(linia1[1]);

            String[] linia2 = sc2.nextLine().split(" ");
            int w2 = Integer.parseInt(linia2[0]);
            int k2 = Integer.parseInt(linia2[1]);

            System.out.println("Wiersze: " + w1 + " " + w2);
            System.out.println("Kolumny: " + k1 + " " + k2);

            int w = w1 + w2;
            int k;

            if (k1 > k2) {
                k = k1;
                tab = new double[w][k];

                for (int i = 0; i < w; i++) {
                    for (int j = 0; j < k; j++) {
                        tab[i][j] = 0;
                    }
                }

                for (int i = 0; i < w - w2; i++) {
                    for (int j = 0; j < k1; j++) {
                        tab[i][j] = sc1.nextDouble();
                    }
                }

                for (int i = w - w1; i < w; i++) {
                    for (int j = 0; j < k2; j++) {
                        tab[i][j] = sc2.nextDouble();
                    }
                }
            }
            else
            {
                    k = k2;
                    tab = new double[w][k];
            }

            sc1.close();
            sc2.close();

            } catch(FileNotFoundException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            setTab(tab);
        }

    @Override
    public String toString() {
        return "Tablica{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }
}

