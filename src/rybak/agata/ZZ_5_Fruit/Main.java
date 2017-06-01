package rybak.agata.ZZ_5_Fruit;

/**
 * Created by asus on 2017-03-17.
 */
public class Main {

    public static double whichGreater (Fruit fr1, Fruit fr2)
    {
        if(fr1.actualPrice() > fr2.actualPrice())
        {
            return fr1.actualPrice();
        }
        else
        {
            return fr2.actualPrice();
        }
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        System.out.println(f1);
        System.out.println("The value of the product is: " + f1.actualPrice());

        System.out.println();

        Fruit f2 = new Fruit();
        System.out.println(f2);
        System.out.println("The value of the product is: " + f2.actualPrice());

        System.out.println();
        System.out.println("Total price of the product of greater value: " + whichGreater(f1,f2));
    }
}
