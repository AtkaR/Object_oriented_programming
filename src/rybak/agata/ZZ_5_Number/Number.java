package rybak.agata.ZZ_5_Number;

import java.util.Random;

/**
 * Created by asus on 2017-03-17.
 */
public class Number {
    private int decimal_value;

    public int getDecimal_value()
    {
        return decimal_value;
    }

    public void setDecimal_value(int decimal_value)
    {
        if(decimal_value >= 0)
        {
            this.decimal_value = decimal_value;
        }
        else
        {
            this.decimal_value = 5;
        }
    }

    public Number(int decimal_value)
    {
        setDecimal_value(decimal_value);
    }

    public Number()
    {
        Random rnd = new Random();
        decimal_value = 1 + rnd.nextInt(1000);
    }

    public int numberOfBits()
    {
        String binary = Integer.toString(decimal_value,2);
        return binary.length();
    }

    public int[] binaryArray()
    {
        String binary = Integer.toString(decimal_value,2);
        //System.out.println(binary);
        int[] tab = new int[binary.length()];
        //System.out.println(tab.length);
        for(int i = 0 ; i < binary.length(); i++)
        {
            tab[i] = Character.getNumericValue(binary.charAt(i));
            //System.out.println(tab[i]);
        }
        return tab;
    }

    public int numberOf1()
    {
        int counter = 0;
        int[] tab = binaryArray();
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] == 1)
            {
                counter++;
            }
        }
        return counter;
    }

    public int numberOf0()
    {
        int counter = 0;
        int[] tab = binaryArray();
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] == 0)
            {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Number{" +
                "decimal_value=" + decimal_value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return false;

        Number number = (Number) o;

        return decimal_value == number.decimal_value;
    }

    @Override
    public int hashCode() {
        return decimal_value;
    }
}
