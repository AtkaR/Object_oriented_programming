package rybak.agata.ZZ_5_Container;

import java.util.Scanner;

/**
 * Created by asus on 2017-03-17.
 */
public class Container {
    private String color;
    private double width;
    private double length;
    private double height;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {

        for (int i = 0; i < color.length(); i++)
        {
            String letter = String.valueOf(color.charAt(i));
            String first = String.valueOf(color.charAt(0));
            if (first.matches("[A-Z]") && letter.matches("[a-z]"))
            {
                this.color = color;
            }
            else
            {
                this.color = "Green";
            }
        }
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width > 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 6.0;
        }
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length > 0)
        {
            this.length = length;
        }
        else
        {
            this.length = 3.0;
        }
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if(height > 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 2.0;
        }
    }

    public Container(String color, double width, double length, double height)
    {
        setColor(color);
        setWidth(width);
        setLength(length);
        setHeight(height);
    }

    public Container()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify the color of the container: ");
        String color = sc.nextLine();
        setColor(color);
        System.out.println("Enter a width: ");
        double width = Double.parseDouble(sc.nextLine());
        setWidth(width);
        System.out.println("Enter a length: ");
        double length = Double.parseDouble(sc.nextLine());
        setLength(length);
        System.out.println("Enter a height: ");
        double height = Double.parseDouble(sc.nextLine());
        setHeight(height);
    }

    public double volume()
    {
        return height * length * width;
    }

    public boolean isBigEnough(double vol_sub)
    {
        if(vol_sub <= volume())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "'" + "color: " + color  +
                ", width: " + width +
                ", length: " + length +
                ", height: " + height + "'";
    }
}
