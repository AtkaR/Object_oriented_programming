package rybak.agata.ZZ_5_Number;

/**
 * Created by asus on 2017-03-17.
 */
public class Main {
    public static void main(String[] args) {
        Number n = new Number(12);
        System.out.println(n.numberOfBits());
        System.out.println();
        n.binaryArray();
        System.out.println();
        System.out.println("Number of 1: " + n.numberOf1());

        Overview o = new Overview();
        System.out.println(o);
        o.toString();
        System.out.println(o.total0());

    }
}
