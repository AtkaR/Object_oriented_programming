package rybak.agata.ZZ_5_Fruit;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by asus on 2017-03-17.
 */
public class Fruit {
    private String name;
    private double price;
    private double weight;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.equals("Kiwi") || name.equals("Banana") || name.equals("Peach"))
        {
            this.name = name;
        }
        else
        {
            this.name = "Watermelon";
        }
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(name.equals("Kiwi") && price >= 1.2 && price <= 4.5)
        {
            this.price = price;
        }
        else if (price >= 0.4 && price <= 2.3)
        {
            this.price = price;
        }
        else
        {
            this.price = 2.0;
        }
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if (weight > 0)
        {
            this.weight = weight;
        }
        else
        {
            this.weight = 2.5;
        }
    }

    public Fruit ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the fruit: ");
        String name = sc.nextLine();
        setName(name);
        System.out.println("Enter the price per kilogram: ");
        double price = Double.parseDouble(sc.nextLine());
        setPrice(price);
        System.out.println("Enter the weight in kilograms: ");
        double weight = Double.parseDouble(sc.nextLine());
        setWeight(weight);
    }

    public double actualPrice()
    {
        double value = price * weight;
        value = Math.round(value * 100);
        value = value/100;
        return value;
    }
}
