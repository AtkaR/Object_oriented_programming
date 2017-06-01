package rybak.agata.ZZ_5_Window;

/**
 * Created by asus on 2017-03-17.
 */
public class Main {
    public static void main(String[] args) {

        Window o = new Window(3.0,2.5,0.1);
        System.out.println("Glass area: " + o.glassArea());
        System.out.println("Frame area: " + o.frameArea());
        System.out.println("Price for window: " + o.windowPrice());
    }
}
