package rybak.agata.Zbior_Zadan_4_zad1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by asus on 2017-03-16.
 */
public class Dzialanie {
    private String dzialanie;
    private double a;
    private double b;

    public String getDzialanie() {
        return dzialanie;
    }

    public void setDzialanie(String dzialanie) {
        if(dzialanie.equals("SUMA") || dzialanie.equals("ODEJMOWANIE") || dzialanie.equals("MNOZENIE") || dzialanie.equals("DZIELENIE"))
        {
            this.dzialanie = dzialanie;
        }
        else
        {
            this.dzialanie = "SUMA";
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a >= 4.54 && a <= 10.12)
        {
            this.a = a;
        }
        else
        {
            Random rnd = new Random();
            a = 4.54 + 5.58 * rnd.nextDouble();
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b >= 4.54 && b <= 10.12)
        {
            this.b = b;
        }
        else
        {
            Random rnd = new Random();
            b = 4.54 + 5.58 * rnd.nextDouble();
        }
    }

    public Dzialanie()
    {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj nazwe dzialania: ");
            dzialanie = sc.nextLine();
            System.out.println("Podaj pierwsza liczbe: ");
            a = Double.parseDouble(sc.nextLine());
            System.out.println("Podaj druga liczbe: ");
            b = Double.parseDouble(sc.nextLine());
        }while(!((dzialanie.equals("SUMA")
                || dzialanie.equals("ODEJMOWANIE")
                || dzialanie.equals("MNOZENIE")
                || dzialanie.equals("DZIELENIE"))
                && (a >= 4.54 && a <= 10.12)
                &&(b >= 4.54 && b <= 10.12))
        );
    }

    public Dzialanie(String dzialanie, double a, double b) {
        setDzialanie(dzialanie);
        setA(a);
        setB(b);
    }

    public double oblicz()
    {
        if(dzialanie.equals("SUMA"))
        {
            return a + b;
        }
        else if (dzialanie.equals("ODEJMOWANIE"))
        {
            return a - b;
        }
        else if(dzialanie.equals("MNOZENIE"))
        {
            return a * b;
        }
        else
        {
            return a / b;
        }
    }

    @Override
    public String toString() {
        return "Dzialanie{" +
                "dzialanie='" + dzialanie + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
